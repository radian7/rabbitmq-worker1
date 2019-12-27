package pl.santanderl.adapter.mq;

public interface Producer {

	public void generateTask(Message mess);
	
	public void generateEvent(Message mess);
	
}
