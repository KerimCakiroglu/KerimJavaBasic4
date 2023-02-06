package com.neotech.lesson10;

public class Task1 {

	public static void main(String[] args) {

//		//print this structure using a nested for loop.
//
//		1
//		22
//		333
//		4444
//		55555

		// dynamic comparison
		// iterate through i 5 times
		for (int row = 1; row <= 5; row++) {

			for (int col = 0; col < row; col++) {
				// do this as many as the value of row
				System.out.print(row);
			}
			System.out.println();
		}

	}

}
