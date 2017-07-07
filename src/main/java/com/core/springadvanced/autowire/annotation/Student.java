package com.core.springadvanced.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	
	private Address address;
	
	
	
	public Student(Address address) {
		super();
		this.address = address;
	}
   
	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

}
