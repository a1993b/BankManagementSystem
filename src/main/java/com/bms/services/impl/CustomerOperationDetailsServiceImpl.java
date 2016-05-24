package com.bms.services.impl;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import com.bms.common.ErrorCode;
import com.bms.dao.CustomerOpertaionDetailsDao;
import com.bms.entities.CustomerDetail;
import com.bms.exception.BMSException;
import com.bms.model.Customer;
import com.bms.services.CustomerOperationDetailsService;
import com.bms.util.ObjectConversionFactory;

public class CustomerOperationDetailsServiceImpl implements CustomerOperationDetailsService {

	@Autowired
	CustomerOpertaionDetailsDao customerOperationDetailsDao;
	
	@Override
	public Customer isValidUser(Customer data) throws BMSException {
	
		CustomerDetail customerDetail= new CustomerDetail();
		customerDetail.setCustomerId(data.getCustomerID());
		customerDetail.setCustomerPassword(data.getPassword());
		CustomerDetail detail=customerOperationDetailsDao.isValidUser(customerDetail);
		if(detail==null){
			CustomerDetail customer=customerOperationDetailsDao.getCustomerDetails(customerDetail);
			if(customer == null){
				throw new BMSException(ErrorCode.INVALID_RECORD);
			}
			else if(customer.getAttemptCount()!=3) {
				customer.setAttemptCount(customer.getAttemptCount()+1);
				customerOperationDetailsDao.updateCustomerAttemptCount(customer);
				//throw new BMSException(ErrorCode.INCORRECT_PASSWORD);
			}
			else{
				throw new BMSException(ErrorCode.MAX_COUNT_EXCEEDED);
			}
		}
		Customer customer= customerEntityToObjectConversion(detail);
		return customer;
	}

	@Override
	public void enrollCustomerDetails(Customer data) throws BMSException {
		CustomerDetail customerDetail= customerObjectToEntityConversion(data);
		customerOperationDetailsDao.enrollCustomerDetails(customerDetail);
		
	}
	
	
	private CustomerDetail customerObjectToEntityConversion(Customer data){
		CustomerDetail customerDetail= new CustomerDetail();
		SecureRandom rnd = new SecureRandom();
		final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

		StringBuilder sb = new StringBuilder(8);
		for( int i = 0; i <8; i++ ) 
			sb.append( AB.charAt( rnd.nextInt(AB.length()) ));
		String password=sb.toString();
		Random ran= new Random();
		String customerId= String.valueOf(10000000 + ran.nextInt(90000000));
		customerDetail.setCustomerId(customerId);
		customerDetail.setCustomerPassword(password);
		customerDetail.setAge(data.getAge());
		customerDetail.setAlternateNumber(data.getAlternateMobileNumber());
		customerDetail.setCurrent_zipCode(data.getCurrentZipCode());
		customerDetail.setCurrentAddressLine1(data.getCurrentAddressLine1());
		customerDetail.setCurrentAddressLine2(data.getCurrentAddressLine2());
		customerDetail.setCurrentCity(data.getCurrentCity());
		customerDetail.setCurrentCountry(data.getCurrentCountry());
		customerDetail.setCurrentState(data.getCurrentState());
		customerDetail.setDob(data.getDob());
		customerDetail.setFatherName(data.getFatherName());
		customerDetail.setFirstName(data.getFirstName());
		customerDetail.setGender(data.getGender());
		customerDetail.setLastName(data.getLastName());
		customerDetail.setMobileNumber(data.getMobileNumber());
		customerDetail.setNationality(data.getNationality());
		customerDetail.setPanNumber(data.getPanNumebr());
		customerDetail.setPermanent_zipCode(data.getPermanentZipCode());
		customerDetail.setPermanentAddressLine1(data.getPermanentAddressLine1());
		customerDetail.setPermanentAddressLine2(data.getPermanentAddressLine2());
		customerDetail.setPermanentCity(data.getPermanentCity());
		customerDetail.setPermanentCountry(data.getPermanentCountry());
		customerDetail.setPermanentState(data.getPermanentState());
		customerDetail.setStatus("AWAPR");
		customerDetail.setAttemptCount(-1);

		
		return customerDetail; 
		
	}
	
	private Customer customerEntityToObjectConversion(CustomerDetail detail) throws BMSException{
		if(detail == null){
			throw new BMSException(ErrorCode.INCORRECT_PASSWORD);
		}
		Customer customer= new Customer();
		customer.setCustomerID(detail.getCustomerId());
		customer.setPassword(detail.getCustomerPassword());
		customer.setFirstName(detail.getFirstName());
		customer.setLastName(detail.getLastName());
		customer.setAge(detail.getAge());
		customer.setCurrentAddressLine1(detail.getCurrentAddressLine1());
		customer.setCurrentAddressLine2(detail.getCurrentAddressLine2());
		customer.setCurrentCity(detail.getCurrentCity());
		customer.setCurrentState(detail.getCurrentState());
		customer.setCurrentZipCode(detail.getCurrent_zipCode());
		customer.setPermanentAddressLine1(detail.getPermanentAddressLine1());
		customer.setPermanentAddressLine2(detail.getPermanentAddressLine2());
		customer.setPermanentCity(detail.getPermanentCity());
		customer.setPermanentState(detail.getPermanentState());
		customer.setPermanentZipCode(detail.getPermanent_zipCode());
		customer.setMobileNumber(detail.getMobileNumber());
		customer.setAlternateMobileNumber(detail.getAlternateNumber());
		customer.setPanNumebr(detail.getPanNumber());
		customer.setNationality(detail.getNationality());
		customer.setGender(detail.getGender());
		customer.setFatherName(detail.getFatherName());
		customer.setDob(detail.getDob());
		
		return customer;
		
	}


	
}
