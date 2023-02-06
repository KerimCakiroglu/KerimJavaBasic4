package com.neotech.lesson31;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Homework2 {

	public static void main(String[] args) {
		Map<String, String> countries = new TreeMap<>();

		countries.put("France", "Paris");
		countries.put("Kosovo", "Pristina");
		countries.put("Turkiye", "Ankara");

		countries.put("USA", "DC");
		countries.put("Albania", "Tirana");
		countries.put("Italy", "Rome");

		System.out.println(countries);

		//

		///

		///

		Set<String> keys = countries.keySet();
		System.out.println(keys);

		for (String country : keys) {
			System.out.print(country + " ");
		}
		System.out.println();

		// 2nway

		Collection<String> capitals = countries.values();

		Iterator<String> it = capitals.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		Iterator<String> it2 = countries.values().iterator();
		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
		System.out.println();

	}

}
