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
	 * Arrays methods
	 * 
	 * The toString() method returns a string representation of the contents of the specified array.
	 * 
	 * The sort() method sorts the integers in an ascending order.
	 * 
	 * The binarySearch() method searches the specified array of ints for the specified value The array must be
	 * sorted prior to making this call. If it is not sorted, the results are undefined. If the array contains
	 * multiple elements with the specified value, there is no guarantee which one will be found. Return: index of
	 * the search key, if it is contained in the array; otherwise, (-(insertion point) - 1). The insertion point
	 * is defined as the point at which the key would be inserted into the array: the index of the first element
	 * greater than the key, or array.length if all elements in the array are less than the specified key. Note
	 * that this guarantees that the return value will be >= 0 if and only if the key is found.
	 * 
	 * The fill() method assigns the specified int value to each element of the specified array of ints.
	 * 
	 * The copyOf() method copies the specified number of elements to a new array.
	 * 
	 * //The equals() method compares the two arrays. Two arrays are equal if they contain the same elements in
	 * the same order.
	 **/

	public static void main(String[] args) {

		int[] numbers = { 10, 5, 20, 33, 11 };
		System.out.println("Original array: " + Arrays.toString(numbers)); // toString() method !!!

		Arrays.sort(numbers); // sort() method !!!
		System.out.println("Sorted array:   " + Arrays.toString(numbers));

		int searchedElement = 33;
		int result = Arrays.binarySearch(numbers, searchedElement); // binarySearch() method !!!
		if (result >= 0) {
			System.out.println("The searched element is in the array, at the position: " + result);
		} else {
			System.out.println("The searched element is not in the array");
		}

		Arrays.fill(numbers, 77); // fill() method !!!
		System.out.println(Arrays.toString(numbers));

		int[] numbersB = Arrays.copyOf(numbers, 5); // copyOf() method !!!

		if (Arrays.equals(numbers, numbersB)) { // equals() method !!!
			System.out.println("The two array is equal");
		} else {
			System.out.println("The two array is not equal");
		}

		System.out.println(Arrays.toString(numbersB));
	}
}
