package com.udemy.app;

public class Car {

	/**
	 * Just before destroying an object, Garbage Collector calls finalize() method on the object to perform
	 * cleanup activities. Once finalize() method completes, Garbage Collector destroys that object.
	 * 
	 * finalize() is deprecated from JDK 9 : The finalization mechanism is inherently problematic. Finalization
	 * can lead to performance issues, deadlocks, and hangs. -> don't use it
	 **/
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + " Object cleaned from memory");
	}
}
