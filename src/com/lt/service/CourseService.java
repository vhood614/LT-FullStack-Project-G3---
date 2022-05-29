package com.lt.service;

import com.lt.dao.CourseDao;

public class CourseService implements CourseServiceInterface{
	
	public void listCourses()  {
		CourseDao courseDao = new CourseDao();
		courseDao.returnCoursesList();
		
	}

}
