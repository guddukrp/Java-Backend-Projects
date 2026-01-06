//package com.tap.application;
//
//public class Program1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
package com.tap.application;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tap.model.Student;



public class Program1 {



	public static void main(String[] args)  {
		
		Configuration config = new Configuration();
		 
		config.configure();
		
		config.addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		//logics
		
		Student s3 = new Student(5,"karan","karan5@gmail.com");
		
		Object id = session.save(s3);
		
		System.out.println(id);
		
		transaction.commit();
		

	}

}