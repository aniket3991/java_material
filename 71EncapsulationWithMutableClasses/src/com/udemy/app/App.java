package com.udemy.app;

import java.util.ArrayList;

public class App {

	/**
	 * Encapsulation with Mutable Classes
	 * We must be careful when encapsulating mutable objects.
	 **/

	public static void main(String[] args) {

		/**
		 * Encapsulation with Mutable Classes example
		 */

		ArrayList<String> brands = new ArrayList<String>();
		brands.add("Ford");
		brands.add("BMW");
		brands.add("Honda");
		Cars cars = new Cars(brands); // through the constructor we initialize Cars class carNames Arraylist

		for (String carNames : cars.getCarNames()) { // print out the elements
			System.out.print(carNames + " ");
		}

		ArrayList<String> localArrayList = cars.getCarNames(); // Storing the return value
		localArrayList.add("Toyota"); // Changing the object returned

		System.out.println(); // new line
		for (String carNames : cars.getCarNames()) { // print out again the elements from encapsulated class
			System.out.print(carNames + " ");
		}

	}
}
