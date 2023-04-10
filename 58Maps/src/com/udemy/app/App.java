package com.udemy.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	/**
	 * Maps
	 * 
	 * Map can store pairs of keys and values. Each key is linked to a specific value. Once stored in a Map, you
	 * can later look up the value using just the key.
	 * 
	 * HashMap - Hashtable - LinkedHashMap - TreeMap
	 * 
	 * HashMap doesn’t allow duplicate keys but allows duplicate values. HashMap is implemented as a hash table,
	 * and there is no ordering on keys or values. Hashtable is quite similar to HashMap. The main difference is
	 * that HashMap is not synchronized (not thread-safe), therefore it’s faster and uses less memory than
	 * Hashtable. Hashtable is slower, but it's synchronized (thread-safe). + Hashtable doesn't allow duplicate
	 * values.
	 * 
	 * LinkedHashMap preserves the insertion order
	 * 
	 * A TreeMap stores the keys in a sorted tree structure. The main benefit is that the keys are always in
	 * sorted order.
	 * 
	 * Main methods:
	 * 
	 * Object put(Object k, Object v) Puts an entry in the invoking map, overwriting any previous value associated
	 * with the key.
	 * get(Object k) Returns the value associated with the key k. 
	 * int size() Returns the number of key/value pairs in the map. 
	 * clear() Removes all key/value pairs from the invoking map. etc.
	 * entrySet() Returns a Set that contains the entries in the map.
	 **/

	public static void main(String[] args) {

		// HashMap
		Map<Integer, String> mapHM = new HashMap<>();
		mapHM.put(155, "Joe");
		mapHM.put(90, "Tom");
		mapHM.put(30, "Adam");
		mapHM.put(101, "Adam");
		mapHM.put(10, "Kate");
		mapHM.put(10, "Judy"); // rewrite the VALUE of the KEY 10 to Judy

		System.out.println("Value of the Key 10 is: " + mapHM.get(10)); // Judy: the second VALUE of KEY10
		System.out.println("In the HashMap the elements number is: " + mapHM.size()); // 5 because KEY10's VALUE is
																						// overwritten

		System.out.println("- HashMap - no ordering");
		for (Map.Entry<Integer, String> entry : mapHM.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		// LinkedHashMap
		Map<Integer, String> mapLHM = new LinkedHashMap<>();
		mapLHM.put(155, "Joe");
		mapLHM.put(90, "Tom");
		mapLHM.put(30, "Adam");
		mapLHM.put(101, "Adam");
		mapLHM.put(10, "Judy");

		System.out.println("- LinkedHashMap - insertion order");
		for (Map.Entry<Integer, String> entry : mapLHM.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		// TreeMap
		Map<Integer, String> mapTM = new TreeMap<>();
		mapTM.put(155, "Joe");
		mapTM.put(90, "Tom");
		mapTM.put(30, "Adam");
		mapTM.put(101, "Adam");
		mapTM.put(10, "Judy");

		System.out.println("- TreeMap - sorted order");
		for (Map.Entry<Integer, String> entry : mapTM.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		// TreeMap from HashMap
		Map<Integer, String> mapTM2 = new TreeMap<>(mapHM);
		System.out.println("- TreeMap from HashMap - sorted order");
		for (Map.Entry<Integer, String> entry : mapTM2.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
