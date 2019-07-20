package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.beans.User;
import com.revature.service.UserServiceTest;

public class UserDaoImpl implements UserDao {
//	public static Logger log = Logger.getRootLogger();
//	static ConnectionFactory connection = ConnectionFactory.getInstance();
	public static ConnectionFactory cFS = ConnectionFactory.getInstance();
	
	User user = new User();
	private List<User> allUsers = new ArrayList<>();
	
	public UserDaoImpl () {
		User user = new User("SilverSlugger", "firstbase", "Todd", "Helton", "Baylor", "1");
		User user2 = new User("GoldenGlove", "leftfield", "Eric", "Young", "Baylor", "1");
		User user3 = new User("SneakTheaf", "rockies", "Don", "Baylor", "none", "2");
		this.allUsers.add(user);
		this.allUsers.add(user2);
		this.allUsers.add(user3);
	}

	@Override
	public List<User> getUsers() {
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
				UserServiceTest.Users.put(user.getUsername(), user);
				UserServiceTest.UsersIndex.add(user.getUsername());

			}

		} catch (SQLException e) {
//			log.info(e);
		} finally {
			if (statement != null) {
//				statement.close();
			}
		}
		return allUsers;
	}

	@Override
	public User getUserByUsername(String username) {
		for(User user : allUsers) {
			if(user.getUsername() == (username)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public boolean createUser(User user) {
		allUsers.add(user);
		return true;
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
