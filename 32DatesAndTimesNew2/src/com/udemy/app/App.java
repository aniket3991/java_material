package com.udemy.app;

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
import java.util.Date;

public class App {

	/**
	 * Dates & Times - New way with java.time package (part 2)
	 **/

	public static void main(String[] args) {

		/**
		 * Compare Dates and Times In Java 8, you can use the new isBefore(), isAfter(), isEqual() and compareTo() to
		 * compare LocalDate, LocalTime and LocalDateTime.
		 */

		LocalDate compDate = LocalDate.of(2021, Month.JULY, 04);
		LocalDate comp2Date = LocalDate.of(2020, Month.DECEMBER, 01);
		System.out.println(compDate.compareTo(comp2Date)); // 0 if both dates are equal, Date is after/before the date
															// argument: -1/1
		System.out.println(compDate.isBefore(comp2Date)); // isBefore/isAfter true/false
		System.out.println(compDate.isEqual(comp2Date)); // true/false

		/**
		 * TimeZone Zoned date/time API is to be used when time zone is to be considered.
		 */

		ZonedDateTime dateZoned = ZonedDateTime.parse("2007-12-03T10:15:30+01:00[Europe/Paris]");
		// The string must represent a valid date-time and is parsed using
		// java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME.
		System.out.println("dateZoned: " + dateZoned);

		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId: " + id);

		ZoneId currZone = ZoneId.systemDefault();
		System.out.println("CurrentZone: " + currZone);

		/**
		 * Duration Measures time in seconds and nanoseconds. It deals with time based amount of time. methods:
		 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#method.summary
		 * 
		 * Period Measures time in years, months and days. It deals with date based amount of time. methods:
		 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Period.html#method.summary
		 */

		// Duration
		LocalDateTime oldDate = LocalDateTime.of(2020, Month.AUGUST, 31, 10, 20, 55);
		LocalDateTime newDate = LocalDateTime.of(2020, Month.SEPTEMBER, 1, 10, 20, 55);
		Duration duration = Duration.between(oldDate, newDate);
		System.out.println("Duration: " + duration);
		System.out.println("Duration: " + duration.toSeconds() + " seconds");
		System.out.println("Duration: " + duration.toHours() + " hours");

		// Period
		LocalDate today = LocalDate.now();
		LocalDate birthdayOfTom = LocalDate.of(1990, Month.APRIL, 22);
		Period p = Period.between(birthdayOfTom, today);
		System.out.println("Period: " + p);
		System.out.println(
				"Tom is " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays() + " days old.");

		/**
		 * Backward Compatibility A toInstant() method is added to the original Date and Calendar objects. It can be
		 * used to convert them to the new Date/Time API.
		 */

		Date currentDate = new Date();
		System.out.println("Current date: " + currentDate);

		Instant now = currentDate.toInstant(); // Get the instant of current date in terms of milliseconds
		ZoneId currentZone = ZoneId.systemDefault();

		LocalDateTime localDateTime = LocalDateTime.ofInstant(now, currentZone);
		System.out.println("Local date: " + localDateTime);

		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, currentZone);
		System.out.println("Zoned date: " + zonedDateTime);
	}
}
