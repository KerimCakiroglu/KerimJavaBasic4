package com.neotech.lesson10;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
//		. Create a program that will be asking user to apply for a credit card 10 times.
//		As soon you get an "yes" from a user program should stop asking.

		// use a for loop since there is number of iterations
		// ask a max of ten times, if you get a yes before it , break the loop

		Scanner scan = new Scanner(System.in);
		String input;

		// ask user ten times
		for (int i = 0; i < 10; i++) {
			System.out.println("Do you want apply for a credit card?");
			input = scan.next();
			if (input.equals("yes")) {
				System.out.println("Perfect, good choice!");
				break;
			}

		}

	}

}
