package com.udemy.app;

import java.util.ArrayList;

public class Cars {

	private ArrayList<String> carNames;
	
	public Cars(ArrayList<String> carNames) {
		this.carNames = carNames;
	}

	public ArrayList<String> getCarNames() {
		return carNames;
	}

	//solution
//	public ArrayList<String> getCarNames() {
//		return new ArrayList<String>(carNames);
//	}

}
