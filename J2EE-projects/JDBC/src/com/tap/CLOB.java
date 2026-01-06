package com.tap;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CLOB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/tapacademy";
		
		String PATH= "C:\\Users\\guddu kumar\\eclipse-workspace\\JDBC\\images\\myintro.txt";
		
		
		try {
			Connection con = DriverManager.getConnection(url,name,password);
			
			String sql = "Update student set intro = ? where id =?";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			System.out.println("Enter id:");
			
			pstmt.setInt(2, scan.nextInt());
			
			FileReader fr = new FileReader(PATH);
			
			pstmt.setCharacterStream(1, fr);
			
			int i = pstmt.executeUpdate();
			
			System.out.println(i);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
