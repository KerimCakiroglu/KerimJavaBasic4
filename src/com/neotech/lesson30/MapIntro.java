package com.neotech.lesson30;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {

// <K,V> - a pair, an entry, a key-value pair

		HashMap<Integer, String> map = new HashMap<>();

		// we can have any object key : value pair
		// for example :Integer :Student ,String:String
		map.put(1, "Dardan");
		map.put(2, "Emine");
		map.put(3, "Fatih");

		boolean isEmpty = map.isEmpty();
		System.out.println("is it empty " + isEmpty);

		System.out.println("The size of the map is : " + map.size());

		System.out.println(map);

		map.put(15, "Emine");

		System.out.println(map);

		// try to add duplicate : it will override the existing value
		map.put(15, "Yilmaz");
		System.out.println(map);

		// how do we retieve values from map?
		String name = map.get(2);
		System.out.println(name);

		// if we want to replace

		map.replace(2, "Karen");
		System.out.println(map);

		// remove Fatihcan from map
		map.remove(3);

		// check if key 4 exists
		boolean checkKey = map.containsKey(4);

		System.out.println(checkKey);

		// check if Fatih exisit

		boolean checkValue = map.containsValue("Fatih");
		System.out.println(checkValue);

		System.out.println(map);

	}

}
