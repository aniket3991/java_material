package com.udemy.app;

/**
 * Any interface with a SAM (Single Abstract Method) is a functional interface, and its implementation may be
 * treated as lambda expressions.
 */

@FunctionalInterface
public interface Sum {
	public int adding(int i, int i2);

	// public int secondAbstractMethod(); //gives error, because of the SAM rule

	static void staticMethodExample() { // it's permitted, because of the SAM rule
		// code here
	};

	default void defMethodExample() { // it's permitted, because of the SAM rule
		// code here
	}

	/**
	 * Notice! The "SAM" speaks only about Abstract Method, so in a @FunctionalInterface there can be only one of
	 * Abstract Method, BUT as we have learned about Interfaces we can have default and static methods too. So in
	 * an @FunctionalInterface default and static methods are permitted.
	 */
}
