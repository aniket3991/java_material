package com.udemy.app;

public class App {

	/**
	 * Constructor Overloading with Constructor Chaining
	 **/

	public static void main(String[] args) {

		House house = new House(2, 3, 6);    
		house.print();
		
		House house2 = new House(2, 4);    
		house2.print();
		
		House house3 = new House();    
		house3.print();
	}
}
