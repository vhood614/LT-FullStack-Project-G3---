package com.lt.dao;

public interface AdminDaoInterface {
	
	public void adminLogin();

	public void addCourse();

	public void removeCourse();

	public void addProfessor();

	public void removeProfessor(int id);

	public void viewCourse();

	public void updateCourse();

	public void updateProfessorDetails();

	public void approveStudentRegistration();

}
