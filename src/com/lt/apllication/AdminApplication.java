/**
 * 
 */
package com.lt.apllication;

import java.util.Scanner;

import com.lt.service.AdminService;
import com.lt.service.CourseService;
import com.lt.service.CustomerService;
import com.lt.service.StudentService;

/**
 * @author 91988
 *
 */
public class AdminApplication {

	public void createAdminView() {
		
		System.out.println("Choose from following options:");
		System.out.println("--------------");
		System.out.println("1. Add Course");
		System.out.println("2. Remove Course");
		System.out.println("3. Add Professor");
		System.out.println("3. Approve Student Registration");
		System.out.println("3. Generate Report Card");
	
		System.out.println("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int profOperationChoice = sc.nextInt();
	
		switch (profOperationChoice) {
		case 1:
			AdminService adminService = new AdminService();
			adminService.addCourse();
			break;
	
		case 2:
			StudentService studentService = new StudentService();
			studentService.viewStudentDetails();
			break;
	
		case 3:
	
	//
		}
	}

}
