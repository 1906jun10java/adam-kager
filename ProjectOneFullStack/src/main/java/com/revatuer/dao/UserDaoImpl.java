package com.revatuer.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.User;

public class UserDaoImpl implements UserDao {
	//fake lists for now
	User user = new User();
	private List<User> allUsers = new ArrayList<>();
	
	public UserDaoImpl () {
		User user = new User(5, "Todd", "Helton", "SilverSlugger", "baseball");
		User user2 = new User(5, "Eric", "Holder", "USAG", "password");
		this.allUsers.add(user);
		this.allUsers.add(user2);
	}

	@Override
	public List<User> getUsers() {
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
