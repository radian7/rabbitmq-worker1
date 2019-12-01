package com.rabbitmq.cwiczenia.rabbitmqworker1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("prod")
public class Producent {

	@Autowired
	private RabbitTemplate template;

	@Value("${spring.rabbitmq.virtual-host}")
	String vHost;

	// producent.rabbitmq.exchange
	@Value("${producent.rabbitmq.exchange}")
	String ex;
	@Value("${producent.rabbitmq.routing-key}")
	String routingKey;

	@Value("${producent.rabbitmq.api_version}")
	String apiVersion;

	@Value("${producent.rabbitmq.deliveryMode}")
	String deliveryMode;

	@Value("${producent.rabbitmq.messageExpiration}")
	String messageExpiration;

	@Value("${producent.rabbitmq.flow_id}")
	String flowId;

	@Value("${producent.rabbitmq.replyTo}")
	String replyTo;

	private static String readLineByLineJava8(String filePath) {
		StringBuilder contentBuilder = new StringBuilder();
		try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
			stream.forEach(s -> contentBuilder.append(s).append("\n"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contentBuilder.toString();
	}

	// @Scheduled(fixedDelay = 1000, initialDelay = 500)
	public void send(String message) {

		System.out.println(" [x] Send '" + message + "'");

		message = readLineByLineJava8("mess.txt");

		StringBuilder builder = new StringBuilder(message);
		String mes = builder.toString();

		template.convertAndSend(ex, routingKey, mes, m -> {
			m.getMessageProperties().getHeaders().put("api_version", apiVersion);
			m.getMessageProperties().setAppId("AdiTest1");
			m.getMessageProperties().getHeaders().put("app_version", "1.0.1");
			m.getMessageProperties().setContentEncoding("UTF-8");
			m.getMessageProperties().setContentType(MessageProperties.CONTENT_TYPE_JSON);
			m.getMessageProperties().setDeliveryMode(MessageDeliveryMode.valueOf(deliveryMode));
			// m.getMessageProperties().setDeliveryMode(MessageDeliveryMode.NON_PERSISTENT);
			// m.getMessageProperties().setExpiration("1000");
			m.getMessageProperties().getHeaders().put("flow_id", flowId);
			m.getMessageProperties().setReplyTo(replyTo);

			m.getMessageProperties().setTimestamp(new Date());
			m.getMessageProperties().getHeaders().put("user_id", "Adi");

			;
			return m;
		});

		System.out.println("Sended to vHost:" + vHost);
		System.out.println("Sended to ex:" + ex);
		System.out.println("Sended to routingkey:" + routingKey);
		System.out.println("Sended message:" + message);

	}

}
