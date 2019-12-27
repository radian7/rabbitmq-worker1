
package pl.santanderl.adapter.mq;


public interface Consumer {
	
	public Message processTask(Message mess);
	
	public void processEvent(Message mess);
	
}
