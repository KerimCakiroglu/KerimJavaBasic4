package com.neotech.lesson16;

public class StringMethodContinue {

	public static void main(String[] args) {

		// contains
		String sentence = "Today is Oct 22";
		boolean cont = sentence.contains("is");
		System.out.println(cont);

		// startsWith()

		boolean starts = sentence.startsWith("Today");
		System.out.println(starts);

		System.out.println("=========-========");

//endsWith()
		boolean ends = sentence.endsWith("2");
		System.out.println(ends);

		// equals()
		String s1 = "Saturday";
		String s2 = "saturday";
		boolean equals = s1.equals(s2);
		System.out.println("equals --> " + equals);

		// equalsIgnoreCase()
		boolean equalsIgnoreCase = s1.equals(s2);
		System.out.println("equals ignore case --> " + equalsIgnoreCase);

		// instead of using equalsIgnoreCase
		boolean equalsLower = s1.toLowerCase().equals(s2.toLowerCase());
		System.out.println("Equals lower --> " + equalsLower);
		boolean equalsUpper = s1.toUpperCase().equals(s2.toUpperCase());
		System.out.println("Equals upper --> " + equalsUpper);

		// step by step
		String s1Upper = s1.toUpperCase();
		String s2Upper = s2.toUpperCase();
		boolean compare = s1Upper.equals(s2Upper);
		System.out.println("Compare --> " + compare);

	}

}
