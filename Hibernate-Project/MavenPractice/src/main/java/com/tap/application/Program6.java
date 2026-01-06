package com.tap.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tap.model.Student;

public class Program6 {

	public static void main(String[] args) {

		
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		Query query = session.createQuery("update Student s set s.email='karanarya@gmail.com' where name='karan'");
		
//		Query query2 = session.createQuery("delete from Student s where s.name ='karan'");
		
		int i = query.executeUpdate();
		
		System.out.println(i);
		
		
		
		
		transaction.commit();
	}

}
