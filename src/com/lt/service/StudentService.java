package com.lt.service;

import java.util.HashMap;

import com.lt.bean.Student;
import com.lt.dao.StudentDao;

public class StudentService implements StudentServiceInterface {

	public void viewStudentDetails() {
		StudentDao studDao = new StudentDao();

		studDao.viewStudentDetails();

	}

	public void addCourse() {

	}

	public void dropCourse() {

	}

	public void viewCourses() {

	}

	public void viewGrades() {

	}

	public void payFee() {

	}

	public void registerStudent() {
		System.out.println("Student registered");
	}

	public void updateStudent() {
		System.out.println("Student updated");
	}

	public void deleteStudent() {
		System.out.println("Student deleted");
	}

}
