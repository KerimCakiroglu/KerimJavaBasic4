package com.neotech.lesson30;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Task2 {

	public static void main(String[] args) {

//		Create a map of a building. Store floor number and it is
//		associated company name. (Example: 1=Google, 2=Apple,
//		3=Neotech etc..). Insert 7 entries with duplicate keys and
//		values.
//		- Check how many entries you have?
//		- Update company on a 4th floor
//		- Remove company on the 7th floor
//		- Print your map

		HashMap<Integer, String> map = new LinkedHashMap<>();

		map.put(1, "Google");
		map.put(2, "Apple");
		map.put(3, "NeoTech");
		map.put(4, "Okta");
		map.put(5, "FB");
		map.put(6, "Twitter");
		map.put(7, "Starbucks");

		System.out.println("The number of entries " + map.size());

		System.out.println(map);
		System.out.println("---------------");
		map.replace(4, "Pizza");

		System.out.println(map);
		System.out.println("---------------");

		map.remove(7);
		System.out.println(map);

		System.out.println("------------");

	}

}
