package com.hellowd.sandbox.entity;

public class User {
	private String id;
	private String password;
	
	public User() { }
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public void setId(String id) { this.id = id; }
	public String getId() { return this.id; }
	
	public void setPassword(String password) { this.password = password; }
	public String getPassword() { return this.password; } 
}
