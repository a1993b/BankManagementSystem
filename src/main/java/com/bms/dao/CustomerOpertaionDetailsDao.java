package com.bms.dao;

import com.bms.entities.CustomerDetail;
import com.bms.exception.BMSException;
import com.bms.model.Customer;

public interface CustomerOpertaionDetailsDao {

	public CustomerDetail isValidUser(CustomerDetail data) throws BMSException;
	
	public void enrollCustomerDetails(CustomerDetail data) throws BMSException;
}
