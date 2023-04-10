package com.udemy.app;

import java.io.Serializable;

public class Car implements Serializable {

	private static final long serialVersionUID = 3658213896628538076L;

	String carBrand;
	int motorNumber;
	String color;
	// transient String color; // transient = it will not be serialized

	public Car(String carBrand, int motorNumber, String color) {
		this.carBrand = carBrand;
		this.motorNumber = motorNumber;
		this.color = color;
	}
}