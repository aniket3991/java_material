package com.udemy.app;

public class HybridInheritanceClass extends Parent implements Interface3{

	@Override
	public void method1() {
		System.out.println("method of Interface 1 overriding");
	}

	@Override
	public void method2() {
		System.out.println("method of Interface 2 overriding");
	}

}
