package com.bms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bms.common.ResponseHeaderCode;
import com.bms.common.ResponseHeaderMessage;
import com.bms.exception.BMSException;
import com.bms.model.Customer;
import com.bms.model.StandardResponse;
import com.bms.services.CustomerOperationDetailsService;
import com.bms.util.ResponseGenerator;

@Controller
public class BankAppController {

	@Autowired
	CustomerOperationDetailsService customerOperationDetailsService; 
	
	@RequestMapping("/")
	public ModelAndView test(){
		System.out.println("welcome to bnak management system");
		return new ModelAndView("home");
	}
	
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST,produces="application/json")
	public StandardResponse customerAuthentication(@RequestBody Customer data) throws BMSException{
		System.out.println(data);
		Customer customerData=customerOperationDetailsService.isValidUser(data);
		return ResponseGenerator.generateResponse(ResponseHeaderCode.SUCCESS, ResponseHeaderMessage.SUCCESS, customerData);
	}
	
	@ResponseBody
	@RequestMapping(value="/enrollCustomer",method=RequestMethod.POST,produces="application/json")
	public StandardResponse customerEnrolement(@RequestBody Customer data) throws BMSException{
			customerOperationDetailsService.enrollCustomerDetails(data);
		return ResponseGenerator.generateResponse(ResponseHeaderCode.SUCCESS,ResponseHeaderMessage.SUCCESS,null);
		
	}
}
