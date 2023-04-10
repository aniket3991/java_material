package com.udemy.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class App {

	/**
	 * Lists
	 * 
	 * List: A list is an ordered collection of elements that allows duplicate
	 * entries. Elements in a list can be accessed by an int index.
	 * 
	 * - ArrayList - LinkedList - Vector (and Stack)
	 **/

	public static void main(String[] args) {

		/**
		 * ArrayList vs LinkedList main differences
		 * 
		 * 1. AL act as a list, LL act as a list and queue both
		 * 
		 * 2. AL use dynamic array to store the elements <> LL use doubly linked list to
		 * store the elements
		 * 
		 * 3. Manipulation: AL slow, because if any element is removed from the array,
		 * all the bits are shifted in memory, LL faster because it uses a doubly linked
		 * list, so no bit shifting is required in memory
		 * 
		 * 4. AL better for storing and accessing data, LL is better for manipulating
		 * data
		 * 
		 */

		/**
		 * ArrayList vs LinkedList example
		 */

		List<String> arrayL = new ArrayList<>(); // creating ArrayList
		List<String> linkedL = new LinkedList<>(); // creating LinkedList

		// adding object in ArrayList
		arrayL.add("Kevin");
		arrayL.add("Joe");
		arrayL.add("Peter");
		// adding object in LinkedList
		linkedL.add("Kate");
		linkedL.add("Judy");
		linkedL.add("Julia");

		// iterate through with Iterator
		Iterator<String> itr = arrayL.iterator();
		System.out.println("ArrayList elements: ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(); // separation line

		// iterate through with for-each loop
		System.out.println("LinkedList elements: ");
		for (String s : linkedL) {
			System.out.println(s);
		}

		/**
		 * ArrayList vs Vector main differences
		 * 
		 * Vector and an ArrayList are almost equivalent. Main differences:
		 * 
		 * 1. Vector is synchronized, which means only one thread at a time can access
		 * the code (thread-safe), while arrayList is not synchronized, which means
		 * multiple threads can work on arrayList at the same time.
		 * 
		 * 2. ArrayList is faster than Vector
		 * 
		 * 3. ArrayList and Vector both grow and shrink dynamically but the way they
		 * resize is different. ArrayList increments 50% of the current array size if
		 * the number of elements exceeds its capacity, while vector increments 100% –
		 * essentially doubling the current array size.
		 * 
		 * 4. Vectors contains some legacy methods, for example Enumeration. It is a
		 * interface used to get elements of legacy collections(Vector, Hashtable). So
		 * Vectors can use both Enumeration and Iterator for traversing over elements.
		 */

		// creating Vector
		System.out.println(); // separation line
		Vector<String> v = new Vector<String>();
		v.addElement("red");
		v.addElement("blue");
		v.addElement("green");

		// traversing elements using Enumeration
		System.out.println("Vector elements: ");
		Enumeration e = v.elements();
		while (e.hasMoreElements())
			System.out.println(e.nextElement());
		System.out.println(); // separation line
		/**
		 * Stack class is the child class of Vector. It follows LIFO (Last in first out)
		 * mechanism.
		 * 
		 * Stack methods: 1. Object push(Object item) - Pushes the element into Stack
		 * and returns the same element
		 * 
		 * 2. Object pop() - Removes the element from Stack and returns the element
		 * 
		 * 3. Object peek() - Returns the top element from Stack.
		 * 
		 * 4. Object empty() - Returns true when the Stack is empty.
		 * 
		 * 5. int search(Object o) - Returns the offset value from the stack if the
		 * element is found, otherwise it returns -1.
		 */

		Stack st = new Stack();		
		st.push("Step by Step");      
        st.push("in");
        st.push("Java");
        
        System.out.println("Top element from Stack: " + st.peek());
        
        while(!st.empty()){
            System.out.println("Element pops out: "+st.pop());
        }
        
        System.out.println("After all elements pop out is the Stack empty? : "+st.empty());
	}
}
