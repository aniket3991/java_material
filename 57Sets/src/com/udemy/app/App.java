package com.udemy.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class App {

	/**
	 * Sets
	 * 
	 * You use a set when you don’t want to allow duplicate entries. Booth of the sets are not synchronized. main
	 * methods: add, remove, contains, etc.
	 * 
	 * HashSet - LinkedHashSet - TreeSet
	 * 
	 * A HashSet stores its elements in a hash table. This means that uses the hashCode() method of the objects to
	 * retrieve them more efficiently. HashSet the most common set!
	 * 
	 * LinkedHashSet: If you need a HashSet that can be store items by the insertion order.
	 * 
	 * A TreeSet stores its elements in a sorted tree structure. The main benefit is that the set is always in
	 * sorted order. TreeSet is slower than HashSet.
	 * 
	 **/

	public static void main(String[] args) {

		// HashSet
		Set<Integer> listHS = new HashSet<>();

		listHS.add(10);
		listHS.add(5);
		listHS.add(5);
		listHS.add(100);
		listHS.add(500);

		System.out.println(listHS.contains(500)); // contains method
		listHS.remove(500);
		System.out.println(listHS.contains(500)); // contains method

		System.out.println("-HashSet:");
		for (Integer i : listHS) {
			System.out.println(i); // Elements in HashSet are not ordered
		}

		// LinkedHashSet
		Set<Integer> listLHS = new LinkedHashSet<>();

		listLHS.add(10);
		listLHS.add(5);
		listLHS.add(5);
		listLHS.add(100);

		System.out.println("-LinkedHashSet:");
		for (Integer i : listLHS) {
			System.out.println(i); // LinkedHashSet stores items by the insertion order
		}

		// TreeSet
		Set<Integer> listTS = new TreeSet<>();

		listTS.add(10);
		listTS.add(5);
		listTS.add(5);
		listTS.add(100);

		System.out.println("-TreeSet:");
		for (Integer i : listTS) {
			System.out.println(i); // TreeSet stores its elements in a sorted order
		}

		// TreeSet from a HashSet
		/**
		 * Because HashSet is faster, in general, if you want a sorted set then it is better to add elements to
		 * HashSet and then convert it into TreeSet rather than creating a TreeSet and adding elements to it.
		 */
		Set<Integer> listTS2 = new TreeSet<>(listHS);
		System.out.println("-TreeSet from HashSet:");
		for (Integer i : listTS2) {
			System.out.println(i);
		}
	}
}
