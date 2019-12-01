package com.rabbitmq.cwiczenia.rabbitmqworker1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqWorker1ApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(1, 1, "test1");
	}

}
