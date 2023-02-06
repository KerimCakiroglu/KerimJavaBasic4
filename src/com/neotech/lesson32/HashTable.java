package com.neotech.lesson32;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<>();

		ht.put(2, "Mustafa");
		ht.put(1, "Gloria");
		ht.put(3, "Mehmet");
		ht.put(4, "Serkan");

		System.out.println(ht);

		System.out.println("The size of the hashtable is : " + ht.size());

		// what is the difference between HashMap and Hashtable ?

		// Hashtable does NOT allow null keys or values
		// Hashtable is lagacy class, HashMap is newer
		// HashMap is faster than Hashtable
		// Hashtable is syncronized, HashMap is not

	}

}
