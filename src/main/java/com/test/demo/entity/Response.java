package com.test.demo.entity;

public class Response {
	
	private String message;
	private boolean status;
	
	public Response(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	public Response() {
		super();
	}

	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Response [message=" + message + ", status=" + status + "]";
	}

	
}
