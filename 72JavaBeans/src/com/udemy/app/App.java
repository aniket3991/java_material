package com.udemy.app;

public class App {

	/**
	 * JavaBeans
	 * JavaBeans are classes that encapsulate many objects into a single object (the bean).
	 * JavaBeans should follow following conventions:
	 * 1. Must implement Serializable
	 * 2. It should have a public zero-argument constructor
	 * 3. All properties must be private and allow access to properties using getter and setter methods
	 **/

	public static void main(String[] args) {

		/**
		 * JavaBeans example
		 */

		//to access JavaBean class
		JavaBeanExample bean = new JavaBeanExample(); // object is created 
		bean.setName("Bean Example"); // setting value to the object 
		bean.setId(199);
        System.out.println(bean.getName() + ", " + bean.getId()); 

	}
}
