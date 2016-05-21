package com.bms.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bms.common.ErrorCode;
import com.bms.dao.CustomerOpertaionDetailsDao;
import com.bms.entities.CustomerDetail;
import com.bms.exception.BMSException;
import com.bms.model.Customer;

public class CustomerOpertaionDetailsDaoImpl extends SessionFactoryInstanceClass implements CustomerOpertaionDetailsDao{

	@Override
	public CustomerDetail isValidUser(CustomerDetail data) throws BMSException {

		try{
			Query query= getSessionInstance().createQuery("FROM CustomerDetail details WHERE details.customerId= :custID AND details.customerPassword=:password");
			query.setParameter("custID",data.getCustomerId());
			query.setParameter("password",data.getCustomerPassword());
			CustomerDetail customerDetails=(CustomerDetail) query.uniqueResult();
			if(customerDetails== null){
				 throw new BMSException(ErrorCode.INVALID_RECORD);
			}
			
			return customerDetails;
		}
		catch(Exception exception){
			exception.printStackTrace();
			throw new BMSException(ErrorCode.INVALID_RECORD);
		}
	}

	@Override
	public void enrollCustomerDetails(CustomerDetail data) throws BMSException {
		try{
			Session session= getSessionInstance();
		
		session.beginTransaction();
		session.persist(data);
		session.getTransaction().commit();
		}
		catch(Exception exception){
			throw new BMSException(ErrorCode.SERVICE_UNAVAILABLE);
		}
	}

}
