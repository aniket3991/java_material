package com.udemy.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class App {

	/**
	 * Queue
	 * 
	 * Queue: You use a queue when elements are added and removed in a specific order. Queues are typically used
	 * for sorting elements prior to processing them. Java Queue interface orders the element in FIFO(First In
	 * First Out) manner. In FIFO, first element is removed first and last element is removed at last.
	 * 
	 * PriorityQueue - ArrayDeque
	 * 
	 * PriorityQueue
	 * The PriorityQueue class provides the facility of using queue. But it does not orders the elements in FIFO
	 * manner. The elements of the priority queue are ordered according to their natural ordering defined by the
	 * Comparable interface.
	 * 
	 * ArrayDeque
	 * We will talk about it in the next lecture.
	 * 
	 * Methods:
	 *  
	 * add(object) add elements to the queue
	 * offer(object) insert the specified element into this queue
	 * remove() removes the head of this queue
	 * element() retrieves, but does not remove, the head of this queue
	 * peek() retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
	 * poll() retrieves and removes the head of this queue, or returns null if this queue is empty
	 *
	 */

	public static void main(String[] args) {

		// PriorityQueue example

		Queue<AccessCard> card = new PriorityQueue<>();
		card.add(new AccessCard("Alan", 2233));
		card.add(new AccessCard("Peter", 1100));
		card.add(new AccessCard("Joe", 7077));

		System.out.println("This element is on the head of this queue: " + card.element());

		// card.remove();
		// card.offer(new AccessCard("Kevin", 3000));

		while (card.peek() != null) {
			System.out.println(card.poll());
		}
	}
}
