package com.udemy.app;

public class Person {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	/**
	 * 1. Simple setter
	 */

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 2. Advanced Encapsulation example
	 * set the "age" variable to the new value, otherwise you ignore
	 */

//	public void setAge(int age) {
//		if (age >= 0) {
//			this.age = age;
//		}
//	}

	/**
	 * 3. Advanced Encapsulation example
	 * improved version - set the "age" variable to the new value, otherwise throw exception
	 */

//	public void setAge(int age) {
//		if (age < 0) {
//			throw new IllegalArgumentException("Age cannot be a negative number");
//		}
//		this.age = age;
//	}

}
