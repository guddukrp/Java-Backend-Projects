package com.tap.app;

import java.util.List;

import com.tap.bo.EmployeeBoImpl;
import com.tap.models.Employee;

public class Program1 {

	public static void main(String[] args) {
		
		EmployeeBoImpl empbo = new EmployeeBoImpl();
		
//		List<Employee> employees = empbo.getAll();
//		
//		System.out.println(employees);
		
		Employee employee = empbo.get(1);
		
		employee.setName("Karan Arya");
		
		empbo.upadate(employee);
		
		System.out.println(employee);
		
//		int i = empbo.save(new Employee(1,"karan","karan@gmail.com","IT",380000));
//		
//		System.out.println(i);

	}

}
