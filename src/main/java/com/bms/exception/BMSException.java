package com.bms.exception;

import com.bms.common.ErrorCode;

public class BMSException extends Exception{

	private ErrorCode errorCode;

	public BMSException(ErrorCode errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}
	
	
}
