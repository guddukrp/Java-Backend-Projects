package com.tap;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url="jdbc:mysql://localhost:3306/tapacademy";
		String un = "root";
		String pwd= "root";
		
		String un1 = req.getParameter("username");
		String pwd1 = req.getParameter("password");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String sql= "select * from `tapstudent` where `username` = ? and `password` =?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,un,pwd);
			
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, un1);
			pstmt.setString(2, pwd1);
			
			ResultSet res = pstmt.executeQuery();
			if(res.next()==true) {
				out.println("Hello "+res.getString(2)+" Welcome to My application");
				 
				
				sql = "select * from drive";
				PreparedStatement pstmt1 = con.prepareStatement(sql);
				ResultSet res1 = pstmt1.executeQuery();		
				
				
				out.print("	<h3>Here, Some Drive from TapAcademy</h3>\r\n"
						+ "	<table border = '1'>\r\n"
						+ "		\r\n"
						+ "		<tr>\r\n"
						+ "			<th>Id </th>\r\n"
						+ "			<th>Name: </th>\r\n"
						+ "			<th>10th</th>\r\n"
						+ "			<th>12th</th>\r\n"
						+ "			<th>Grad</th>\r\n"
						+ "			<th>Profile</th>\r\n"
						+ "			<th>Package</th>\r\n"
						+ "			<th>Skills</th>\r\n"
						+ "		</tr>");
				while(res1.next()) {
					out.print("		<tr >\r\n"
							+ "			<td>"+res1.getInt(1)+"</td>\r\n"
							+ "			<td>"+res1.getString(2)+"</td>\r\n"
							+ "			<td>"+res1.getInt(3)+"</td>\r\n"
							+ "			<td>"+res1.getInt(4)+"</td>\r\n"
							+ "			<td>"+res1.getInt(5)+"</td>\r\n"
							+ "			<td>"+res1.getString(6)+"</td>\r\n"
							+ "			<td>"+res1.getString(7)+"</td>\r\n"
							+ "			<td>"+res1.getString(8)+"</td>\r\n"
							+ "			\r\n"
							+ "		</tr>\r\n");
				}
				
				out.print("	</table>\r\n");
				
				
			}else {
				
//				out.println("<h3 style=\"color: red;\">Wrong username and password!</h3>");
//
//				RequestDispatcher rd = req.getRequestDispatcher("index.html");
//				rd.forward(req, resp);
				
				
				RequestDispatcher rd = req.getRequestDispatcher("invalidLogin.html");
				rd.forward(req, resp);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
