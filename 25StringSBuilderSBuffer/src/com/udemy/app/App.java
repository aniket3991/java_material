package com.udemy.app;

import java.util.ArrayList;

public class App {

	/**
	 * String VS String Builder VS String Buffer
	 **/

	public static void main(String[] args) {

		/**
		 * String VS String Builder object generation / hashCode()
		 */

		String string = "Alexander";
		System.out.println(string.hashCode());
		string = string + " the Great";
		System.out.println(string.hashCode());
		System.out.println(string);

		StringBuilder sb = new StringBuilder("Alexander");
		System.out.println(sb.hashCode());
		sb.append(" the Great");
		System.out.println(sb.hashCode());
		System.out.println(sb);

		/**
		 * HashCode() method is used to generate a numerical representation of the contents of an object. By default
		 * the hashCode() returns an integer that represents the internal memory address of the object. Whenever it is
		 * invoked on the same object more than once during an execution of a Java application, the hashCode method
		 * must consistently return the same integer.
		 */

		/**
		 * String Buffer VS String Builder speed comparison
		 */

		// String Buffer
		StringBuffer stringbuffer = new StringBuffer();
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			stringbuffer.append("Java");
		}

		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Duration of StringBuffer's running is: " + duration + " milliSecond");

		// String Builder
		StringBuilder stringbuilder = new StringBuilder();
		long startTime2 = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			stringbuilder.append("Java");
		}

		long endTime2 = System.currentTimeMillis();
		long duration2 = endTime2 - startTime2;
		System.out.println("Duration of StringBuilder's running is: " + duration2 + " milliSecond");

	}
}
