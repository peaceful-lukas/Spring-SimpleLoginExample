package com.hellowd.sandbox.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hellowd.sandbox.dao.UserDao;
import com.hellowd.sandbox.entity.User;
import com.hellowd.sandbox.service.UserService;

public class UserServiceImpl implements UserService {
	
	/* core DAOs */
	@Autowired private UserDao userDao;
	
	/* singleton pattern. */
	private UserServiceImpl() { }
	private static UserServiceImpl instance = new UserServiceImpl();
	public static UserServiceImpl getInstance() { return instance; }
	
	/* interface methods */
	@Override
	public boolean login(String id, String password) {
		User user = userDao.getUser(id);
		
		if(user != null) {
			if(user.getPassword().equals(password)) {
				return true;
			}
			else {
				return false;
			}
		}
		
		// No such user.
		else {
			return false;
		}
	}
}
