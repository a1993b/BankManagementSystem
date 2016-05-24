package com.bms.common;

public enum ErrorCode {
	
	INVALID_RECORD("Invalid Customer ID"),
	SERVICE_UNAVAILABLE("Service is temporary unavailable"),
	INCORRECT_PASSWORD("Incorrect Password"),
	MAX_COUNT_EXCEEDED("Number Of login attempt Exceeded. Please try login after some time");
	
	private String message;
	
	private ErrorCode(String msg){
		message=msg;
	}

	public String getMessage() {
		return message;
	}

	

}
