package com.neotech.lesson11;

public class Task1 {

	public static void main(String[] args) {
//		Create an array of chars and store grades into it:
//			A,B,C,D,E,F. Then print a grade B (use 2 different ways of
//			creating an array).

		char[] grades = new char[6];
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';

		System.out.println(grades[2]);

		System.out.println("===================");

		// 2nd way

		char[] grad = { 'A', 'B', 'C', 'D', 'E', 'F' };
		System.out.println(grad);

		// 3nd way
		char[] grades2 = { 'A', 'B', 'C', 'D', 'E', 'F' };

		// printing letter B
		System.out.println(grades[1]);
		System.out.println(grades2[1]);

	}

}
