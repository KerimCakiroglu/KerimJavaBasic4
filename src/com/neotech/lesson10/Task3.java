package com.neotech.lesson10;

public class Task3 {

	public static void main(String[] args) {

		// Print the following pattern using a nested for loop.
//There are 5 rows, there is a space between stars.
//
//    *
//   * *
//  * * *
// * * * *
//* * * * *

		for (int i = 0; i < 5; i++) {

			// first inner loop:
			// printing space
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}

			// second inner loop:
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
