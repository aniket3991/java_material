package com.udemy.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	/**
	 * Generics lower bounded wildcard example
	 * 
	 * The Upper Bounded Wildcards section shows that an upper bounded wildcard restricts the unknown type to be a
	 * specific type or a subtype of that type and is represented using the extends keyword. In a similar way, a
	 * lower bounded wildcard restricts the unknown type to be a specific type or a super type of that type.
	 * 
	 * In our example arguments can be Integer or superclass of Integer(which is Number). List<? super Integer>
	 * list
	 **/

	public static void main(String[] args) {
		ArrayList<Integer> listInteger = new ArrayList<>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(3);
		addAndPrintElements(listInteger);

		ArrayList<Number> listNumber = new ArrayList<>();
		listNumber.add(10);
		listNumber.add(20);
		listNumber.add(30);
		addAndPrintElements(listNumber);
	}

	/**
	 * Without wildcard this looks like: List<Integer> list, or List<Number> list but then only one specific type
	 * is good for calling this method
	 * 
	 * you can add when using lower bounded wildcard
	 * 
	 * we can't iterate with Integer or Number, only Object
	 */
	public static void addAndPrintElements(List<? super Integer> list) {
		list.add(100); // we can add
		list.add(200);
		list.add(300);

//		 for(Integer i : list) {
//		 System.out.println(i);
//		 }

		System.out.println(list);
	}

}
