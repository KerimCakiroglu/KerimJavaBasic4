package com.neotech.lesson13;

public class Task2 {

	public static void main(String[] args) {
//		Create a 2D array or integer type where you will store odd and even numbers in 3
//		rows and 4 columns. Develop a program which will identify/print the even
//		numbers only.

		int[][] numbers = { { 3, 5, 1, 6 }, { 33, 45, 34, 2 }, { 3, 7, 9, 1 } };

		for (int[] row : numbers) {
			for (int number : row) {
				if (number % 2 == 0) {
					System.out.print(number + " ");
				}

			}
		}
		System.out.println();

	}

}
