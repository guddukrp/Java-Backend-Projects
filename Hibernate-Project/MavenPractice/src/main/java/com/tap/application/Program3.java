package com.tap.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tap.model.Student;

public class Program3 {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		
		config.configure();
		config.addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		Student s = session.get(Student.class, 1);
		
		s.setName("msDhoni");
		
		System.out.println(s);
		
		session.update(s);
		
		
		
		
		
		
		transaction.commit();
	}

}
