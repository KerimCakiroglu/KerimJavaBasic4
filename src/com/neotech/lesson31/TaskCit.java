package com.neotech.lesson31;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TaskCit {

	public static void main(String[] args) {
//		Create a Map from array of cities that will sort keys in
//		alphabetical order. As a key store the name of the city and
//		as a value store the length of the city. (Example: Paris=5,
//		Moscow=6, Washington DC=13 etc..).
//		- If any city name is more than 7 characters remove that
//		city.

		// array of cities
		String[] cities = { "Paris", "Moscow", "Washington DC", "Istanbul", "Malmo" };

		Map<String, Integer> map = new TreeMap<>();

		for (String city : cities) {

			map.put(city, city.length());
		}
		System.out.println(map);

		// using iterator

		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();

		while (it.hasNext()) {

			Entry<String, Integer> e = it.next();
			if (e.getValue() >= 7) {
				it.remove();
			}
			System.out.println(e);
		}

	}

}
