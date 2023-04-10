package com.udemy.app;

public class OuterClass {
	private static String msg = "Hello Static Nested Class!";// static variable
	
	static class NestedClass {
		void showMsg() {
			System.out.println(msg);
		}
	}
}
