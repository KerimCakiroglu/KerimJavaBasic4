package com.neotech.lesson20;

public class Students {

	String StudentName;
	int a, b, c;

	Students(String StName, int a1, int b1, int c1) {
		a = a1;
		b = b1;
		c = c1;
		StudentName = StName;
		int average = (a1 + b1 + c1) / 3;

		System.out.println(StName + "'s Average Grade is " + average);
	}

	public static void main(String[] args) {

		Students st = new Students("Kerim", 74, 67, 88);
		Students st1 = new Students("Umut", 74, 22, 88);
		Students st2 = new Students("Mert", 74, 45, 88);
		Students st3 = new Students("Jale", 74, 27, 88);

	}

}
