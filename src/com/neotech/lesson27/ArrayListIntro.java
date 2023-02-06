package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {

		int[] numbers = new int[4]; // you have to specify the size
		// cannot change the size

		ArrayList<String> names = new ArrayList<String>();
		int size = names.size();
		System.out.println("size: " + size);

		names.add("Baris");
		names.add("Enes");
		names.add("Deyo");

		System.out.println("size: " + names.size());

		names.add("Aykut");

		System.out.println(names);

		System.out.println("------Iterating the ArrayList with a for loop---");
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
		}
		System.out.println("-----Iterating the ArrayList with a for-each loop---");
		for (String name : names) {
			System.out.println(name);
		}

	}

}
