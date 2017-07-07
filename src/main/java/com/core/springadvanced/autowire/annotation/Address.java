package com.core.springadvanced.autowire.annotation;

public class Address {
	
	private String country;
	
	private String state;
	
	private String village;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", village=" + village + "]";
	}
	
	

}
