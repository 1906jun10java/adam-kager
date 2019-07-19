package com.revatuer.dao;

import java.util.List;

import com.revature.beans.User;

public interface UserDao {
	public List<User> getUsers();
	public User getUserByUsername(String name);
	public boolean createUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
}
