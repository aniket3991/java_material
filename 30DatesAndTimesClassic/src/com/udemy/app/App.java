package com.udemy.app;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class App {

	/**
	 * Dates & Times, Old-classic way
	 **/

	public static void main(String[] args) {

		/**
		 * Current Date and Time
		 */

		Date date = new Date(); // Instantiate a Date object
		System.out.println(date.toString()); // display time and date using toString()

		/**
		 * Creating Dates and Times
		 * 
		 * Calendar & Gregorian calendar
		 * 
		 * getInstance() : Gets a calendar using the default time zone and locale. 
		 * set() : Sets the values for the calendar fields YEAR, MONTH, and DAY_OF_MONTH. 
		 * getTime() : Returns a Date object representing this Calendar's time value
		 * 
		 * more methods: 
		 * Calendar:
		 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Calendar.html#method.summary
		 * Gregorian calendar:
		 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/GregorianCalendar.html
		 */

		// Creating an object representing January 1, 2019 with Calendar
		Calendar c = Calendar.getInstance();
		c.set(2015, Calendar.JANUARY, 1); // c.get(Calendar.YEAR) -> 2015 Returns a Date object representing this
											// Calendar's time value
		Date dateCal = c.getTime();

		// Creating an object representing February 1, 2019 with GregorianCalendar
		Calendar c2 = new GregorianCalendar(2019, Calendar.FEBRUARY, 1);
		Date dateGreg = c2.getTime();

		/**
		 * Notice the problem with this old way: There wasn’t a way to specify just a date without the time. The Date
		 * class represented both the date and time whether you wanted it to or not. Trying to create a specific date
		 * required more code than it should have.
		 */

		System.out.println("Created Date object with Calendar: " + dateCal);
		System.out.println("Created Date object with GregorianCalendar: " + dateGreg);

		/**
		 * Date and Time Formatting
		 * 
		 * SimpleDateFormat: Formatter for date/time. 
		 * date and time patterns: E:Day name in week, y:Year, M:Month in year, d:Day in month, h:Hour in am/pm (1-12), 
		 * m: Minute in hour, s:Second in minute, a:Am/pm marker, z:Time zone, etc.
		 * 
		 * all patterns: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		 */

		Date dateNow = new Date();
		SimpleDateFormat sdft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z"); // Pattern Example
		System.out.println("Current Date: " + sdft.format(dateNow));

		/**
		 * Manipulating Dates
		 */

		Calendar cal = Calendar.getInstance();
		cal.set(2020, Calendar.OCTOBER, 1);
		Date mDate = cal.getTime();
		System.out.println("before manipulation: " + mDate);
		cal.add(Calendar.DATE, 2);
		mDate = cal.getTime();
		System.out.println("after manipulation: " + mDate);

		/**
		 * Compare Dates
		 */
		Date dateCurrent = new Date();
		System.out.println(mDate.compareTo(dateCurrent)); // 0 if both dates are equal, Date is after/before the date
															// argument: -1/1
		System.out.println(mDate.before(dateCurrent)); // before/after true/false

		/**
		 * TimeZone This class represents a time zone offset
		 */

		TimeZone zone = TimeZone.getDefault();
		String zoneName = zone.getDisplayName();
		System.out.println("Display name for local time zone: " + zoneName);

	}
}
