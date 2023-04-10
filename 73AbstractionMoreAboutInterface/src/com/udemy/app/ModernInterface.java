package com.udemy.app;

/**
 * Modern Interface
 */

public interface ModernInterface {

	//abstract method
	public void showAbstract();
	
	//static method
	public static void showStatic() {
		System.out.println("ModernInterface's static method");
	}
	
	//default method
	public default void showDefault() {
		System.out.println("ModernInterface's default method");
	};

}
