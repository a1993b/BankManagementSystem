package com.bms.common;

public enum ResponseHeaderMessage {

	SUCCESS("SUCCESS"),
	FAILURE("FAILURE");
	
	private String message;

	private ResponseHeaderMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	
}
