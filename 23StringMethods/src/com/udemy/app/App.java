package com.udemy.app;

import java.util.ArrayList;

public class App {

	/**
	 * String methods
	 **/

	public static void main(String[] args) {

		/**
		 * previously:
		 * 
		 * - length() method: returns the length of this string. e.g.: str1.length()
		 * - equals(Object anObject) method: a comparison of values in the objects. e.g.: str1.equals(str2)
		 * - intern() method: returns a canonical representation for the string object. e.g.: str1.intern();
		 */

		/**
		 * concat(String str) method
		 * As we have seen in the previous chapter this returns a new string that is string1 with string2 added to it
		 * at the end.
		 * 
		 * + operator
		 * Strings are more commonly concatenated with the + operator, and it brings the same results.
		 */

		String string1 = "Hello ";
		String string2 = "Java!";
		String string3 = string1.concat(string2);
		String string4 = string1 + string2;
		System.out.println(string3); // System.out.println(string4);
		System.out.println(string3.equals(string4));

		/**
		 * charAt(int index) method 
		 * Returns the specified character from the string.
		 */

		System.out.println("Char in search position: " + string1.charAt(1)); // "Hello " (1) -> e

		/**
		 * indexOf(String str)
		 * Returns the index within this string of the first occurrence of the specified substring.
		 */

		System.out.println("Found index is: " + string1.indexOf("llo")); // "Hello " -> "llo" -> 2

		/**
		 * substring(int beginIndex) method
		 * Returns a new string that is a substring of this string.
		 */

		String str = "Hello Java!";
		System.out.println(str.substring(6));

		/**
		 * replace(char oldChar, char newChar)
		 * Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
		 * 
		 * replaceAll(String regex, String replacement)
		 * Replaces each substring of this string that matches the given regular expression with the given
		 * replacement.
		 */

		System.out.println(str.replace('J', 'L'));
		System.out.println(str.replaceAll("Java", "Peter"));

		/**
		 * trim() 
		 * Returns a copy of the string, with leading and trailing whitespace omitted.
		 */

		String s = "    trim is a useful method in Java    ";
		System.out.println(s + ".");
		System.out.println(s.trim());

		/**
		 * split(String regex, int limit)
		 * Splits this string around matches of the given regular expression.
		 * 
		 * regex: regular expression, limit: how many strings to be returned
		 */

		String strSplit = "string&split&method";
		String[] arrayOfStrings = strSplit.split("&", 3);

		for (String strSp : arrayOfStrings)
			System.out.println(strSp);

		/**
		 * You can find other methods of String Class in the Java API documentation.
		 */

	}
}
