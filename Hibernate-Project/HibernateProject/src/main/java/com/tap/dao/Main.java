package com.tap.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tap.model.Student;

public class Main {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		  config.configure();
		  config.addAnnotatedClass(Student.class);
		  
		  SessionFactory sessionFactory = config.buildSessionFactory();
		  
		  Session session = sessionFactory.openSession();
		  
		  Transaction transaction = session.beginTransaction();
		  
//		  Student s = new Student(6,"guddu","gkp@com");
		  
//		  session.save(s);
		  
		 Query query = session.createQuery("from Student");
		  List<Student> students = query.getResultList();
		  
//		  for(Student s:students) {
			  System.out.println(students);
//		  }
		  
		 transaction.commit();
		  
		
	}

}
