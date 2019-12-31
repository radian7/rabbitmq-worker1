
package pl.santanderl.adapter.mq.amqp;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;



import pl.santanderl.adapter.mq.*;


public class AmqpSubscriber {
	

	@Autowired
	Consumer consumer;

	@RabbitListener(queues = "#{eventQueue.name}")
	public void process(Message request) {

		consumer.processEvent(request);
	}
}
