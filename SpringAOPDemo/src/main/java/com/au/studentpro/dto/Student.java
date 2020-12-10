package com.au.studentpro.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("${apppro.name}")
	private String studentname;
	private int rollNum;
	private int marks;
	
	@Autowired
	@Qualifier("course")
	private Course course;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int rollNum, int marks) {
		super();
		this.rollNum = rollNum;
		this.marks = marks;
	}

	

	public Student(String studentname, int rollNum, int marks, Course course) {
		super();
		this.studentname = studentname;
		this.rollNum = rollNum;
		this.marks = marks;
		this.course = course;
	}

	

	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", rollNum=" + rollNum + ", marks=" + marks + ", course="
				+ course + "]";
	}
	
	
	
	
	
}
