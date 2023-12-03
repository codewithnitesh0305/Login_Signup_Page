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
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("username");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		//PrintWriter out = resp.getWriter();
		if(name.equals("") || password.equals("")) {
			resp.sendRedirect("");
			System.out.print("Please Enter Properly");
		}
		else {
			User user = new User();
			user.setName(name);
			user.setEmail(email);
			user.setPassword(password);
			
			userDAO userDAO = new userDAO(DBConnection.getConnection());
			boolean f = userDAO.add(user);
			if(f) {
				//System.out.print("Data Insert Successfully");
				resp.sendRedirect("login.jsp");
			}
			else {
				System.out.print("Data is not inserted");
			}
		}
	}
	
}
