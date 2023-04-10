package com.udemy.app;

public class Stamp {
	private String countryOfStamp;

	public String getCountryOfStamp() {
		return countryOfStamp;
	}

	public void setCountryOfStamp(String countryOfStamp) {
		this.countryOfStamp = countryOfStamp;
	}

	public Stamp(String dateOfStamp) {
		this.countryOfStamp = dateOfStamp;
	}
}
