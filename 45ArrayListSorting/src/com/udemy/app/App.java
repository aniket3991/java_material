package com.udemy.app;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	/**
	 * 
	 * Iterating over an ArrayList & ArrayList sorting
	 * 
	 **/

	public static void main(String[] args) {

		// loop through an ArrayList with the for-each loop
		ArrayList<String> names = new ArrayList<String>();
		names.add("Joe"); // The add() methods insert a new value in the ArrayList.
		names.add("Kevin");
		names.add("Alan");
		names.add("James");
		for (String n : names) {
			System.out.println(n);
		}
		System.out.println(); // separation line

		// ArrayList is a part of the Java collection framework that's why we can use Collections.sort statement
		Collections.sort(names);
		System.out.println("Sorted names:");
		for (String n : names) {
			System.out.println(n);
		}

	}
}
