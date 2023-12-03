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
@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String password = req.getParameter("new_password");
		//String confirm_password = req.getParameter("confirm_password");
		PrintWriter out = resp.getWriter();
		
			User user = new User();
			user.setEmail(email);
			user.setPassword(password);
			userDAO userDAO = new userDAO(DBConnection.getConnection());
			boolean f = userDAO.updatePassword(user);
			if(f) {
				out.print("Update Successfully");
				//resp.sendRedirect("login.jsp");
			}
			else {
				out.print("updatetion failed");
			}
		}
	}


