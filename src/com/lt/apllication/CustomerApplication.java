/**
 * 
 */
package com.lt.apllication;

import com.lt.service.CustomerService;
import com.lt.service.StudentService;

/**
 * @author 91988
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerService  customerService = new CustomerService();
		
		customerService.createCustomer();
		customerService.updateCustomer();
		customerService.deleteCustomer();
		customerService.listCustomer();
		
		
		StudentService studService = new StudentService();
		
		studService.deleteStudent();
		studService.updateStudent();
		studService.registerStudent();
		

	}

}
