package com.udemy.app;

class OuterClass {
	private String msg = "Hello Local Inner Class!";// instance variable

	void outerMethod() {
		class InnerClass {
			void showMsg() {
				System.out.println(msg);
			}
		}
		InnerClass iClass = new InnerClass();
		iClass.showMsg();
	}
}