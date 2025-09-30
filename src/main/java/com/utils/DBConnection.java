package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.models.User;

public class DBConnection {
	private static SessionFactory sessionFactory=null;
	

	public  static SessionFactory getDBConnection() {
		if(sessionFactory==null) {
			Configuration config= new Configuration().configure("hibernate.cfg.xml");
			config.addAnnotatedClass(User.class);
			
			 sessionFactory = config.buildSessionFactory();
			 return sessionFactory;
		}
		return sessionFactory;
	}

}
