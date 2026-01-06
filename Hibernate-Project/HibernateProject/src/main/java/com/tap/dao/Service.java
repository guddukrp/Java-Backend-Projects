package com.tap.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tap.model.Student;

public class Service {
	Transaction transaction;
	Session session ;
	
	public Service() {
		Configuration config = new Configuration();
		  config.configure();
		  config.addAnnotatedClass(Student.class);
		  
		  SessionFactory sessionFactory = config.buildSessionFactory();
		  
		   session = sessionFactory.openSession();
		  
		   transaction = session.beginTransaction();
	}
	public Student getStudent(int id) {
		return session.get(Student.class, id);
	}
	
	public void addStudent(Student s) {
		session.save(s);
	}
	
	public void deleteStudent(int id) {
		Student s = session.get(Student.class,id);
		session.delete(s);
	}
	
	public void updateStudent(Student s) {
//		Student s1 = session.get(Student.class, s.getId());
		session.update(s);
	}
	
	public List printAllStudent() {
		Query query= session.createQuery("from Student");
		List resultList = query.getResultList();
		
		return resultList;
	}
	
	public boolean checkUser(String un,String pwd) {
		
//		Query query = session.createQuery("from Student where name=:username and password=:password");
//		query.setParameter("username", un);
//		query.setParameter("password", pwd);
		
		
		Query query = session.createQuery("from Student where username=?1 and password=?2");
		query.setParameter(1, un);
		query.setParameter(2, pwd);
		
		List<Student> students = query.getResultList();
		
		transaction.commit();
		
		if(students.isEmpty()) {
			return false;
		}else {
			return true;
		}
	}
	
	
	
	
	
	
}
