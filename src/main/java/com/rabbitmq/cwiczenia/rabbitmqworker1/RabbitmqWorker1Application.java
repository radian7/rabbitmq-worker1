package com.rabbitmq.cwiczenia.rabbitmqworker1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan({ "com.rabbitmq.cwiczenia.service.SendService", "com.rabbitmq.cwiczenia.rabbitmqworker1.RabbitmqWorker1Application" })
public class RabbitmqWorker1Application {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqWorker1Application.class, args);

	}

}
