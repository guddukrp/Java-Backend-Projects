package com.tap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ACID{
	

	public static void main(String[] args) {
		String name="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/tapacademy";
		
		
		try {
			Connection con = DriverManager.getConnection(url,name,password);
			
			Program1.display(con, null, null);
			
			String query1= "update `student` set `salary` =`salary`+2000 where `name`='raju'";
			String query2= "update `student` set `salary` =`salary`-2000 where `name`='karan'";
			
			Statement stmt = con.createStatement();
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			
			stmt.executeBatch();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
