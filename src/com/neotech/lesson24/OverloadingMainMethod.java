package com.neotech.lesson24;

public class OverloadingMainMethod {
// can we overload main method ? Yes we can
	public static void main(int[] args) {

		System.out.println("Main method with integer array parameter");

	}

	private static void main(String arg1, String arg2) {

		System.out.println("Main method with two strings parameters");
	}

	public static void main(int arg1, int arg2) {
		System.out.println("Main method with two integer parameters");
	}

	public static void main(String[] jenn) {
		System.out.println("Main method with string array parameter");
		OverloadingMainMethod.main(3, 5);

		main("Hi", "Bye");
		int[] intArray = { 1, 2, 3, 4 };
		main(intArray);

	}

}
