package com.udemy.app;

public class App {

	/**
	 * Exceptions
	 **/

	public static void main(String[] args) {

		/**
		 * ExceptionHandling with MethodOverriding
		 */
		
		ExceptionParent p = new ExceptionChild(); 
        p.method(); 

    }
	
}
