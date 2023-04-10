package com.udemy.app;

import java.lang.reflect.Array;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class App {

	/**
	 * Varargs
	 **/

	public static void main(String[] args) {
		String message = "The number of int element in this calling method: ";
		exampleMethod(message); 
		exampleMethod(message, 100); 
		exampleMethod(message, 100, 200, 300, 400); 
	}
	
	//(int ... x, String s) -> compile time error; 
	//(int ... x, String ... s) -> compile time error
	public static void exampleMethod(String s, int ... x) {    
		System.out.println(s + x.length);
		System.out.println(Arrays.toString(x));  
		} 
}
