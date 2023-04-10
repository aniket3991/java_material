package com.udemy.app;

public class App implements OuterInterface.NestedInterface, OuterClass.NestedInterfaceInClass {

	/**
	 * Abstraction - Nested Interface
	 * 
	 * An interface which is declared inside another interface or class is called nested (or inner) interface. The
	 * nested interfaces are used to group related interfaces so that they can be easy to maintain. The nested
	 * interface must be referred by the outer interface or class. It can't be accessed directly.
	 **/

	public static void main(String[] args) {

		/**
		 * Nested Interface in Interface
		 */
		OuterInterface.NestedInterface msg = new App(); // upcasting
		msg.messageIn();

		/**
		 * Nested Interface in Class
		 */
		OuterClass.NestedInterfaceInClass msg2 = new App();
		msg2.show();

	}

	/**
	 * Nested Interface in Interface
	 */
	@Override
	public void messageIn() {
		System.out.println("NestedInterface's method overriding");
	}

	/**
	 * Nested Interface in Class
	 */
	@Override
	public void show() {
		System.out.println("NestedInterface from Class method overriding");
	}
}
