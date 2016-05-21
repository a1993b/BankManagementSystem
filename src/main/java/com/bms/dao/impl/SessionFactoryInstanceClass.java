package com.bms.dao.impl;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;

public class SessionFactoryInstanceClass {

	protected Session getSessionInstance(){
		
		Session session= new AnnotationConfiguration().configure().buildSessionFactory().openSession();
		return session;
	}
}
