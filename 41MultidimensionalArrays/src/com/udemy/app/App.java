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
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class App {

	/**
	 * Multidimensional Arrays 2D & 3D Arrays Creation and Iterating
	 **/

	public static void main(String[] args) {

		/**
		 * Creation and Iterating through 2D array
		 */

		int[][] myNumbers = { { 1, 2, 3 }, { 4 }, { 5, 6 } };// irregular declaration

		System.out.println("Irregular 2D Array:");
		for (int[] innerArray : myNumbers) {
			for (int data : innerArray) {
				System.out.print(data + ", ");
			}
			System.out.print("\n");
		}

		int[][] myNumbers2 = new int[3][3];// 3 row and 3 column

		System.out.println("Regular 2D Array, with auto/default zero initialization:");
		for (int[] innerArray : myNumbers2) {
			for (int data : innerArray) {
				System.out.print(data + ", ");
			}
			System.out.print("\n");
		}

		// non-existent index danger
		// System.out.println(myNumbers[1][1]); //ArrayIndexOutOfBoundsException
		System.out.println(myNumbers2[1][1]); // no problem because of the auto/default initialization, it has a value
												// (zero)

		/**
		 * Creation and Iterating through 3D array Three
		 */
		System.out.println(""); // separation new line

		int[][][] a3D = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		// Basically, 3d array is an array of 2d arrays.

		System.out.println("3D Array contains:");
		for (int[][] array2D : a3D) {
			System.out.println("inside 2D Array");
			for (int[] array1D : array2D) {
				for (int item : array1D) {
					System.out.print(item + ",");
				}
				System.out.println("-");
			}
		}

		/**
		 * Elements in three-dimensional arrays are commonly referred by x[i][j][k] where ‘i’ is the array number, ‘j’
		 * is the row number and ‘k’ is the column number
		 */

		System.out.println("Accessing Elements of the 3D Array: " + a3D[1][0][0]); // second inside 2D array/first
																					// row/first column: 5

	}
}
