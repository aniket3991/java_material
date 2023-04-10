package com.udemy.app;

/**
 * Synchronized Block
 */

class ShowNumbers {
	public void printTable(int n) {
		//synchronized (this) {
			System.out.println("Numbers start from " + n);
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);  
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		//}
	}
}

class NumbersOneByOne extends Thread {
	ShowNumbers sn;
	NumbersOneByOne(ShowNumbers sn) {
		this.sn = sn;
	}
	public void run() {
		sn.printTable(1);
	}
}

class NumbersTensOf extends Thread {
	ShowNumbers sn;
	NumbersTensOf(ShowNumbers sn) {
		this.sn = sn;
	}
	public void run() {
		sn.printTable(10);
	}
}

public class App {
	public static void main(String args[]) {
		ShowNumbers obj = new ShowNumbers();
		NumbersOneByOne t1 = new NumbersOneByOne(obj);
		NumbersTensOf t2 = new NumbersTensOf(obj);
		t1.start();
		t2.start();
	}
}