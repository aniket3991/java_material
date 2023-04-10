package com.udemy.app;

public class Passport {
	private Stamp stamp;

	public Passport(Stamp stamp) {
		this.stamp = stamp;
	}

	public Stamp getStamp() {
		return stamp;
	}

	public void setStamp(Stamp stamp) {
		this.stamp = stamp;
	}
}
