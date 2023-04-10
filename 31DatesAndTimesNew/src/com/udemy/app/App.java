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
	 * Dates & Times - New way with java.time package (part 1)
	 **/

	public static void main(String[] args) {

		/**
		 * Current Date and Time
		 */

		System.out.println("Current Date: " + LocalDate.now());
		System.out.println("Current Time: " + LocalTime.now());
		System.out.println("Current Date & Time: " + LocalDateTime.now());

		/**
		 * Creating Dates and Times
		 */

		// date
		LocalDate dateA = LocalDate.of(2020, Month.MARCH, 15); // Both of these examples create the same date
		LocalDate dateB = LocalDate.of(2020, 3, 15);
		// LocalDate dateC = LocalDate.of(2015, Month.MARCH, 32); // throws DateTimeException
		System.out.println("dateA: " + dateA + ", dateA: " + dateB);

		// time
		LocalTime time = LocalTime.of(9, 33); // or (9, 33, 10), or (9, 33, 10, 300) = (hour, minute, seconds,
												// nanoseconds)
		System.out.println("time: " + time);

		// date & time
		LocalDateTime dateTime = LocalDateTime.of(2020, Month.MARCH, 15, 9, 33);
		// (year, month, dayOfMonth, hour, minute) but you can add seconds, nanoseconds at the ends if you need
		LocalDateTime dateTime2 = LocalDateTime.of(dateA, time); // this is the same
		System.out.println("dateTime: " + dateTime);
		System.out.println("dateTime2: " + dateTime2);

		/**
		 * Date and Time Formatting
		 * 
		 * DateTimeFormatter: Formatter for printing and parsing date-time objects. ofLocalizedDate: This returns a
		 * formatter that will format or parse a date.The exact format pattern used varies by locale.
		 * 
		 * 
		 * ofLocalized methods 
		 * 							    localDate				  localDateTime			  localTime
		 * ofLocalizedDat	 		shows whole object		  shows just date part	Throws runtime exception
		 * ofLocalizedDateTime	  Throws runtime exception	  shows whole object	Throws runtime exception
		 * ofLocalizedTime		  Throws runtime exception	  shows just time part	   shows whole object
		 */

		LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time1 = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);

		DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT); // FULL, LONG, MEDIUM, SHORT
		DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);

		System.out.println("shortDate: " + date1.format(shortDate)); // format: Formats this date-time using the
																		// specified formatter.
		System.out.println("shortTime: " + time1.format(shortTime));
		System.out.println("shortDateTime: " + dateTime1.format(shortDateTime));
		// System.out.println(time.format(shortDateTime)); //UnsupportedTemporalTypeException

		/**
		 * Manipulating Dates and Times
		 */

		LocalDate mDate = LocalDate.of(2021, Month.JULY, 04);
		System.out.println(mDate);
		mDate = mDate.plusDays(12); // plus, minus, Days, Weeks, Months, Years, etc.
		System.out.println(mDate);
		mDate = mDate.withYear(2019); // Year, Month, etc.
		System.out.println(mDate);

		LocalDate m2Date = LocalDate.of(2020, Month.DECEMBER, 01);
		LocalTime m2Time = LocalTime.of(11, 18);
		System.out.println("Before: " + LocalDateTime.of(m2Date, m2Time));
		LocalDateTime m2DateTime = LocalDateTime.of(m2Date, m2Time).minusDays(1).minusHours(11); // date and time
																									// methods chained
		System.out.println("After: " + m2DateTime);
	}
}
