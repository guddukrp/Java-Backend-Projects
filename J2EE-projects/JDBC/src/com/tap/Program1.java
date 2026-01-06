//Atomacity: transaction is 100% successfull or 100% failure
//Consistency: ensures to get from 1 consistent state to another consistent state
//Isolastion: transaction has to be isolated from all other transaction
//Durability: If one transaction is committed,it will remain as it is,
//				weather even if any error occurs like system error or power loss








package com.tap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {

	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
		
		
		String name="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/tapacademy";
		
		
		try {
			con = DriverManager.getConnection(url,name,password);
			
			
			
			
//			insert(con,stmt);
			
//			update(con,stmt);
			
//			delete(con,stmt);
			
			
			display(con,stmt,res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close(con, stmt, res);
		}
		
		
	}
	
	private static void delete(Connection con, Statement stmt) throws SQLException {
		
		String query= "delete from student where salary=200000";
		stmt=con.createStatement();
		int ans = stmt.executeUpdate(query);
		System.out.println(ans);
		
	}

	private static void update(Connection con, Statement stmt) throws SQLException {
		
		String query = "update student set salary=200000 where salary=10000";
		stmt = con.createStatement();
		int ans = stmt.executeUpdate(query);
		System.out.println(ans);     					//print how many row affected
		
	}

	private static void insert(Connection con, Statement stmt) throws SQLException {
		String query = "insert into student values(7,'manoranjan','manu@gmail.com','Civil',10000)";
		String query2 = "insert into student values(8,'manoranjan','manu@gmail.com','Civil',10000)";
		String query3 = "insert into student values(9,'manoranjan','manu@gmail.com','Civil',10000)";
		
		stmt = con.createStatement();
		stmt.addBatch(query);
		stmt.addBatch(query2);
		stmt.addBatch(query3);
		int[] arr =  stmt.executeBatch();
		
		
		
//		stmt=con.createStatement();
////		boolean ans  = stmt.execute(query);         			//execute() return false if no resultset available
//		int ans2 = stmt.executeUpdate(query);					//executeUpdate return int value or row affected
		
	}

	static void display(Connection con,Statement stmt,ResultSet res) throws SQLException {
		
		String query= "select * from student";
		stmt=con.createStatement();
		res = stmt.executeQuery(query);
		
		System.out.println("+---+----------+----------------------+-------+----------+");
		
		while(res.next()) {
			int id = res.getInt("id");
			String name=res.getString("name");
			String email=res.getString("email");
			String dept=res.getString("dept");
			int salary=res.getInt("salary");
			
//		System.out.println(id+" "+name+" "+email+" "+dept+" "+salary);
	
		System.out.printf("| %d | %-8s | %-20s | %-5s | %d    |\n",id,name,email,dept,salary);
		
		System.out.println("+---+----------+----------------------+-------+----------+");
		
			
							
		}
	}

	private static void close(Connection con, Statement stmt, ResultSet res) {
		
		try {
			if(res!=null) {
				res.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(stmt!=null) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if(con!=null) {
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
