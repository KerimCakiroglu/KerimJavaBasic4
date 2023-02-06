package com.neotech.lesson13;

public class RetrievingValuesFrom2dArray {

	public static void main(String[] args) {

		String[][] months = { { "December", "January", "February" }, { "March", "April", "May" },
				{ "June", "July", "August" }, { "September", "October", "November" } };

		int rows = months.length;
		int cols = months[1].length;

		System.out.println("Number of rows is " + rows + " and number of " + "columns for the 2nd element is " + cols);

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.print(months[row][col] + " ");
			}
			System.out.println();
		}

		int[][] numbers = { { 3, 4, 6 }, { 5, 7, 3, 2, 6, 8, 4, 2 }, { 8 } };

		// this has to go from 0,1,2

		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println();
		}

	}

}
