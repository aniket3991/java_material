package com.udemy.app;

import java.util.ArrayList;

class Box<T> {
	// type T is declared
	private T element;

	// constructor
	public Box(T element) {
		this.element = element;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

}

public class App {

	/**
	 * Generic Class example
	 **/

	public static void main(String[] args) {

		// instance of Integer type
		Box<Integer> intBox = new Box<Integer>(15);
		System.out.println(intBox.getElement());

		// instance of String type
		Box<String> stringBox = new Box<String>("Hello Java!");
		System.out.println(stringBox.getElement());

	}
}
