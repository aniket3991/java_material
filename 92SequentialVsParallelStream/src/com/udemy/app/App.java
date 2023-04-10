package com.udemy.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	/**
	 * Sequential vs Parallel Stream
	 **/

	public static void main(String[] args) {

		double start = System.currentTimeMillis();   
		long c = IntStream.rangeClosed(0, 1000000000)
		            .parallel()
		            .filter(i -> i % 2 == 0)
		            .count();
		double duration = (System.currentTimeMillis() - start); 
		System.out.println("Counted: " + c + " in " + duration + " milliseconds");
	}
	
}
