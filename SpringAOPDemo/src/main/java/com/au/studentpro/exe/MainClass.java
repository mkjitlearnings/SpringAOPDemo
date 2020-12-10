package com.au.studentpro.exe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.au.studentpro.dto.Student;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
		Student s = context.getBean("student",Student.class);
		s.getCourse().startTest();
		System.out.println(s);
		
			
	}
}
