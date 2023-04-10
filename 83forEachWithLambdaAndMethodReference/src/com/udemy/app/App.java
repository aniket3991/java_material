package com.udemy.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

	/**
	 * forEach with Lambda and Method reference
	 * 
	 * Introduced in Java 8, the forEach loop provides programmers with a new, simplified way for
	 * iterating over a collection.
	 **/

	public static void main(String[] args) {

		/**
		 * List
		 */

		List<String> names = new ArrayList<>();
		names.add("Kevin");
		names.add("Alan");
		names.add("Joe");

		// enhanced for loop version of iterating
		System.out.println("for-loop version of iterating:");
		for (String s : names) {
			System.out.println(s);
		}

		// with Lambda expression
		System.out.println("using forEach with Lambda:");
		names.forEach(s -> System.out.println(s));

		// with Method Reference
		System.out.println("using forEach with Method Reference:");
		names.forEach(System.out::println);

		/**
		 * Set
		 */

		// works on HashSet
		System.out.println("using forEach on HashSet:");
		Set<String> uniqueNames = new HashSet<>(Arrays.asList("Larry", "Steve", "James"));
		uniqueNames.forEach(System.out::println);

		/**
		 * Map
		 */

		// enhanced for loop version of iterating
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);

		System.out.println("using forEach on Map:");
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}

		// lambda
		System.out.println("using forEach on Map with Lambda:");
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		// method reference
		// items.forEach(System.out::println);
		// Error: The type PrintStream does not define println(String, Integer) that is applicable here

		/**
		 * we can use method reference in cases where Lambda body only contains a call to another method. But since
		 * there are two implicit variables ( key and value) and we cannot use the below code to call println() method
		 * of System.out class.
		 */
	}

}
