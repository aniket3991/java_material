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
	 * ArrayList methods
	 * 
	 * add() : insert a new value in the ArrayList (or into a specific position)
	 * remove() : remove the first matching value in the ArrayList (or remove the element at a specified index)
	 * set() : changes one of the elements of the ArrayList without changing the size
	 * contains() : checks whether a certain value is in the ArrayList
	 * size() : shows the size of the ArrayList
	 * clear() : provides an easy way to discard all elements of the ArrayList
	 * isEmpty() : shows the ArrayList is empty or not 
	 * equals() : ArrayList has a custom implementation of equals() so you can compare two lists to see if they
	 * 		contain the same elements in the same order
	 **/

	public static void main(String[] args) {

		/**
		 * add() method
		 */
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Mercedes");
		cars.add("Toyota");

		showArrayList(cars);

		cars.add(2, "Kia");
		// cars.add(10, "Kia"); //if the position does not fit for the ArrayList:
		// IndexOutOfBoundsException

		showArrayList(cars);

		/**
		 * remove() method
		 */
		cars.remove("Toyota");
		cars.remove(2);
		// cars.remove(10); //if the position does not exists in the ArrayList:
		// IndexOutOfBoundsException

		showArrayList(cars);

		/**
		 * set() method
		 */
		cars.set(0, "Tesla");

		showArrayList(cars);

		/**
		 * contains & size() methods
		 */
		System.out.println(cars.contains("Ford"));
		System.out.println(cars.size());

		/**
		 * clear() method
		 */
		cars.clear();
		showArrayList(cars);

		/**
		 * isEmpty() method
		 */
		System.out.println(cars.isEmpty());

		/**
		 * equals() method
		 */
		ArrayList<String> cars2 = new ArrayList<String>();
		cars.add("Nissan");
		System.out.println(cars.equals(cars2));

	}

	public static void showArrayList(ArrayList<String> cars) {
		System.out.print("Current elements in the Cars ArrayList:  ");
		for (String c : cars) {
			System.out.print(c + "  ");
		}
		System.out.println(); // separation line
	}
}
