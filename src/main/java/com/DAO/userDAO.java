package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Enitity.User;

public class userDAO {
	public Connection connection ;

	public userDAO(Connection connection) {
		super();
		this.connection = connection;
	}
	
	//Register Module
	public boolean add(User user) {
		boolean f = false;
		try {
			String query = "Insert into register_page(Name,Email,Password) values (?,?,?)";
			PreparedStatement prepardstatement = connection.prepareStatement(query);
			prepardstatement.setString(1, user.getName());
			prepardstatement.setString(2, user.getEmail());
			prepardstatement.setString(3, user.getPassword());
			int i = prepardstatement.executeUpdate();
			if(i == 1) {
				f = true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	//Login Module
	public User login(User us) {
		User user = null;
		try {
			String query = "select * from register_page where email = ? and password = ?";
			PreparedStatement preprestatment = connection.prepareStatement(query);
			preprestatment.setString(1, us.getEmail());
			preprestatment.setString(2, us.getPassword());
			ResultSet resultset = preprestatment.executeQuery();
			if(resultset.next()) {
				user = new User();
				//user.setName(resultset.getString("name"));
				user.setEmail(resultset.getString(1));
				user.setPassword(resultset.getString(2));
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;		
	}
	
	//Password Reset Module
	public boolean updatePassword(User user) {
		boolean f = false;
		try {
			String query = "update register_page set password = ? where email = ?";
			PreparedStatement preparedstatement = connection.prepareStatement(query);
			//preparedstatement.setString(1, email);
			preparedstatement.setString(1, user.getPassword());
			preparedstatement.setString(2, user.getEmail());
			int i = preparedstatement.executeUpdate();
			if(i == 1) {
				f = true;
			}
			
		}
		catch(Exception e) {
			
		}
		return f;
	}
}
