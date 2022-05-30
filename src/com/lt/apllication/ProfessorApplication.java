package com.lt.apllication;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.io.*;

import com.lt.bean.GradeCard;
import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.dao.UserDao;
import com.lt.service.CourseService;
import com.lt.service.GradeCardService;
import com.lt.service.ProfessorService;
import com.lt.service.StudentService;

//import sun.jvm.hotspot.debugger.win32.coff.TestDebugInfo;

public class ProfessorApplication {
	// public static void main(String args[]) {
//		final String ANSI_RESET = "\u001B[0m";

	// Declaring the color
	// Custom declaration
//		final String ANSI_RED = "\u001B[31m";
	public void professorlogin() {
		ProfessorService profService = new ProfessorService();
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to CRS Application");
		System.out.println("1. Login");
		System.out.println("2. New Registeration");
		System.out.println("Please select your choice: ");
		int input = sc.nextInt();
		sc.nextLine();
		UserDao userDao = new UserDao();
		List returnedUserList = userDao.login();
//		List finalUserList = returnedUserList;
		Iterator<User> i = returnedUserList.iterator();
		while (i.hasNext()) {
			User test = i.next();
			System.out.println(" " + test);
		}
		// if(i.)
		System.out.println(returnedUserList);

		switch (input) {
		case 1:
			System.out.println("Enter UserName: ");
			String userName = sc.nextLine();
			System.out.println("Enter Password: ");
			String pwd = sc.nextLine();

			if (userName.equals("group3") && pwd.equals("password")) {
				System.out.println("Login Successfull...");

			} else {
				System.out.println("Invalid username or password, try again..");
				return;
			}
//			System. out. println(ANSI_COLORNAME + "This text is colored" + ANSI_RESET);
			System.out.println("Choose from following options:");
//			System.out.println("\n");
			System.out.println("--------------");
			System.out.println("1. View Teaching Courses");
			System.out.println("2. View Enrolled Student");
			System.out.println("3. Add Grades");

			System.out.println("Enter your choice: ");
			int profOperationChoice = sc.nextInt();

			switch (profOperationChoice) {
			case 1:
				CourseService courseService = new CourseService();
				courseService.listCourses();
				break;

			case 2:
				StudentService studentService = new StudentService();
				studentService.viewStudentDetails();
				break;

			case 3:

			case 4:
				GradeCardService gradesList = new GradeCardService();
				gradesList.returnGradeCard();
				break;

//			default:
//				System.out.println("No such choices, press 1 or 2");
//
			}

			System.out.println("Choose from following options:");
//			System.out.println("\n");
			System.out.println("--------------");
			System.out.println("1. View Courses -->");
			System.out.println("2. View Student -->");
			System.out.println("3. Assign Grades -->");

			System.out.println("Enter your choice: ");
			int profOperationChoice2 = sc.nextInt();
			switch (profOperationChoice2) {
			case 1:
				CourseService courseService = new CourseService();
				courseService.listCourses();
				break;

			case 2:
				StudentService studentService = new StudentService();
				studentService.viewStudentDetails();
				break;

			case 3:

			case 4:
//				GradeCard

//			default:
//				System.out.println("No such choices, press 1 or 2");
//
			}
//		String courseList = sc.nextLine();
//
//		profService.viewCourse();
//		
//		System.out.println("View Students: ");
//		String studList = sc.nextLine();
//		
//		profService.viewStudent();

		}
	}
}
