package pl.santanderl.adapter.mq.amqp;

import java.util.ArrayList;
import java.util.List;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "adapter.mq.amqp")
public class AmqpProducentConfig {
	
	List<Flow> flows = new ArrayList<>(); 
	
	public List<Flow> getFlows() {
		return flows;
	}

	public void setFlows(List<Flow> flows) {
		this.flows = flows;
	}

	public static class Flow{
		String exchange;
		
		String routing_key;
		
		String apiVersion;
	
		String deliveryMode;
	
		String messageExpiration;
	
		String flowId;
	
		String replyTo;
		
		public String getExchange() {
			return exchange;
		}
	
		public void setExchange(String exchange) {
			this.exchange = exchange;
		}
	
		public String getRouting() {
			return routing_key;
		}
	
		public void setRouting(String routing) {
			this.routing_key = routing;
		}
	
		public String getRouting_key() {
			return routing_key;
		}
	
		public void setRouting_key(String routing_key) {
			this.routing_key = routing_key;
		}
	
		public String getApiVersion() {
			return apiVersion;
		}
	
		public void setApiVersion(String apiVersion) {
			this.apiVersion = apiVersion;
		}
	
		public String getDeliveryMode() {
			return deliveryMode;
		}
	
		public void setDeliveryMode(String deliveryMode) {
			this.deliveryMode = deliveryMode;
		}
	
		public String getMessageExpiration() {
			return messageExpiration;
		}
	
		public void setMessageExpiration(String messageExpiration) {
			this.messageExpiration = messageExpiration;
		}
	
		public String getFlowId() {
			return flowId;
		}
	
		public void setFlowId(String flowId) {
			this.flowId = flowId;
		}
	
		public String getReplyTo() {
			return replyTo;
		}
	
		public void setReplyTo(String replyTo) {
			this.replyTo = replyTo;
		}
	
	}
	
}
