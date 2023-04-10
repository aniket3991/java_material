package com.udemy.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	/**
	 * Stream 2 - Methods examples
	 **/

	public static void main(String[] args) {

		/**
		 * Stream : of / findFirst
		 */
		System.out.println("- Stream : of / findFirst -");
		
		Stream.of("a1", "a2", "a3").findFirst().ifPresent(System.out::println);
		
		/**
		 * Stream : ofNullable
		 */
		System.out.println("- Stream : ofNullable -");
		
		System.out.print("elements: ");
		Stream.ofNullable("Java").forEach(System.out::println);
		System.out.print("elements: ");
		//Stream.of(null).forEach(System.out::println); //NullPointerException
		Stream.ofNullable(null).forEach(System.out::println);

		/**
		 * Stream : count (& filter)
		 */
		System.out.println("\n- Stream : count (& filter) -");
		
		List<String> names = Arrays.asList("Alan", "James", "Kevin", "Joe");
		long count = names.stream().filter(name -> name.startsWith("J")).count();
		System.out.println(count);

		/**
		 * Stream - iterate
		 */
		System.out.println("- Stream : iterate -");
		
		Stream<Integer> numbers = Stream.iterate(1, n -> n + 1).limit(10);
		numbers.forEach(n -> System.out.print(n + " "));

		/**
		 * Stream - generate
		 */
		System.out.println("\n- Stream : generate -");
		
		Stream<Double> randoms = Stream.generate(Math::random).limit(3);
		randoms.forEach(System.out::println);

		/**
		 * Stream - reduce
		 */
		System.out.println("- Stream : reduce -");

		String[] title = { "Java", "Programing", "Step", "by", "Step", "from", "A", "to", "Z", };
		// Using Arrays.stream() to convert array into Stream
		Stream<String> stream = Arrays.stream(title);
		Optional<String> courseTitle = stream.reduce((word1, word2) -> word1 + "_" + word2);
		if (courseTitle.isPresent()) {
			System.out.println(courseTitle.get());
		}

		/**
		 * Stream - map
		 */
		System.out.println("- Stream : map -");
		
		List<String> words = Arrays.asList("hello ", "java ", "word");
		List<String> greeting = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		greeting.forEach(System.out::print);

		/**
		 * Stream - flatMap
		 */
		System.out.println("\n- Stream : flatMap -");
		
		List<String> femaleNames = Arrays.asList("Kate", "Judy", "Nicole");
		List<String> maleNames = Arrays.asList("Kevin", "Peter", "Joe"); 
		List<List<String>> listOfListofNames = 
                Arrays.asList(femaleNames, maleNames); 
		System.out.println("The Structure before flattening is : " + 
				listOfListofNames); 
		
		List<String> listofNames  = listOfListofNames.stream() 
                .flatMap(list -> list.stream()) 
                .collect(Collectors.toList()); 
		System.out.println("The Structure after flattening is : " + 
				listofNames); 


	}

}
