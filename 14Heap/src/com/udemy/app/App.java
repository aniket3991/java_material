package com.udemy.app;

/**
 * 
 * Heap Memory in practice
 *
 */

public class App {

	public static void main(String[] args) {
		/**
		 * Every Java application has a single instance of class Runtime that allows the application to interface with
		 * the environment in which the application is running. The current runtime can be obtained from the
		 * getRuntime method.
		 */

		Runtime runtime = Runtime.getRuntime(); // Get an instance of the Runtime class

		/**
		 * totalMemory: Memory currently available for Heap (in Bytes), total amount of memory in the JVM the default
		 * value is chosen at runtime based on system configuration
		 */

		// long totalMemory = runtime.totalMemory();
		// System.out.println("Heap memory currently available for use: " + totalMemory + " Bytes");

		/**
		 * 1 MB = 1024 KB, 1 KB = 1024 Bytes -> 1MB = 1024 * 1024 Bytes -> 1MB = 1.048.576 Bytes
		 */
		long MegaBytes = 1048576;
		long totalMemory = runtime.totalMemory() / MegaBytes;
		System.out.println("Heap memory currently available for use: " + totalMemory + " MB");

		/**
		 * maxMemory: Returns the maximum amount of memory that the JVM will attempt to use. JVM can expand Heap
		 * whenever it needs, but it cannot grow beyond this size.
		 */

		long maxMemory = runtime.maxMemory() / MegaBytes;
		System.out.println("Maximum memory Heap can use: " + maxMemory + " MB");

		/**
		 * freeMemory: Returns the amount of free memory in the Java Virtual Machine. Free memory still available.
		 */

		long freeMemory = runtime.freeMemory() / MegaBytes;
		System.out.println("Free memory still available in Heap: " + freeMemory + " MB");

		/**
		 * Memory currently used by Heap
		 */

		long memoryInUse = totalMemory - freeMemory;
		System.out.println("Memory currently used by Heap: " + memoryInUse + " MB");

	}
}
