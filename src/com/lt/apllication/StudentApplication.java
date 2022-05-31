package com.lt.apllication;

import java.util.Scanner;

import com.lt.service.CourseService;
import com.lt.service.StudentService;
import com.lt.service.StudentServiceInterface;

public class StudentApplication {

	public void studentApplication() {
		// TODO Auto-generated method stub

		StudentService studService = new StudentService();

	}

	public void createStudentView() {
		StudentService studService = new StudentService();
		// TODO Auto-generated method stub
		System.out.println("Choose from following options:");
		System.out.println("--------------");
		System.out.println("1. View Caatalog");
		System.out.println("2. Course Registration");
		System.out.println("3. Add Course");
		System.out.println("4. Drop Course");
		System.out.println("5. View Grades");
		System.out.println("6. Pay Fee");

		System.out.println("Enter your choice: ");
		Scanner sc = new Scanner(System.in);
		int studOperationChoice = sc.nextInt();

		switch (studOperationChoice) {
		case 1:
			StudentService ssc = new StudentService();
			ssc.viewCatalog();
			System.out.println("Please select the Course\n");
			int inp = sc.nextInt();
			ssc.registerCourse(inp);

			break;

		case 2:
			StudentServiceInterface ssc1 = new StudentService();
			studService.viewreportcard();
			break;

		case 3:
			StudentServiceInterface ssc2 = new StudentService();
			studService.viewCatalog();
			break;

		case 4:
			StudentServiceInterface ssc3 = new StudentService();
			studService.course();
			break;

		case 5:
			StudentServiceInterface ssc4 = new StudentService();
			studService.payFee();
			break;

		case 6:
			break;
		case 7:
			break;
		default:

		}

	}

}
