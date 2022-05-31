package com.lt.apllication;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.lt.bean.User;
import com.lt.dao.UserDao;
import com.lt.service.CourseService;
import com.lt.service.StudentService;

public class CRSApplication {
	static LocalDateTime localDateTime = LocalDateTime.now();
	static List<User> userData = new ArrayList<>();
	static AdminApplication admin = new AdminApplication();
	static ProfessorApplication professor = new ProfessorApplication();
	static StudentApplication student = new StudentApplication();
	static boolean flag;
	static User LoggedInuser = null;
	
 public static void main (String [] args) {
	 
	userData.add(new User("1","admin", "123", "admin", "admin"));
	userData.add(new User("2","student", "123", "student", "student"));
	userData.add(new User("3","professor", "123", "professor", "prof"));
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("==Welcome to CRS Application==");
	System.out.println("1. Login");
	System.out.println("2. New Registeration");
	System.out.println("3. Update Password");
	System.out.println("Please select your choice: ");
	int input = sc.nextInt();
	sc.nextLine();
//	UserDao userDao = new UserDao();
//	List returnedUserList = userDao.login();
//	Iterator<User> i = returnedUserList.iterator();
//	while (i.hasNext()) {
//		User test = i.next();
//	}
	
	switch (input) {
	case 1:
		System.out.println("Enter UserName: ");
		String userName = sc.nextLine();
		System.out.println("Enter Password: ");
		String pwd = sc.nextLine();
		flag = false;
		
		userData.forEach(user -> {
			if(user.getUsername().equals(userName) && user.getPassword().equals(pwd)) {
				flag = true;
				LoggedInuser = user;
			}
		});
		if(flag) {
			System.out.println("Logged in as - "+LoggedInuser.getRole()+"   "+ localDateTime );
			String role = LoggedInuser.getRole();
			if(role.equals("admin")) {
				admin.createAdminView();
			}
			if(role.equals("student")) {
				student.createStudentView();
			}
			if(role.equals("prof")) {
				professor.professorlogin();
			}
		}else {
			System.out.println("Username or Password Incorrect!!");
			return;
		}
		
	}
		
	
//		System.out.println("Choose from following options:");
//		System.out.println("--------------");
//		System.out.println("1. View Teaching Courses");
//		System.out.println("2. View Enrolled Student");
//		System.out.println("3. Add Grades");
//	
//		System.out.println("Enter your choice: ");
//		int profOperationChoice = sc.nextInt();
//	
//		switch (profOperationChoice) {
//		case 1:
//			CourseService courseService = new CourseService();
//			courseService.listCourses();
//			break;
//	
//		case 2:
//			StudentService studentService = new StudentService();
//			studentService.viewStudentDetails();
//			break;
//	
//		case 3:
//	
//	//
//		}
//
//	 ProfessorApplication pa= new ProfessorApplication();
//	 pa.professorlogin();
////	 StudentApplication sa = new StudentApplication();
////	 sa.studentApplication();
 }
}
