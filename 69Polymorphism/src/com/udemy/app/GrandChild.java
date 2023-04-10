package com.udemy.app;

public class GrandChild extends Child{

	protected int age = 10;
	
	@Override
	protected void travel() {
		System.out.println("GrandChild is traveling with bike");
	}
	
}
