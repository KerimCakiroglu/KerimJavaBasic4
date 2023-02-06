package com.neotech.lesson17;

public class Task2 {

	public static void main(String[] args) {

		// If you find this easy:
//		"Is it saturday! Is it raining? Do we have
//		a Java Class today."

		String sentence = "Is it saturday! Is it raining? Do we have a Java Class today?";

		String[] bySentence = sentence.split("[!?.]");

		for (String array : bySentence) {
			System.out.println(array);
		}

	}

}
