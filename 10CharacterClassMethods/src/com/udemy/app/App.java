package com.udemy.app;


public class App {
	
	/**		 
	 * 		Character Class Useful Methods & Escape Sequences
	 * 
	 **/

	public static void main(String[] args) {
		
	//isLetter() & isDigit()
		Character ch = 'a';
		Character ch2 = '9';		
		System.out.println("Test isLetter() method: "+ Character.isLetter(ch));
		System.out.println("Test isLetter() method: "+ Character.isLetter(ch2));	
		System.out.println("Test isDigit() method: "+ Character.isDigit(ch));
		System.out.println("Test isDigit() method: "+ Character.isDigit(ch2));
		
	//isWhitespace()	
		Character ch3 = ' ';
		System.out.println("Test isWhitespace() method: "+ Character.isWhitespace(ch3));
		
	//isUpperCase() & isLowerCase()
		Character ch4 = 'A';
		System.out.println("Test isUpperCase() method: "+ Character.isUpperCase(ch4));
		System.out.println("Test isLowerCase() method: "+ Character.isLowerCase(ch4));
		
	//toUpperCase & toLowerCase	
		Character ch5 = 'e';
		System.out.println("Test toUpperCase() method: "+ Character.toUpperCase(ch5));
		System.out.println("Test toLowerCase() method: "+ Character.toLowerCase(ch4));
		
	//Escape Sequences
		//System.out.println("Java said "Hello!" to the world."); //example for the problem = Syntax Error
		System.out.println("Test Escape Sequences:");
		
		//		\"
		System.out.println("Java said \"Hello!\" to the world.");  //Insert a double quote character in the text at this point.
		//		\'
		System.out.println("Java said \'Hello!\' to the world.");  //Insert a single quote character in the text at this point.
		//		\\
		System.out.println("Java said \\Hello!\\ to the world."); //Insert a backslash character in the text at this point.
		//		\t
		System.out.println("Java said \tHello! to the world.");  //Insert a tab in the text at this point.
		//		\n
		System.out.println("Java said \nHello! to the world.");  //Insert a newline in the text at this point.

			
	//You can find other methods of Character Class in the Java API documentation. 
		
	}
}
