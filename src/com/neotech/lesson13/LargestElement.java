package com.neotech.lesson13;

public class LargestElement {

	public static void main(String[] args) {

		int[] numbers = { 45, 34, 87, -33, 15, 92, -13, 55 };

		int largest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
//compare the current largest number with the new number
			// that the loop gives us

			if (largest < numbers[i]) {
				largest = numbers[i];

			}

		}
		System.out.println("The largest number is : " + largest);

		int lowest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
//compare the current lowest number with the new number
			// that the loop gives us

			if (lowest > numbers[i]) {
				lowest = numbers[i];

			}

		}
		System.out.println("The lowest number is : " + lowest);

	}

}
