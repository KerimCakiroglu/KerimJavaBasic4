package com.neotech.lesson28;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		// ArrayList<String>al=new ArrayList<>();

		LinkedList<String> ll = new LinkedList<>();

		ll.add("Alex");
		ll.add("Erjola");
		ll.add(0, "Dardan");
		ll.addLast("Murad");
		ll.addFirst("Kerim");

		System.out.println(ll);

		System.out.println("The size of the linkedlist is : " + ll.size());

		// getting elements from the linkedlist
		// for loop
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		System.out.println("==============");

		for (String person : ll) {
			System.out.print(person + " ");
		}
		System.out.println();
		System.out.println("=============");

	}

}
