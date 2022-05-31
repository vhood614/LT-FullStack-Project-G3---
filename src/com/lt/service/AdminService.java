package com.lt.service;

import com.lt.dao.AdminDao;
import com.lt.dao.AdminDaoInterface;

public class AdminService implements AdminServiceInterface {

	public void addCourse() {
		AdminDao adminDao = new AdminDao();
		adminDao.addCourse();

	}

	public void removeCourse() {

	}

	public void addProfessor() {

	}

	public void removeProfessor() {

	}

	public void viewCourses() {

	}

	public void updateCourse() {

	}

	public void viewProfessorDetails() {

	}

	public void updateProfessorDetails() {

	}

	@Override
	public void adminLogin() {
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
	public void approveStudentRegistration() {
		// TODO Auto-generated method stub

	}

}
