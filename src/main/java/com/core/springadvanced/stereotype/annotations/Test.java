package com.core.springadvanced.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.springadvanced.autowire.annotation.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/core/springadvanced/stereotype/annotations/config.xml");
		Instructor instructor= (Instructor) context.getBean("instructor");
		System.out.println(instructor);
		
		
	}

}
