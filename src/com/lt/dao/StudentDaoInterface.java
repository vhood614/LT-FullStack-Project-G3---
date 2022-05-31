package com.lt.dao;

import java.util.List;

import com.lt.bean.Catalog;

public interface StudentDaoInterface {
	
	public void viewStudentDetails();
	public void registerCourse(int input);	
    public void viewreportcard(int id);  
    public List<Catalog> viewCatalog();
    public void payFee(int id);
    public void course();
}
