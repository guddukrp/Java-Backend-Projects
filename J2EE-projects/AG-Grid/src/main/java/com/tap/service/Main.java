package com.tap.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.google.gson.Gson;


public class Main {

	public static String data() {

		Configuration config = new Configuration();
		  config.configure();
		  config.addAnnotatedClass(Employee.class);
		  
		  SessionFactory sessionFactory = config.buildSessionFactory();
		  
		  Session session = sessionFactory.openSession();
		  
		  Transaction transaction = session.beginTransaction();
		  

		  
		 Query query = session.createQuery("from Employee");
		  List<Employee> emps = query.getResultList();
		  
		  
		  Gson gson = new Gson();
	        String jsonResult = gson.toJson(emps);

	        System.out.println(jsonResult);
		  
		 transaction.commit();
		 
		 return jsonResult;
		  
		
	}

}
