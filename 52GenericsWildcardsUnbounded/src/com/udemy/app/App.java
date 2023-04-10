package com.udemy.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	/**
	 * Generics unbounded wildcard example
	 * 
	 * Unbounded wildcard type is specified using the wildcard character (?). This is called a list of unknown
	 * type. These are useful in the following cases:
	 * 
	 * 1. When writing a method which can be employed using functionality provided in Object class.
	 * 
	 * 2. When the code is using methods in the generic class that don’t depend on the type parameter
	 * 
	 * List<?> list
	 **/

	public static void main(String[] args) {
		ArrayList<Integer> listInteger = new ArrayList<>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(3);

		ArrayList<Number> listDouble = new ArrayList<>();
		listDouble.add(10.50);
		listDouble.add(20.40);
		listDouble.add(30.33);

		ArrayList<String> listString = new ArrayList<>();
		listString.add("one");
		listString.add("two");
		listString.add("three");

		printAll(listInteger);
		printAll(listDouble);
		printAll(listString);

	}

	public static void printAll(List<?> list) {
		for (Object item : list)
			System.out.println(item + " ");
	}

}
