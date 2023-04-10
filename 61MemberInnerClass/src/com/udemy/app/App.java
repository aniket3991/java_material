package com.udemy.app;

public class App {

	/**
	 * Member Inner Class
	 * 
	 * Member Inner Class created within class and outside method.
	 * Member Inner class is accessing the instance variable member of the Outer class.
	 * 
	 **/

	public static void main(String[] args) {

		OuterClass oClass = new OuterClass();
		OuterClass.InnerClass iClass = oClass.new InnerClass();
		iClass.showMsg();
	}
}
