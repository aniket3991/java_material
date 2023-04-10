package com.udemy.app;

import java.util.Arrays;

interface FunctionalInterface {
	void show();
}

interface FunctionalInterface2 {
	MessageClass showMessage(String msg);
}

interface Sum {
	public int adding(int i, int i2);
}

public class App {

	/**
	 * Method References
	 * 
	 * There are four kinds of method references:
	 * 1. Reference to a Static Method
	 * 2. Reference to an Instance Method of a Particular Object
	 * 3. Reference to an Instance Method of an Arbitrary Object of a Particular Type
	 * 4. Reference to a Constructor
	 * 
	 **/

	public static void main(String[] args) {

		/**
		 * 1. Reference to a Static Method
		 */
		// Referring static method
		FunctionalInterface funcInt = App::staticGreeting;
		// Calling interface method
		funcInt.show();

		/**
		 * 2. Reference to an Instance Method of a Particular Object
		 */
		// A.) refer methods by class object
		App a = new App();
		FunctionalInterface f = a::instanceGreeting;
		f.show();
		// B.) refer methods by anonymous object
		FunctionalInterface f2 = new App()::instanceGreeting;
		f2.show();

		/**
		 * 3. Reference to an Instance Method of an Arbitrary Object of a Particular Type
		 */

		String[] stringArray = { "Kevin", "Alan", "Joe" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		System.out.println("Array's sorted elements: " + Arrays.toString(stringArray));

		/**
		 * 4. Reference to a Constructor
		 */
		FunctionalInterface2 f3 = MessageClass::new;
		f3.showMessage("Hello, this is Reference to a Constructor case.");
	}

	public static void staticGreeting() {
		System.out.println("Hello, this is static method.");
	}

	public void instanceGreeting() {
		System.out.println("Hello, this is instance, non-static method.");
	}
}
