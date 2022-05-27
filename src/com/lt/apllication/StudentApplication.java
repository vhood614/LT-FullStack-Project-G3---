package com.lt.apllication;

import com.lt.service.StudentService;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentService studService = new StudentService();
		
		studService.deleteStudent();
		studService.updateStudent();
		studService.registerStudent();

	}

}
