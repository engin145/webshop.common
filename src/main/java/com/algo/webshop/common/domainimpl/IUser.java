package com.algo.webshop.common.domainimpl;

import java.util.List;

import com.algo.webshop.common.domain.User;

public interface IUser {
	
	public User getUserByLogin(String login);
	
	public User getUserByLogPass(String login, String pass);
	
	public User getUserById(String id);

	public List<User> getAllUsers();

	public void addUserInDataBase(User user);

	public void updateUser(User user);
	
	public void deleteUser(String id);
	
	public String getUserName(int id);
}
