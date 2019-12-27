package pl.santanderl.adapter.mq;

import java.io.Serializable;

//import lombok.Getter;
//import lombok.Setter;

public class Message  {

	

	public Message(Header header, Object body) {
		super();
		this.header = header;
		this.body = body;
	}
	Header header;
	Object body;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public Object getBody() {
		return body;
	}
	public void setBody(Object body) {
		this.body = body;
	}

}
