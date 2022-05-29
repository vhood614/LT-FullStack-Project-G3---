package com.lt.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseDao implements CourseDaoInterface {

	@Override
	public void returnCoursesList() {
		// TODO Auto-generated method stub
		List courseList = new ArrayList<>();
		courseList.add("Computer Science");
		courseList.add("Data Mining");
		courseList.add("Data Science");
		courseList.add("Data Architect");

		Iterator<String> i = courseList.iterator();
		while (i.hasNext()) {
			String test = i.next();
			System.out.println("-> " + test);
		}

	}

}
