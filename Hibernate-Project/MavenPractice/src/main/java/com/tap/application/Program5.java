package com.tap.application;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tap.model.Student;

public class Program5 {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
//		logic
		Query query = session.createQuery("from Student s where s.name='karan'");
		
		List list = query.getResultList();
		
		
		System.out.println(list);
		
		
		
		
		
		transaction.commit();
		
	}

}
