package com.udemy.app;

import java.lang.reflect.Array;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class App {

	/**
	 * Generics methods
	 * 
	 * 1.) method overloading VS generics 2.) Generic method with two types
	 **/

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Hello Java!");
		String s = list.get(0);

		Integer[] arrayInt = { 1, 2, 3 };
		Character[] arrayChar = { 'A', 'B', 'C' };

		/**
		 * 1.) Old solution with method overloading with two method VS new solution with one Generic method (callings)
		 */
		printArray(arrayInt);
		System.out.println(); // new line
		printArray(arrayChar);
		System.out.println(); // new line
		/**
		 * Generic method with two types (callings)
		 */
		System.out.println(); // new line
		printTwoArrays(arrayInt, arrayChar);
		printTwoArrays(arrayChar, arrayInt);
		printTwoArrays(arrayInt, arrayInt);
		printTwoArrays(arrayChar, arrayChar);

	}

	/**
	 * 1.) Old solution with method overloading, two method
	 */
	static void printArray(Integer[] integer) {
		System.out.println("Old solution with method overloading - method with Integer: ");
		for (Integer i : integer) {
			System.out.print(i + ",");
		}
	}

	static void printArray(Character[] character) {
		System.out.println("Old solution with method overloading - method with Character: ");
		for (Character c : character) {
			System.out.print(c + ",");
		}
	}

	/**
	 * 1.) Generic solution with one method
	 */
//	static <T> void printArray(T[] t) {
//		System.out.println("Generic solution with one method: ");
//		for (T item : t) {
//			System.out.print(item);
//		}
//	}

	/**
	 * 2.) Generic method with two types
	 */
	static <T, V> void printTwoArrays(T[] t, V[] v) {
		for (T item : t) {
			for (V item2 : v) {
				System.out.print(item + ":" + item2 + " ");
			}
		}
		System.out.println(); // new line
	}

}
