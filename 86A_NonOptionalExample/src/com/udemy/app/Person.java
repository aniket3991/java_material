package com.udemy.app;

public class Person {
	private String name;
	private Passport passport;
	
	public Person(String name, Passport passport) {
		this.name = name;
		this.passport = passport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	

}
