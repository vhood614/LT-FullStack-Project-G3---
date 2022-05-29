package com.lt.apllication;

import java.util.Scanner;

import com.lt.service.CourseService;
import com.lt.service.ProfessorService;

public class ProfessorApplication {
	public static void main(String args[]) {
		ProfessorService profService = new ProfessorService();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to CRS Application");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("Please select your choice: ");
		int input = sc.nextInt();
		sc.nextLine();
		
		switch(input) {
			case 1:
				System.out.println("Enter UserName: ");
				String userName = sc.nextLine();
				System.out.println("Enter Password: ");
				String pwd = sc.nextLine();
				
				if(userName.equals("group2")&&pwd.equals("password")) {
					System.out.println("Login Successfull...");
					
					System.out.println("Choose from following options:");
					System.out.println("\n");
					System.out.println("--------------");
					System.out.println("1. View Cources -->");
					System.out.println("2. View Student -->");
					System.out.println("3. Assign Grades -->");
					System.out.println("4. View Report Card -->");
					
					System.out.println("Enter your choice: ");
					int profOperationChoice = sc.nextInt();
					
					switch(profOperationChoice) {
					case 1:
						CourseService courseService = new CourseService();
						courseService.listCourses();
						break;
					}
			
					break;
				}else {
					System.out.println("Invallid username or password, try again..");
					return;
				}
				
		default:
				System.out.println("No such choices, press 1 or 2");
				
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
