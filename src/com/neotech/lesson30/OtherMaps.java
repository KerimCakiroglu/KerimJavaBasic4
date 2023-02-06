package com.neotech.lesson30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {

		// TreeMap will order the entries(pairs) alphabetically according to KEY
		Map<String, Integer> groceries = new TreeMap<>();

		groceries.put("Milk", 2);
		groceries.put("Bread", 3);
		groceries.put("Eggs", 12);

		// groceries.put(3,"Oil"); //CE:KEY must be string

		groceries.put("Oil", 3);

		System.out.println(groceries);

		// my wife changed her mind
		groceries.replace("Eggs", 6);

		System.out.println(groceries);

		// keySet - we can get all keys of the man And HaVE THEM into a SET

		Set<String> keys = groceries.keySet();

		System.out.println("All keys of the map are: " + keys);

		// values()
		Collection<Integer> values = groceries.values();

		System.out.println("All values of the map are: " + values);

		// can we iterate over the keys?

		for (String key : keys) {

			System.out.println(key + " :  " + groceries.get(key));
		}

		// can we iterate over the vaules ??
		Iterator<Integer> it = values.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
