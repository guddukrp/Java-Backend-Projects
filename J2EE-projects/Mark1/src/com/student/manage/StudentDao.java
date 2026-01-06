package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student st){
		boolean f = false;
		
		try {
			Connection con = CP.createC();
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";
			//preparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the value of parameter

			pstmt.setString(1, st.getName());
			pstmt.setString(2, st.getPhone());
			pstmt.setString(3, st.getCity());
			
			//execute..
			pstmt.executeUpdate();
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}
	public static boolean deleteStudent(String userName) {
		boolean f = false;
		
		try {
			Connection con = CP.createC();
			String q = "delete from students where sname=?";
			//preparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the value of parameter

			pstmt.setString(1, userName);
			
			
			//execute..
			pstmt.executeUpdate();
			f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public static void printStudent() {
		
		
		try {
			Connection con = CP.createC();
			String q = "select * from students";
			//preparedStatement
			
			Statement stmt = con.createStatement();
			
			ResultSet set =stmt.executeQuery(q);
			
			while(set.next()) {
				
				String name = set.getString(1);
				String phone = set.getString(2);
				String city = set.getString(3);
				
				System.out.println("Name: "+name);
				System.out.println("Phone: "+phone);
				System.out.println("City: "+city);
				System.out.println("----------------------------------");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
