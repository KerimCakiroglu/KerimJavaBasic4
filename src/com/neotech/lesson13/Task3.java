package com.neotech.lesson13;

public class Task3 {

	public static void main(String[] args) {

		/*
		 * Create a 2D array of integer type and store numbers in 3 rows and 3 columns.
		 * Print the sum of all numbers.
		 */
		int[][] numbers = { { 34, 23, 63 }, { 21, 70, 30 }, { 11, 38, 23 } };
		int total = 0;

		for (int[] row : numbers) {
			for (int number : row) {
				total += number;

			}
		}

		System.out.println("Total is : " + total);

	}

}
