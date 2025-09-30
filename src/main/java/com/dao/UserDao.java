package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.models.User;
import com.utils.DBConnection;

public class UserDao {
	User user;
	

   public User saveUser(User user) {
	SessionFactory sessionFactory = DBConnection.getDBConnection();   
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	session.persist(user);
	transaction.commit();
	return user;
	
	   
   }
   


}
