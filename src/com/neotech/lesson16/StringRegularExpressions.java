package com.neotech.lesson16;

public class StringRegularExpressions {

	public static void main(String[] args) {

		String greeting = "Good morning";

		// replace()

		String newGreeting = greeting.replace('o', 'u');

		System.out.println(newGreeting);

		System.out.println("=============");

		String otherGreeting = greeting.replace("morning", "afternoon");
		System.out.println(otherGreeting);

		System.out.println("=============");

		// replaceAll()

		String combination = "My phone # number 345-678-0910";
		System.out.println(combination);

		String combination2 = combination.replaceAll("[0-9]", "*");
		System.out.println(combination2);

		String combination3 = combination.replaceAll("[a-z]", "+");
		System.out.println(combination3);

		String combination4 = combination.replaceAll("[A-Z]", "+");
		System.out.println(combination4);

		String combination5 = combination.replaceAll("[a-zA-Z]", "+");
		System.out.println(combination5);

		String combination6 = combination.replaceAll("[^0-9]", "");
		System.out.println(combination6);

		String combination7 = combination.replaceAll("[0-9a-zA-Z]", "=");
		System.out.println(combination7);

		String combination8 = combination.replaceAll("[^0-9a-zA-Z]", " ");
		System.out.println(combination8);
	}

}
