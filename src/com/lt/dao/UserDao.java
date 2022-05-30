package com.lt.dao;

import java.util.ArrayList;
import java.util.List;

import com.lt.bean.Student;
import com.lt.bean.User;

public class UserDao implements UserDaoInterface {

	@Override
	public List login() {
		// TODO Auto-generated method stub
		
		List<User> userDetails= new ArrayList<User>();
		User u1= new User("10001", "Praveen", "praveen11", "@praveen", "Professor");
		User u2= new User("10002", "Naveen", "naveen11", "@naveen", "Professor");
		User u3= new User("10003", "Mridul", "mridul11", "@mridul", "Student");
		User u4= new User("10004", "Raj", "raj11", "@raj", "Professor");
		
		
		userDetails.add(u1);
		userDetails.add(u2);
		userDetails.add(u3);
		userDetails.add(u4);
		
		return userDetails;
		
	}

}
