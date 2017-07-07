package com.core.springadvanced.standalone.cllections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.springadvanced.autowire.annotation.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/core/springadvanced/standalone/cllections/config.xml");
		Products products= (Products) context.getBean("products");
		System.out.println(products);
		
		
	}

}
