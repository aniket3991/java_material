package com.udemy.app;

public class App {

	/**
	 * Requesting JVM for running Garbage Collector - There is no guarantee that GC will run!!! It only suggests
	 * to the JVM that now might be a good time for some garbage collection. The call System.gc() is effectively
	 * equivalent to the call : Runtime.getRuntime().gc()
	 * 
	 * Nullifying the reference variable: left the previous object without reference -> Elligible for garbage
	 * collection
	 *
	 **/

	public static void main(String[] args) {

		// example 1
		Car a = new Car();
		a = null; // Nullifying the reference variable
		System.gc(); // Call GC
		/**
		 * Nothing happen when we call System.gc() because there is only 1 object elligible for garbage collection and
		 * the JVM doesn't feel the need for collect garbage immediately despite of the command System.gc()
		 */

		// example 2 (50 objects with System.gc() )
//		for (int i = 0; i < 50; i++) { 
//			// Create a new Car object
//			Car a2 = new Car();
//			a2 = null;
//			System.gc();
//		}

		// example 3 (500000 objects without System.gc())
//		for (int i = 0; i < 500000; i++) { 
//			// Create a new Car object
//			Car a3 = new Car();
//			a3 = null;
//			//System.gc();
//		}
		
		/**
		 * To call System.gc() is a bad practice. Let's all recognize that System.gc() isn't an absolute solution and
		 * you can't rely on it as a fix and it's probably a sign that you have some less-than-good code on your
		 * hands. Alternatives instead of System.gc(): - Re-read code. You might be holding on to references to
		 * objects without realizing it. - Adjust your JVM memory arguments and run profiling tools to figure out
		 * what's going on and why you seem to be running out of memory.
		 */
	}
}
