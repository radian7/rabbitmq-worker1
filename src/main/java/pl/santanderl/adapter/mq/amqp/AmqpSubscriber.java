
package pl.santanderl.adapter.mq.amqp;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;



import pl.santanderl.adapter.mq.*;


public class AmqpSubscriber {
	//private static final Logger LOG = LoggerFactory.getLogger(AmqpSubscriber.class);

	@Autowired
	Consumer consumer;

	@RabbitListener(queues = "#{eventQueue.name}")
	public void process(Message request) {
		//LOG.trace("Subscribed event: {}", request);
		//LOG.trace("Handled by: {}", consumer.getClass());
		consumer.processEvent(request);
	}
}
