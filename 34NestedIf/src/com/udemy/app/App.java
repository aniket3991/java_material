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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class App {

	/**
	 * Nested if statement
	 */

	public static void main(String[] args) {

		// nested if example
		int number1 = 2;
		int number2 = 87;
		int number3 = 100;
		int greatestNumber;

		if (number1 >= number2) {
			if (number1 >= number3) {
				greatestNumber = number1;
			} else {
				greatestNumber = number3;
			}
		} else {
			if (number2 >= number3) {
				greatestNumber = number2;
			} else {
				greatestNumber = number3;
			}
		}

		System.out.println("The highest number in the list is " + highestNumber);

	}
}
