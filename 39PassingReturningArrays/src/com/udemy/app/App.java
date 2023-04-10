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
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class App {

	/**
	 * Passing Arrays to Method - Returning Array from a Method & Anonymous Array
	 * 
	 * Passing Arrays to Methods You can pass arrays to a method just like normal variables. When we pass an array
	 * to a method as an argument, actually the address of the array in the memory is passed (reference).
	 * Therefore, any changes to this array in the method will affect the array.
	 * 
	 * Anonymous Array An array in Java without any name is anonymous array. It is an array just for creating and
	 * using instantly. It can be used only once. Anonymous array is passed as an argument of method. Anonymous
	 * array is created and initialized in the same line.
	 **/

	public static void main(String[] args) {

		/**
		 * Passing Arrays to Method - Returning Array from a Method & Anonymous Array example
		 */

		int[] numbers = { 5, 7, 9 };
		System.out.println(Arrays.toString(numbers));

		int[] numbersBackwards = reverseOrder(numbers); // Passing Arrays to the Method
		System.out.println(Arrays.toString(numbersBackwards));

		System.out.println(Arrays.toString(reverseOrder(new int[] { 1, 2, 3 }))); // Anonymous Array

	}

	private static int[] reverseOrder(int[] num) {
		int[] numbersReverseOrder = new int[num.length];

		int position = num.length - 1;

		for (Integer n : num) {
			numbersReverseOrder[position] = n;
			position--;
		}

		return numbersReverseOrder; // Returning Array from the Method
	}
}
