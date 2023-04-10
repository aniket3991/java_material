package com.udemy.app;

import java.util.ArrayList;

public class App {

	/**
	 * Method Reference vs Lambda
	 * 
	 **/

	public static void main(String[] args) {

		/**
		 * 1.) method reference better in this case because of its simplicity
		 */

		// lambda
		Sum s = (i, i2) -> add(i, i2);
		System.out.println(s.adding(8, 9));

		// method reference
		Sum s2 = App::add;
		System.out.println(s2.adding(8, 9));

		/**
		 * 2.) lambda expression works only in this case
		 */

		// lambda
		Sum s3 = (i, i2) -> add(i, increaseValue(i2));
		System.out.println(s3.adding(8, 9));

		// method reference
		/**
		 * This simple case can’t be expressed with a method reference because method reference is just a shorthand
		 * syntax for a SIMPLE lambda expression that executes just one method without doing anything else. If you
		 * need adaptations or additional operations, there is no special syntax for method references to support
		 * that.
		 */

	}

	public static int add(int i, int i2) {
		return i + i2;
	}

	public static int increaseValue(int x) {
		x = x + 33;
		return x;
	}

}
