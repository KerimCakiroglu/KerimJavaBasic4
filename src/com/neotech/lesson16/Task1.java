package com.neotech.lesson16;

public class Task1 {

	public static void main(String[] args) {

//		Create a String and print it in reverse order 
//		(Sunday → yadnuS).

		String day = "Sunday";

		for (int i = day.length() - 1; i >= 0; i--) {
			System.out.print(day.charAt(i));
		}
		System.out.println();

		System.out.println("==============");

		// 2nd way
		String sun = "Monday";
		String reverse = "";

		for (int i = sun.length() - 1; i >= 0; i--) {
			reverse += sun.charAt(i);
		}
		System.out.println(reverse);

	}

}
