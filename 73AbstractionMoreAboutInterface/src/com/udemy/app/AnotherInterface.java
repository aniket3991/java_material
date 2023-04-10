package com.udemy.app;

public interface AnotherInterface {
	
	//default method
	public default void showDefault() {
		System.out.println("AnotherInterface's default method");
	};
}
