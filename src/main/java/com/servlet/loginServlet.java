package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.DAO.userDAO;
import com.DB.DBConnection;
import com.Enitity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		PrintWriter out = resp.getWriter();
			User user = new User();
			user.setEmail(email);
			user.setPassword(password);			
			userDAO userDAO = new userDAO(DBConnection.getConnection());
			User us = userDAO.login(user);
			 if(us != null) {
				 System.out.println("login succrssfully");
				 resp.sendRedirect("home.jsp");
			 }
			 else {
				 out.print("Enter valid email and password");
				 System.out.print("Login fail");
			 }
			
		}
	}
	

