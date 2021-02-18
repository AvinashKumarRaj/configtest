package com.test.demo.request;


public class InputRequest {

	private RequestData requestData;

	public RequestData getRequestData() {
		return requestData;
	}

	public void setRequestData(RequestData requestData) {
		this.requestData = requestData;
	}

	@Override
	public String toString() {
		return "InputRequest [requestData=" + requestData + "]";
	}

	
}
