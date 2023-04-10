package com.udemy.app;

public class AccessCard implements Comparable<AccessCard> {

	private String name;
	private int idNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public AccessCard(String name, int idNumber) {
		this.name = name;
		this.idNumber = idNumber;
	}

	@Override
	public int compareTo(AccessCard otherCard) {
		// a version: assign priority to id number
		return Integer.compare(this.idNumber, otherCard.getIdNumber());
		
		// b version: change order direction
		//return -Integer.compare(this.idNumber, otherCard.getIdNumber());

		// c version: assign priority to name
		//return this.name.compareTo(otherCard.getName());
	}

	@Override
	public String toString() {
		return idNumber + "-" + name;
	}

}
