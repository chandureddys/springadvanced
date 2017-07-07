package com.core.springadvanced.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/core/springadvanced/autowire/config.xml");
		Student student= (Student) context.getBean("student");
		System.out.println(student);
		
	}

}
