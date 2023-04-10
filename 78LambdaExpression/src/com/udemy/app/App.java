package com.udemy.app;

public class App {

	/**
	 * Lambda expression
	 * 
	 **/

	public static void main(String[] args) {

		/**
		 * Lambda expression example
		 * 
		 **/
		
		// without lambda, Sum implementation using anonymous implementation of interface
		Sum s = new Sum() {
			@Override
			public int adding(int i, int i2) {
				return i + i2;
			}
		};
		System.out.println(s.adding(4, 2));
		
		// with lambda		
		Sum s2 = (int i, int i2) -> {return i+i2;};
		
		//simplified lambda expression
		//Sum s2 = (i, i2) -> i+i2;
		
		System.out.println(s2.adding(5, 3));
		
		/**
		 * Lambda expression without parameter or with one parameter example
		 * 
		 **/
		
		//without parameter interface method case
		Greatings g = () -> System.out.println("Hello ");
		g.sayHello();
		
		
		//with one parameter interface method case
//		Greatings g = str -> System.out.println("Hello " + str);
//		g.sayHello("Java");
		

	}

}
