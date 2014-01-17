package com.hellowd.sandbox.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.hellowd.sandbox.dao.UserDao;
import com.hellowd.sandbox.entity.User;

public class UserMemoryDao implements UserDao {
	
	private List<User> userList;
	
	/* constructors */
	public UserMemoryDao() {
		this.userList = new ArrayList<User>();
		this.userList.add(new User("admin", "admin"));
		this.userList.add(new User("hello", "987"));
		this.userList.add(new User("helloworld", "hello987"));
	}
	
	public UserMemoryDao(List<User> userList) {
		this.userList = userList;
	}
	
	
	
	/* user list accessors */
	public User getUser(String id) {
		for(User user : userList) {
			if(id.equals(user.getId())) {
				return user;
			}
		}
		return null;
	}
	
	public void addUser(User user) {
		this.userList.add(user);
	}
}
