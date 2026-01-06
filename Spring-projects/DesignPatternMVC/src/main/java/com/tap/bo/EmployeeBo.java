package com.tap.bo;

import java.util.List;

import com.tap.models.Employee;

public interface EmployeeBo {

	public int save(Employee e);
	public int delete(int id);
	public int delete(Employee e);
	public int upadate(Employee e);
	public Employee get(int id);
	public List<Employee> getAll();
	
}
