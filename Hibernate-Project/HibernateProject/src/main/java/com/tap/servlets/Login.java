package com.tap.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tap.dao.Service;

@WebServlet("/login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Service service = new Service();
		
		if(service.checkUser(username, password)) {
			
			System.out.println("hello world");
		}else {
			System.out.print("wrong password");
			response.sendRedirect("index.jsp?error=Invalid username or password! Try Again!");
//			response.sendRedirect("index.jsp");
		}
	}

}
