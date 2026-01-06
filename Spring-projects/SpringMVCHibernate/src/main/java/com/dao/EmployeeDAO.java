package com.dao;

import java.util.List;

import com.entity.Employee;

public interface EmployeeDAO {
	String insert(Employee e);
	String delete(int empid);
	String update(Employee e);
	Employee get(int empid);
	
	List<Employee> getAll();
	
	
	
}