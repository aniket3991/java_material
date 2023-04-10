package com.udemy.app;

public class Child extends Parent {

	protected int age = 30;
	
	@Override
	protected void travel() {
		System.out.println("Child is traveling with car");
	}

}
