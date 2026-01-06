package com.tap;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class PrepareCall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/tapacademy";
		
		try {
			Connection con = DriverManager.getConnection(url,name,password);
			
			String sql="call count_st(?,?)";
			CallableStatement cstmt = con.prepareCall(sql);
			
			System.out.println("Enter the department name");
			String dept1=scan.next();
			
			cstmt.setString(1, dept1);
			cstmt.registerOutParameter(2,Types.INTEGER);       //Types.INTEGER=4
		
			cstmt.execute();
			
			int count= cstmt.getInt(2);
			System.out.println(count);
			
			Program1.display(con, null, null);
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
