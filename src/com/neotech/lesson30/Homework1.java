package com.neotech.lesson30;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Homework1 {
	public static void main(String[] args) {

		// Homework 1:
		// Create a Set collection in which you need to add names of the countries.
		// In this set we want all objects to be sorted in alphabetical order.
		// Using 2 different ways retrieve all elements from set.

		Set<String> countries = new TreeSet<>();

		countries.add("Albania");
		countries.add("Turkiye");
		countries.add("Kosovo");
		countries.add("Spain");
		countries.add("Equador");
		countries.add("Azerbaijan");

		System.out.println(countries);

		// for each
		for (String country : countries) {
			System.out.println(country);
		}

		System.out.println("-------------");

		// Iterator
		Iterator<String> it = countries.iterator();

		while (it.hasNext()) {

			String country = it.next();
			System.out.println(country);
		}

		// index for loop
		for (int i = 0; i < countries.size(); i++) {

			// countries.get(i); // we dont have an index!!!!

		}

	}
}
