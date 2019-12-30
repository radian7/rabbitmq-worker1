package pl.santanderl.adapter.rpc.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.cwiczenia.rabbitmqworker1.service.KlientService;

import pl.santanderl.adapter.mq.amqp.AmqpProducentConfig;
import pl.santanderl.adapter.mq.amqp.AmqpPublisher;

import com.rabbitmq.cwiczenia.rabbitmqworker1.dto.KlientDTO;
import com.rabbitmq.cwiczenia.rabbitmqworker1.dto.KlientRequestDTO;;

@Controller
public class CKKServerAmqpQ {

	private static final Logger logger = LogManager.getLogger(CKKServerAmqpQ.class);
	
	private ObjectMapper objectMapper = new ObjectMapper(); 
	
	@Autowired
	KlientService klientService;

	@Autowired
	AmqpProducentConfig prodConf;
	
	@RabbitListener(queues = "q.test")
	public Message process(Message request) {
		logger.info("process: {}", request.toString());
		
		KlientRequestDTO bodyRequest = new KlientRequestDTO();
		try {
			bodyRequest = objectMapper.readValue(request.getBody(), KlientRequestDTO.class);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		//AmqpProducentConfig.Flow flow = prodConf.getFlows().stream().filter(x -> x.flowId.equals(mess.getHeader().getFlowId())).findFirst().get();
		AmqpProducentConfig.Flow flow = prodConf.getFlows().stream().filter(x -> x.getFlowId().equals("rpcTEstFlowReq")).findFirst().get();
		
		MessageProperties responseMessProperties = new MessageProperties();
		responseMessProperties.getHeaders().put("api_version", "1.0.4");
		responseMessProperties.setAppId("AdiTest1");
		responseMessProperties.getHeaders().put("app_version", "Test1");
		responseMessProperties.setContentEncoding("UTF-8");
		responseMessProperties.setContentType(MessageProperties.CONTENT_TYPE_JSON);
		responseMessProperties.setDeliveryMode(MessageDeliveryMode.valueOf(flow.getDeliveryMode()));
		if (!flow.getMessageExpiration().isEmpty())
			responseMessProperties.setExpiration(flow.getMessageExpiration()); // 1000 to sekunda
		responseMessProperties.getHeaders().put("flow_id", "rpcTEstFlowRes");
		//responseMessProperties.setReplyTo(flow.replyTo);

		responseMessProperties.setTimestamp(new Date());
		responseMessProperties.getHeaders().put("user_id", "Adi");
		
		KlientDTO kl = klientService.findByKlKod(  bodyRequest.getKodCKK() );
		
		//String topicMessage = JSON.toJSONString(sendMsg, JsonFilter.filter);
		//KlientRequestDTO bRequest = objectMapper.readValue(request.getBody(), KlientRequestDTO.class);
		String bodyResponse = "";
		try {
			bodyResponse = objectMapper.writeValueAsString(kl);
		}
		catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		Message responseMessage = new Message(bodyResponse.getBytes(), responseMessProperties);
		logger.info("Return: {}", responseMessage.toString());
		return responseMessage;
	}
	
}
