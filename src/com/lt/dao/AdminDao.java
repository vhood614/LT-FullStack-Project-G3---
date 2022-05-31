package com.lt.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdminDao implements AdminDaoInterface{
	Scanner sc = new Scanner(System.in);
	@Override
	public void adminLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCourse() {
		
		
		CourseDao newCourseDao = new CourseDao();
		List adminCourseList = newCourseDao.returnCoursesList();;
		System.out.println("Enter new course to add: ");
		String courseToAdd = sc.nextLine();
		adminCourseList.add(courseToAdd);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProfessor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProfessor(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProfessorDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void approveStudentRegistration() {
		// TODO Auto-generated method stub
		
	}

}
