package pl.santanderl.adapter.mq.amqp;

import java.util.Date;


import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pl.santanderl.adapter.mq.*;

@Component
public class AmqpPublisher implements Producer {
	//private static final Logger LOG = LoggerFactory.getLogger(AmqpPublisher.class);
	private static final Logger logger = LogManager.getLogger(AmqpPublisher.class);

	@Autowired
	AmqpProducentConfig prodConf;
	
	@Autowired
	private RabbitTemplate template;

	@Value("${spring.rabbitmq.virtual-host}")
	String vHost;

	
	public void generateTask(Message mess) {
		// LOG.trace("Service Request: {}", mess);
		logger.info("generateTask: {}", mess.getBody().toString());
		
		template.convertAndSend(prodConf.exchange, prodConf.routing_key, mess.getBody(), m -> {
			m.getMessageProperties().getHeaders().put("api_version", "1.0.4");
			m.getMessageProperties().setAppId("AdiTest1");
			m.getMessageProperties().getHeaders().put("app_version", "Test1");
			m.getMessageProperties().setContentEncoding("UTF-8");
			m.getMessageProperties().setContentType(MessageProperties.CONTENT_TYPE_JSON);
			m.getMessageProperties().setDeliveryMode(MessageDeliveryMode.valueOf(prodConf.deliveryMode));
			// m.getMessageProperties().setDeliveryMode(MessageDeliveryMode.NON_PERSISTENT);
			if (!prodConf.messageExpiration.isEmpty())
				m.getMessageProperties().setExpiration(prodConf.messageExpiration); // 1000 to sekunda
			m.getMessageProperties().getHeaders().put("flow_id", prodConf.flowId);
			m.getMessageProperties().setReplyTo(prodConf.replyTo);

			m.getMessageProperties().setTimestamp(new Date());
			m.getMessageProperties().getHeaders().put("user_id", "Adi");

			System.out.println("Sended to vHost:" + vHost);
			System.out.println("Sended to ex:" + prodConf.exchange);
			System.out.println("Sended to routingkey:" + prodConf.routing_key);
			System.out.println("Sended message:" + mess.getBody());
			logger.info("generateTask: Sended to vHost:{}, EX: {}, routingkey: {}", vHost, prodConf.exchange, prodConf.routing_key);
			
			return m;
		});
		
	}

	public void generateEvent(Message mess) {
		//LOG.trace("Service Request: {}", mess);
		//String routingKey = mess.getServiceName() + "." + mess.getServiceAction();
		//template.convertAndSend(pubExchange.getName(), routingKey, mess);
		
	}


}
