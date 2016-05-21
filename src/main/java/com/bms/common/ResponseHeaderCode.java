package com.bms.common;

public enum ResponseHeaderCode {

	SUCCESS("1000"),
	FAILURE("1001");
	
	private String code;

	private ResponseHeaderCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
	
	
}
