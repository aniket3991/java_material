package com.udemy.app;

public class App {

	/**
	 * Enum
	 **/

	// You can also have an Enum inside a class
	enum Seasons {
		SPRING, SUMMER, AUTUMN, WINTER
	}

	public static void main(String[] args) {

		System.out.println(Day.FRIDAY);

		Seasons mySeason = Seasons.SPRING;
		System.out.println(mySeason);

		/**
		 * Enums in Switch statement Enums are often used in switch statements to check for corresponding values
		 */

		talkingSeasons(mySeason);

		/**
		 * Loop Through an Enum The enum type has a values() method, which returns an array of all enum constants.
		 */

		for (Day d : Day.values()) {
			System.out.println(d);
		}

		/**
		 * Other Enum methods:
		 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Enum.html#method.summary
		 */

	}

	public static void talkingSeasons(Seasons mySeason) {
		switch (mySeason) {
		case SPRING:
			System.out.println("Blossom flowers.");
			break;

		case SUMMER:
			System.out.println("It's holiday time!");
			break;

		case AUTUMN:
			System.out.println("The leaves are falling.");
			break;

		case WINTER:
			System.out.println("Build a snowman!");
			break;

		default:
			System.out.println("If there will be a fifth season, then I'll come here. For safety's sake. :) ");
			break;
		}
		/**
		 * In switch statements, enumeration constants are used without their enumeration type name. This is due to
		 * the fact the enum type is implicitly specified in the switch expression. It is good practice to list all
		 * enum constants (even if some of them don’t do anything) and add a default branch, usually with an exception
		 * (in case a new constant gets added and someone misses the switch statement and doesn’t update it.)
		 */
	}
}
