package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.entity.Employee;

@Component("edaoi")
public class EmployeeDAOImpl implements EmployeeDAO {
	Session session;
	
	@Autowired
	EmployeeDAOImpl(@Qualifier("sessionfactory") SessionFactory sf) {
		session = sf.openSession();
		System.out.println("Session established");
	}

	@Override
	public String insert(Employee e) {
		Transaction t = session.beginTransaction();
		session.save(e);
		t.commit();
		return "success";
	}

	@Override
	public String delete(int empid) {
		Transaction t = session.beginTransaction();
		Employee e = session.get(Employee.class,empid);
		session.delete(e);
		t.commit();
		return "deleted";
	}

	@Override
	public Employee get(int empid) {
		Transaction transaction = session.beginTransaction();
		Employee e = session.get(Employee.class, empid);
		transaction.commit();
		return e;
	}

	@Override
	public String update(Employee e) {
		Transaction transaction = session.beginTransaction();
		
		session.update(e);
		
		transaction.commit();
		return "update";
	}

	@Override
	public List<Employee> getAll() {
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.getResultList();
		
		System.out.println(list);
		
		transaction.commit();
		return list;
	}
	
	
	
	
}







