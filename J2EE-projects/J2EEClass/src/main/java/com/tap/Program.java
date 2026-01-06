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


public class Program extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		
		
		String username="root";
		String pwd="root";
		String url= "jdbc:mysql://localhost:3306/advjava";
		String query= "insert into `student` values (?,?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String name = req.getParameter("username");
			String email = req.getParameter("email");
			String phone = req.getParameter("phone");
			
			Connection con = DriverManager.getConnection(url,username,pwd);
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1,name);
			pstmt.setString(2,email);
			pstmt.setString(3,phone);
			
			int i = pstmt.executeUpdate();
			
			resp.setContentType("text/html");
			
			
			
			writer.println("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>Insert title here</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "		<h3>Hello "+name+" </h3>\r\n"
					
					+ "</body>\r\n"
					+ "</html>");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
