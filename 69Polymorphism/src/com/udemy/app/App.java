package com.udemy.app;

public class App {

	/**
	 * Polymorphism with Multilevel Inheritance &
	 * Runtime Polymorphism with Data Members
	 * 
	 **/

	public static void main(String[] args) {

		/**
		 * Polymorphism with Multilevel Inheritance
		 */

		Parent p1 = new Parent();
		Parent p2 = new Child();
		Parent p3 = new GrandChild();

		p1.travel();
		p2.travel();
		p3.travel();

		/**
		 * Runtime Polymorphism with Data Members
		 * 
		 * In Java, we can override methods only, not the variables(data members), so runtime polymorphism cannot be
		 * achieved by data members.
		 */
		System.out.println("Age: " + p1.age);
		System.out.println("Age: " + p2.age);
		System.out.println("Age: " + p3.age);

		/**
		 * Since variables are not overridden, the p1.age, p2.age and p3.age statements will always refer to data
		 * member of super class.
		 */

		// only in this case we will access the GrandChild's age
		GrandChild g = new GrandChild();
		System.out.println("Age: " + g.age);
	}
}
