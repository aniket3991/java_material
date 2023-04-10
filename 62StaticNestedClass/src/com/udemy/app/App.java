package com.udemy.app;

public class App {

	/**
	 * Static Nested Class
	 * 
	 * Static Nested Class created within class. And it's a static class that is defined at the same level as
	 * static variables. It's accessing the static variable member of the Outer class, but it cannot access
	 * non-static instance variables and methods of the outer class.
	 * Nested class can be accessed without instantiating the outer class.
	 * 
	 **/

	public static void main(String[] args) {
		OuterClass.NestedClass nClass = new OuterClass.NestedClass();
		nClass.showMsg();
	}
}
