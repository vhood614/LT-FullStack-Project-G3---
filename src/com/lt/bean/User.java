package com.lt.bean;

public class User {
	
	private int userId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	public User(int userId) {
		super();
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + "]";
	}
	
	
	

}
