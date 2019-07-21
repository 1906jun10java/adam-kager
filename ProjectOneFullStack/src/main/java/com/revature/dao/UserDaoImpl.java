package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import org.apache.log4j.Logger;

import com.revature.beans.User;
import com.revature.service.UserService;

public class UserDaoImpl implements UserDao {
//	public static Logger log = Logger.getRootLogger();
//	static ConnectionFactory connection = ConnectionFactory.getInstance();
	public static ConnectionFactory cFS = ConnectionFactory.getInstance();
	
	User user = new User();
	private ArrayList<User> allUsers = new ArrayList<>();
	
	public UserDaoImpl() {
		System.out.println("4 - running UserDaoImpl in UserDaoImpl");

	}

	@Override
	public ArrayList<User> getUsers() {
		System.out.println("7 - running getUsers in UserDaoImpl");
		Connection connection = cFS.getConnection();
		Statement statement = null;

		String query = "SELECT * FROM USERS";

		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				User user = new User();
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setFirstname(rs.getString(3));
				user.setLastname(rs.getString(4));
				user.setManager(rs.getString(5));
				user.setEmployeelevel(rs.getString(6));
				allUsers.add(user);
				UserService.Users.put(user.getUsername(), user);
				System.out.println("Found " + user.getUsername());
				UserService.UsersIndex.add(user.getUsername());

			}

		} catch (SQLException e) {
			System.out.println("This is a SQL problem\n" + e);
		} finally {
			if (statement != null) {
//				statement.close();
			}
		}
		return allUsers;
	}

	@Override
	public User getUserByUsername(String usernameFromLoginPage) {
		System.out.println("6 - Calling getUsers from getUserByUsername in UserDaoImpl");
		ArrayList<User> allUsers = getUsers();
		System.out.println(allUsers);
		for(User user : allUsers) {
			System.out.println("running the for loop for all users in UserDaoImpl");
			System.out.println(user.getUsername());
			if(user.getUsername() == (usernameFromLoginPage)) {
				System.out.println("returning " + user + "all users in UserDaoImpl");
				return user;
			}
		}
		System.out.println("returning null all users in UserDaoImpl");
		return null;
	}

	@Override
	public boolean createUser(User user) {
		System.out.println("running createUser from UserDaoImpl");
		allUsers.add(user);
		UserService.Users.put(user.getUsername(), user);
		UserService.UsersIndex.add(user.getUsername());
		// make a sql prepared statement to add a user to the database
		
		return true;
		
	}

	@Override
	public void updateUser(User user) {
		System.out.println("running updateUser from UserDaoImpl");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("running deleteUser from UserDaoImpl");
		// TODO Auto-generated method stub
		
	}

}
