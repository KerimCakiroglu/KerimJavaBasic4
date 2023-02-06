package com.neotech.lesson28;

import java.util.ArrayList;

public class Homework {

	public static void main(String[] args) {

// Create a ArrayList that will store 5 names into it.
// Find out whether the given ArrayList is empty or not?
// Check whether the specific name is present in an ArrayList or not?
// Find the size of your ArrayList and print all values from the ArrayList

		// Declare an arraylist
		ArrayList<String> names = new ArrayList<>();

		names.add("Arin");
		names.add("Oguzhan");
		names.add(1, "Baris");
		names.add("said");
		names.add("Emine");

		// is the arraylist empty?

		System.out.println("is the arraylist empty ? " + names.isEmpty());

		// does it contain Arin?

		System.out.println("Does it contain Arin?" + names.contains("Arin"));

		System.out.println("Size of the arraylist is : " + names.size());

		System.out.println(names);

		for (String name : names) {
			System.out.print(name + "-");
		}

	}

}
