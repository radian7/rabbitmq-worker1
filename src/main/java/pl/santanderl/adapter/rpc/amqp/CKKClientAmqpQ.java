package pl.santanderl.adapter.rpc.amqp;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.cwiczenia.rabbitmqworker1.dto.KlientRequestDTO;


import pl.santanderl.adapter.mq.amqp.AmqpProducentConfig;
import pl.santanderl.adapter.rpc.Client;

@Service
public class CKKClientAmqpQ implements Client {

	private static final Logger logger = LogManager.getLogger(CKKClientAmqpQ.class);

	private ObjectMapper objectMapper = new ObjectMapper(); 
	
	@Autowired
	AmqpProducentConfig prodConf;
	
	@Autowired
	private RabbitTemplate template;

	@Value("${spring.rabbitmq.virtual-host}")
	String vHost;
	
	public void sendRPC(KlientRequestDTO klientDTO) {

		logger.info("sendRPC, obtaining:{}", klientDTO.getKodCKK());
		
		AmqpProducentConfig.Flow flow = prodConf.getFlows().stream().filter(x -> x.getFlowId().equals("rpcTestFlowReq")).findFirst().get();

		logger.info("sendRPC Finded rpcTestFlowReq" );
		
		MessageProperties requestMessProperties = new MessageProperties();
		requestMessProperties.getHeaders().put("api_version", "1.0.4");
		requestMessProperties.setAppId("AdiTest1");
		requestMessProperties.getHeaders().put("app_version", "Test1");
		requestMessProperties.setContentEncoding("UTF-8");
		requestMessProperties.setContentType(MessageProperties.CONTENT_TYPE_JSON);
		requestMessProperties.setDeliveryMode(MessageDeliveryMode.valueOf(flow.getDeliveryMode()));
		if (!flow.getMessageExpiration().isEmpty())
			requestMessProperties.setExpiration(flow.getMessageExpiration()); // 1000 to sekunda
		requestMessProperties.getHeaders().put("flow_id", "rpcTestFlowReq");
		

		requestMessProperties.setTimestamp(new Date());
		requestMessProperties.getHeaders().put("user_id", "Adi");
		
		
		String requestBody = "";
		try {
			requestBody = objectMapper.writeValueAsString(klientDTO);
		}
		catch (JsonProcessingException e) {
			e.printStackTrace();
			logger.error("Error: {}", e.getMessage());
		}
		
		
		
		Message requestMessage = new Message(requestBody.getBytes(), requestMessProperties);
		
		logger.info("sendRPC: {}", requestMessage.toString());
		
		
		Message responseMessage = template.sendAndReceive(flow.getExchange(), flow.getRouting_key(), requestMessage);
		
		
		logger.info("sendRPC: Sended to vHost:{}, EX: {}, routingkey: {}", vHost, flow.getExchange(), flow.getRouting_key());
		logger.info("sendRPC Sended message:{}", requestMessage.toString());
		
		logger.info("sendRPC, obtainded: {}",  responseMessage.toString());
		
	}
	
}
