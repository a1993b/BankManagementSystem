package com.bms.util;

import com.bms.common.ResponseHeaderCode;
import com.bms.common.ResponseHeaderMessage;
import com.bms.model.ResponseHeader;
import com.bms.model.StandardResponse;

public class ResponseGenerator {

	public static StandardResponse generateResponse(ResponseHeaderCode code,ResponseHeaderMessage message,Object body){
		StandardResponse standardResponse= new StandardResponse();
		ResponseHeader header= new ResponseHeader();
		header.setCode(code.getCode());
		header.setMessage(message.getMessage());
		standardResponse.setResponseHeader(header);
		standardResponse.setObject(body);
		
		return standardResponse;
		
	}
}
