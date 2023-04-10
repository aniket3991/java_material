package com.udemy.app;

public class App {

	/**
	 * Method Overloading
	 * 
	 * If a class has multiple methods having same name but different in parameters, it is known as Method
	 * Overloading. There are two ways to overload the method in java:
	 * 1. changing number of arguments
	 * 2. changing the data type
	 **/

	public static void main(String[] args) {

		System.out.println(add(8, 15)); // two integer arguments
		System.out.println(add(12.3, 12.6)); // two double arguments
		System.out.println(add(9, 20, 30)); // three integer arguments
	}

	static int add(int a, int b) {
		System.out.println("adding 2 int method");
		return a + b;
	}

	static double add(double a, double b) {
		System.out.println("adding 2 double method");
		return a + b;
	}

	static int add(int a, int b, int c) {
		System.out.println("adding 3 int method");
		return a + b + c;
	}
}
