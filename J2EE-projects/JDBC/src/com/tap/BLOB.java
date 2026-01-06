package com.tap;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BLOB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/tapacademy";
		
		String sql= "update student set DP = ? where name= ?";
		String PATH="C:\\Users\\guddu kumar\\eclipse-workspace\\JDBC\\images\\my_image2.jpg";
		
		
		try {
			Connection con = DriverManager.getConnection(url,name,password);
			
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			System.out.println("Enter the name:");
			String inputName=scan.next();
			pstmt.setString(2, inputName);
			
			FileInputStream fis = new FileInputStream(PATH);
			pstmt.setBinaryStream(1, fis);
			
			int i = pstmt.executeUpdate();
			System.out.println(i);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
