package com.udemy.app;

import java.util.ArrayList;

public class App {

	/**
	 * Advanced Encapsulation
	 * Encapsulation:
	 * 1. fields set to private: restricted access
	 * 2. use setters and getters
	 * + for advanced: check validity of the setting data
	 **/

	public static void main(String[] args) {

		/**
		 * Advanced Encapsulation example
		 */

		Person p = new Person();
		p.setName("Kevin");
		p.setAge(20);
		//p.setAge(-20);
		System.out.println("The person's name is: " + p.getName() + " and the person's age is: " + p.getAge());

	}
}
