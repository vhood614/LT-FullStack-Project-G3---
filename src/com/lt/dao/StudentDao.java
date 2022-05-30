package com.lt.dao;

import java.util.HashMap;
import java.util.Map;

public class StudentDao implements StudentDaoInterface {

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
	public void addCourse() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dropCourse() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewCourses() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewGrades() {
		// TODO Auto-generated method stub

	}

	@Override
	public void payFee() {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub

	}

}
