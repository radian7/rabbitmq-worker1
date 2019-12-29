package com.rabbitmq.cwiczenia.rabbitmqworker1;


//import java.util.Arrays;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// , "com.rabbitmq.cwiczenia.rabbitmqworker1.service" 
@SpringBootApplication
//@ComponentScan( "pl.santanderl.adapter.mq.amqp" )
@ComponentScan( { "pl.santanderl.adapter.rpc.rest", "com.rabbitmq.cwiczenia.rabbitmqworker1.service", "com.rabbitmq.cwiczenia.rabbitmqworker1.controller", "com.rabbitmq.cwiczenia.rabbitmqworker1.model", "com.rabbitmq.cwiczenia.rabbitmqworker1.dao", "pl.santanderl.adapter.mq.amqp" } )
public class RabbitmqWorker1Application  {

	//private static final Logger logger = LogManager.getLogger(RabbitmqWorker1Application.class);
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RabbitmqWorker1Application.class, args);
/*
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println("BEAN :: " + beanName);
        }
*/        
	}


	
}
