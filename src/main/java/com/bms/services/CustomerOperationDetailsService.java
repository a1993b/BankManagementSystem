package com.bms.services;

import com.bms.exception.BMSException;
import com.bms.model.Customer;

public interface CustomerOperationDetailsService {

	public Customer isValidUser(Customer data) throws BMSException;
	
	public void enrollCustomerDetails(Customer data) throws BMSException;
}
