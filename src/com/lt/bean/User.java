package com.lt.bean;

import java.util.Date;

public class User {
	
	private String Id;
	private String name;
	private String password;
	private String address;
	private String username;
	private Date DoB;
	
	
	public User(String id, String name, String password, String address, String username, Date doB) {
		super();
		Id = id;
		this.name = name;
		this.password = password;
		this.address = address;
		this.username = username;
		DoB = doB;
	}
	
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDoB() {
		return DoB;
	}
	public void setDoB(Date doB) {
		DoB = doB;
	}
	
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", password=" + password + ", address=" + address + ", username="
				+ username + ", DoB=" + DoB + "]";
	}
	
	
	
	
	
	
	

}
