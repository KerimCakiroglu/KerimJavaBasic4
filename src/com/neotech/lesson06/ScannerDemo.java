package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Import Scanner class
		// Windows--> command + shift +o

		// declare a scanner variable
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String name = input.next(); // declare a variable to catch the user input
		// write name on the screen
		System.out.println("Nice to meet you : " + name);

		// declare an integer to cach the users age
		System.out.println("Please enter your age:");
		int age = input.nextInt();
		System.out.println("Your age is " + age);

		// declare an double to cach the users age
		System.out.println("Please enter your weight:");
		double weight = input.nextDouble();
		System.out.println("Your weight is " + weight + "lbs");

		// declare boolean
		System.out.println("Do you think rain to rain today? ");
		boolean willRain = input.nextBoolean();
		System.out.println("You think it is going to rain " + willRain);

		if (willRain) {
			System.out.println("Bring your umbrella with you!");
		} else {
			System.out.println("Enjoy the weather!");

			/**
			 * 1. Write a program that asks user to enter first name and then last name. At
			 * the end system should display user’s full name. 2. Write a program that
			 * calculates the sum of two numbers entered by the user. 3. Write a program
			 * that asks user to enter two numbers and prints which one is larger.
			 */

			// Answer 1
			System.out.println("First name");
			String FirstName = input.next();
			System.out.println("Last name");
			String Lastname = input.next();

			System.out.println("Your full name is " + FirstName + " " + Lastname);

			// Answer 2

			System.out.println("Give me a number :");
			int num = input.nextInt();
			System.out.println("Give me second number");
			int num2 = input.nextInt();
			System.out.println("Total  " + (num + num2));

			// Answer 3

		}

	}

}
