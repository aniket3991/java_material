package com.udemy.app;

//public class App implements ModernInterface, AnotherInterface
public class App implements ModernInterface {

	/**
	 * Modern Interface
	 * Originally an interface could only have abstract methods, but with JDK 8 changes have come. From JDK 8 the
	 * interface body can contain abstract methods, default methods, and static methods too.
	 **/

	public static void main(String[] args) {

		App a = new App();

		// abstract method calling
		a.showAbstract();

		// static method calling
		ModernInterface.showStatic();

		// default method calling
		a.showDefault();

	}

	@Override
	public void showAbstract() {
		System.out.println("ModernInterface's abstract method overrided");
	}

	/**
	 * Multiple Defaults
	 * 
	 * With default functions in interfaces, there is a possibility that a class is implementing two interfaces
	 * with same default methods.
	 * 
	 * 1. We can override
	 * 2. We can call the default method of the specified interface using super
	 */

//	public void showDefault() {
//		System.out.println("Overrided default method"); // override
//		//ModernInterface.super.showDefault(); // method from ModernInterface
//		//AnotherInterface.super.showDefault(); // method from AnotherInterface
//	}

}
