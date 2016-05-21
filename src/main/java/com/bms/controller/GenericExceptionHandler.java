package com.bms.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bms.common.ResponseHeaderCode;
import com.bms.common.ResponseHeaderMessage;
import com.bms.exception.BMSException;
import com.bms.model.StandardResponse;
import com.bms.util.ResponseGenerator;

@ControllerAdvice
public class GenericExceptionHandler {

	@ResponseBody
	@ExceptionHandler(BMSException.class)
	public StandardResponse handleBMSException(BMSException bmsException){
		
		return ResponseGenerator.generateResponse(ResponseHeaderCode.FAILURE, ResponseHeaderMessage.FAILURE, bmsException.getErrorCode().getMessage());
		
	}
	
}
