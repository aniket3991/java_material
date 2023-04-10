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
	 * Nested loops & Optional Labels
	 */

	public static void main(String[] args) {

		// Nested loop example
		for (int i = 1; i <= 3; ++i) {

			System.out.println("Outer loop iteration " + i);

			for (int j = 1; j <= 2; ++j) {
				System.out.println("i = " + i + "; j = " + j);
			}
		}

		// Nested loop with Optional Labels usage example
		System.out.println(""); // separation line

		OUTER_LOOP: for (int i = 1; i <= 3; ++i) {

			System.out.println("Outer loop iteration " + i);

			INNER_LOOP: for (int j = 1; j <= 2; ++j) {
				System.out.println("i = " + i + "; j = " + j);
				if (j == 2 && i == 2) {
					break OUTER_LOOP;
					/**
					 * Without label reference the break statement default behavior is to jump out from the inner loop
					 * only. The optional label parameter allows us to break out of a higher level outer loop.
					 */
				}
			}
		}
	}
}
