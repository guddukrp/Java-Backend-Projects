package com.tap.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tap.model.Student;

public class Program2 {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		
		config.configure();
		
		config.addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		//logic
	
		
		Student s = session.get(Student.class, 3);
		System.out.println(s);
		session.delete(s);
		
		
		transaction.commit();
		
	}

}
