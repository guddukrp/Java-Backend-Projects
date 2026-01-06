package com.tap.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tap.models.Employee;

public class EmployeeBoImpl implements EmployeeBo{
	
	private static Connection connection =null;
	private static PreparedStatement prepareStatement =null;
	private static ResultSet res =null;
	
	private static final String INSERT_QUERY="insert into `employee`(`id`,`name`,`email`,`dept`,`salary`) values(?,?,?,?,?)";
	private static final String DELETE_QUERY="delete from `employee` where `id` = ?";
	private static final String UPDATE_QUERY="Update `employee` set `name`=?,`email`=?,`dept`=?,`salary`=? where `id`=?";
	private static final String GET_QUERY = "Select * from `employee` where `id`=?";
	private static final String GET_ALL_QUERY = "Select * from `employee`";
	
	
	public EmployeeBoImpl() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int save(Employee e) {

		try {
			 prepareStatement = connection.prepareStatement(INSERT_QUERY);
			
			prepareStatement.setInt(1, e.getId());
			prepareStatement.setString(2,e.getName());
			prepareStatement.setString(3,e.getEmail());
			prepareStatement.setString(4,e.getDepartment());
			prepareStatement.setInt(5, e.getSalary());
			
			int i = prepareStatement.executeUpdate();
			return i;
			
		} catch ( SQLException e1) {
			e1.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int id) {

		try {
			prepareStatement = connection.prepareStatement(DELETE_QUERY);
			
			prepareStatement.setInt(1, id);
			
			return prepareStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(Employee e) {
		
		return delete(e.getId());
	}

	@Override
	public int upadate(Employee e) {
		
		try {
			prepareStatement= connection.prepareStatement(UPDATE_QUERY);
			
			prepareStatement.setString(1,e.getName());
			prepareStatement.setString(2,e.getEmail());
			prepareStatement.setString(3,e.getDepartment());
			prepareStatement.setInt(4,e.getSalary());
			prepareStatement.setInt(5,e.getId());
			
			return prepareStatement.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return 0;
	}

	@Override
	public Employee get(int id) {
		try {
			prepareStatement = connection.prepareStatement(GET_QUERY);
			
			prepareStatement.setInt(1, id);
			
			res = prepareStatement.executeQuery();
			
			if(res.next()) {
				int id1 = res.getInt("id");
				String name1 = res.getString("name");
				String email1 = res.getString("email");
				String dept1 = res.getString("dept");
				int salary1 = res.getInt("salary");
				
				Employee e = new Employee(id1,name1,email1,dept1,salary1);
				return e;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAll() {
		
		List<Employee> list = new ArrayList<Employee>();
		
		try {
			Statement createStatement = connection.createStatement();
			
			ResultSet res = createStatement.executeQuery(GET_ALL_QUERY);
			
			while(res.next()) {
				
				int id1 = res.getInt("id");
				String name1 = res.getString("name");
				String email1 = res.getString("email");
				String dept1 = res.getString("dept");
				int salary1 = res.getInt("salary");
				
				Employee e = new Employee(id1,name1,email1,dept1,salary1);
				list.add(e);
			}
			return list;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}