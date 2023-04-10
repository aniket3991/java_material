package com.udemy.app;

public class App {

	/**
	 * Inheritance
	 * 
	 **** 
	 * Single-level Inheritance
	 * 
	 * Base Class - Derived Class
	 * 
	 **** 
	 * Multilevel Inheritance
	 * 
	 * Base Class - Intermediatory Class - Derived Class
	 * A class can inherit from a derived class too, thereby making this derived class (Intermediatory Class)
	 * the base class for the new class.
	 * 
	 **** 
	 * Hierarchical Inheritance 
	 * One class serves as a base (super) class for more than one sub class
	 * 
	 * 			  - Derived Class A 
	 * Base Class - Derived Class B
	 * 			  - Derived Class C
	 * 
	 **** 
	 * Multiple Inheritance 
	 * In Multiple inheritance ,one class can have more than one superclass and inherit features from all parent
	 * classes. Please note that Java does not support multiple inheritance with classes. In java, we can achieve
	 * multiple inheritance only through Interfaces.
	 * 
	 * interface A -
	 * interface B - Derived Class
	 * 
	 **** 
	 * Hybrid Inheritance 
	 * It is a mix of two or more of the above types of inheritance.
	 * For example:
	 * 
	 * Interface A -
	 * Base class  - Derived Class
	 * Interface B -
	 * 
	 **/

	public static void main(String[] args) {
		
		/**
		 * Single-level Inheritance example
		 * 
		 * Parent - Child
		 */
		System.out.println("- Single-level Inheritance -");

		Child child = new Child();
		child.greatingsFromParent();
		child.greatingsFromChild();
		
		/**
		 * Multilevel Inheritance example
		 * 
		 * Parent - Child - Grandchild
		 */
		
		System.out.println("- Multilevel Inheritance -");

		Grandchild grandChild = new Grandchild();
		grandChild.greatingsFromParent();
		grandChild.greatingsFromChild();
		grandChild.greatingsFromGrandchild();
		
		 /** Hierarchical Inheritance example
		 * 		     
		 * Parent - Child 
		 * 		  - Child2 
		 */
		
		System.out.println("- Hierarchical Inheritance -");
		Child c = new Child();
		Child2 c2 = new Child2();

		c.greatingsFromParent();
		c.greatingsFromChild();
		c2.greatingsFromParent();
		c2.greatingsFromChild2();
		
		/**
		 * Multiple Inheritance example
		 * 
		 * Interface1 -
		 * Interface2 - (Interface3) - MultipleInheritanceClass
		 */
		
		System.out.println("- Multiple Inheritance -");
		MultipleInheritanceClass mClass = new MultipleInheritanceClass();
		mClass.method1();
		mClass.method2();
		
		/**
		 * Hybrid Inheritance example
		 * 
		 * Interface1 -
		 * Interface2 - (Interface3) - HybridInheritanceClass
		 * Parent     -
		 */
		
		System.out.println("- Hybrid Inheritance -");
		HybridInheritanceClass hClass = new HybridInheritanceClass();
		hClass.method1();
		hClass.method2();
		hClass.greatingsFromParent();
		
		
		
	}
}
