package com.udemy.app;

import java.util.ArrayList;
import java.util.List;

public class App {

	/**
	 * Generics upper bounded wildcard example
	 * 
	 * You can use an upper bounded wildcard to relax the restrictions on a variable.
	 * 
	 * In our example to write the method that works on lists of Number and the subtypes of Number, such as
	 * Integer, Double, and Float, you would specify. List<? extends Number> list
	 **/

	public static void main(String[] args) {

		List<Integer> listInteger = new ArrayList<>();
		listInteger.add(10);
		listInteger.add(20);
		process(listInteger);

		List<Double> listDouble = new ArrayList<>();
		listDouble.add(10.5);
		listDouble.add(20.3);
		process(listDouble);
	}

	/**
	 * Without wildcard this looks like: List<Integer> list, or List<Double> list but then only one specific type
	 * is good for calling this method
	 * 
	 * you can't add with upper bounded wildcard, but if you change to lower bounded wildcard you can <? super
	 * Number>
	 */

	public static void process(List<? extends Number> list) { // upper bounded wildcard
		// list.add(22); //error -> you can't add with upper bounded wildcard
		for (Number item : list) {
			System.out.println(item);
		}
	}
}
