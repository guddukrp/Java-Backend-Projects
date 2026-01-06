package com.tap;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	String url = "jdbc:mysql://localhost:3306/tapacademy";
	String user = "root";
	String pwd = "root";
	
	//id name 10th 12th grad username password
	String sql = "insert into tapstudent values (?,?,?,?,?,?,?)";
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int ten = Integer.parseInt(req.getParameter("ten"));
		int twe = Integer.parseInt(req.getParameter("twe"));
		int grad = Integer.parseInt(req.getParameter("grad"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1,id);
			pstmt.setString(2, name);
			pstmt.setInt(3,ten);
			pstmt.setInt(4,twe);
			pstmt.setInt(5,grad);
			pstmt.setString(6, username);
			pstmt.setString(7, password);
			
			
			int i = pstmt.executeUpdate();
			
			PrintWriter out = resp.getWriter();
			out.println(1+" Successfully inserted");
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

	

}
