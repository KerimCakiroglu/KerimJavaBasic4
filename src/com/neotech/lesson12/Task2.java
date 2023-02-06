package com.neotech.lesson12;

public class Task2 {

	public static void main(String[] args) {

		// Create an array of integers and calculate the sum of all elements in the
		// array
		// use different loops

		int[] numbers = { 5, 11, 9, 7 };
		// find the total of the numbers

		int total = 0;
		for (int number : numbers) {
			total += number;

		}

		System.out.println("The total is " + total);

	}

}
