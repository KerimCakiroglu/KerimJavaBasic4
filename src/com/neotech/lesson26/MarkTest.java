package com.neotech.lesson26;

public class MarkTest {

	public static void main(String[] args) {

		StudentA st1 = new StudentA(89, 56, 95);
		StudentB st2 = new StudentB(77, 88, 78, 90);

		System.out.println(st1.getAverage());
		System.out.println(st2.getAverage());

	}

}
