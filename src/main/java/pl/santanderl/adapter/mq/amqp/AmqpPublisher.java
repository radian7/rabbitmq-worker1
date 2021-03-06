package pl.santanderl.adapter.mq.amqp;

import java.util.Date;


import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pl.santanderl.adapter.mq.*;

@Service
public class AmqpPublisher implements Producer {
	
	private static final Logger logger = LogManager.getLogger(AmqpPublisher.class);

	@Autowired
	AmqpProducentConfig prodConf;
	
	@Autowired
	private RabbitTemplate template;

	@Value("${spring.rabbitmq.virtual-host}")
	String vHost;

	
	public void generateTask(Message mess) {
		
		logger.info("generateTask: {}", mess.getBody().toString());
		
		AmqpProducentConfig.Flow flow = prodConf.getFlows().stream().filter(x -> x.flowId.equals(mess.getHeader().getFlowId())).findFirst().get();
		
		template.convertAndSend(flow.exchange, flow.routing_key, mess.getBody(), m -> {
			m.getMessageProperties().getHeaders().put("api_version", "1.0.4");
			m.getMessageProperties().setAppId("AdiTest1");
			m.getMessageProperties().getHeaders().put("app_version", "Test1");
			m.getMessageProperties().setContentEncoding("UTF-8");
			m.getMessageProperties().setContentType(MessageProperties.CONTENT_TYPE_JSON);
			m.getMessageProperties().setDeliveryMode(MessageDeliveryMode.valueOf(flow.deliveryMode));
			if (!flow.messageExpiration.isEmpty()) {
				m.getMessageProperties().setExpiration(flow.messageExpiration); // 1000 to sekunda
			}
			m.getMessageProperties().getHeaders().put("flow_id", flow.flowId);
			m.getMessageProperties().setReplyTo(flow.replyTo);

			m.getMessageProperties().setTimestamp(new Date());
			m.getMessageProperties().getHeaders().put("user_id", "Adi");


			return m;
		});
		

		
		logger.info("generateTask: Sended to vHost:{}, EX: {}, routingkey: {}", vHost, flow.exchange, flow.routing_key);
		logger.info("Sended message:{}", mess.getBody());
		
	}

	public void generateEvent(Message mess) {
		
		//String routingKey = mess.getServiceName() + "." + mess.getServiceAction();
		//template.convertAndSend(pubExchange.getName(), routingKey, mess);
		
	}

	public Header generateHeader(String flowId) {
		Header header = new Header();
		header.setFlowId(flowId);
		return header;
	}
	
}
