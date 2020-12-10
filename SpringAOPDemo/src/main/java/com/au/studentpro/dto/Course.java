package com.au.studentpro.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	
	@Value("${apppro.course}")
	String courseName;
	@Value("80")
	int courseDuration;
	
	public Course(String courseName, int courseDuration) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseDuration=" + courseDuration + "]";
	}

	public void startTest()
	{
		System.out.println(" Test Started ... 1000 lines of online code ");
	}
	
}
