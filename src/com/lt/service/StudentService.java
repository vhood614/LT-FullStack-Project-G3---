package com.lt.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.lt.bean.Catalog;
import com.lt.bean.Student;
import com.lt.dao.StudentDao;

public class StudentService implements StudentServiceInterface {
	
	StudentDao studentDao = new StudentDao(); 

	public void viewStudentDetails() {
		studentDao.viewStudentDetails();
	}

public void registerCourse(int input){
		studentDao.registerCourse(input);
	}
	
    public void viewreportcard(int id){
    	int i =id;
    	studentDao.viewreportcard(i);
	}
    
    public void viewCatalog(){
    	ArrayList<Catalog> resultlist = (ArrayList<Catalog>) studentDao.viewCatalog();
    	
    	System.out.println(" Courses:");
    	for(int i=0;i<resultlist.size();i++){
    		System.out.println(i+1+"."+resultlist.get(i));
    	}
    	
    	
    }

	@Override
	public void payFee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void course() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewreportcard() {
		// TODO Auto-generated method stub
		
	}
}

