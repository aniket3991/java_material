package com.udemy.app;

/**
 * Multithreading - Creating thread by implementing Runnable Interface
 **/

class ThreadExampleClass implements Runnable {
	public void run() {
		try {
			System.out.println("Thread, number " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}

public class App {

	public static void main(String[] args) {

		int n = 6; // Number of threads
		for (int i = 0; i < n; i++) {
			Thread object = new Thread(new ThreadExampleClass());
			object.start();
		}
	}
}
