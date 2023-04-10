package com.udemy.app;

import java.util.Scanner;

public class App {

	/**
	 * Exceptions
	 **/

	public static void main(String[] args) {

		/**
		 * Catching Multiple Exception
		 */

		Scanner scn = new Scanner(System.in);
		try {
			System.out.println("Give me a number: ");
			int n = Integer.parseInt(scn.nextLine());
			System.out.println(20 / n);
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic " + ex);
		} catch (NumberFormatException ex) {
			System.out.println("Number Format Exception " + ex);
		}
		scn.close();
		System.out.println("more code...");
	}
}
