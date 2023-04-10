package com.udemy.app;

class OuterClass {
	private String msg = "Hello Member Inner Class!";// instance variable

	class InnerClass {
		void showMsg() {
			System.out.println(msg);
		}
	}
}