package com.udemy.app;

public class House {

	private int numDoors;
	private int numRooms;
	private int numWindows;

	public House() {
		this(1); // calls constructor with 1 parameters (Constructor Chaining)
	}

	public House(int numDoors) {
		this(numDoors, 5); // calls constructor with 2 parameters (Constructor Chaining)
	}

	public House(int numDoors, int numRooms) {
		this(numDoors, numRooms, 10); // calls constructor with 3 parameters (Constructor Chaining)
	}

	// this constructor does all the work (Constructor Chaining)
	public House(int numDoors, int numRooms, int numWindows) {
		this.numDoors = numDoors;
		this.numRooms = numRooms;
		this.numWindows = numWindows;
	}

	public void print() {
		System.out.println(
				"The house has " + numDoors + " door(s), " + numRooms + " room(s) and " + numWindows + " window(s)");
	}

}
