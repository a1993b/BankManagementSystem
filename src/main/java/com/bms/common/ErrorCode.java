package com.bms.common;

public enum ErrorCode {
	
	INVALID_RECORD("Incorrect ID or password"),
	SERVICE_UNAVAILABLE("Service is temporary unavailable");
	
	private String message;
	
	private ErrorCode(String msg){
		message=msg;
	}

	public String getMessage() {
		return message;
	}

	

}
