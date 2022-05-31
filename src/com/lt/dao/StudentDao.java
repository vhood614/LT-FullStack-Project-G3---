package com.lt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.lt.bean.Catalog;

public class StudentDao implements StudentDaoInterface {
	
	static List<Catalog> catalog = new ArrayList<>();

	@Override
	public void viewStudentDetails() {
		// TODO Auto-generated method stub
		HashMap<Integer, String> studentDetails = new HashMap<Integer, String>();
		studentDetails.put(1001, "Mansi");
		studentDetails.put(1002, "Parul");
		studentDetails.put(1003, "Vaibhav");
		studentDetails.put(1004, "Akshay");
		studentDetails.put(1005, "Akhil");

		for (Map.Entry sDetails : studentDetails.entrySet()) {
			System.out.println(sDetails.getKey() + "-" + sDetails.getValue());
		}
	}

	@Override
	public void registerCourse(int input) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewreportcard(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Catalog> viewCatalog() {
		List courseList = new ArrayList<>();
		courseList.add("Computer Science");
		courseList.add("Data Mining");
		courseList.add("Data Science");
		courseList.add("Data Architect");

		Iterator<String> i = courseList.iterator();
		while (i.hasNext()) {
			String test = i.next();
			System.out.println("-> " + test);
		}
		return catalog;
	}

	@Override
	public void payFee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void course() {
		// TODO Auto-generated method stub
		
	}
}