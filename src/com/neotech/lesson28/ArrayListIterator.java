package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {

		ArrayList<String> choco = new ArrayList<>();

		choco.add("Kinder");
		choco.add("Albeni");
		choco.add("Godiva");
		choco.add("Ferrero");
		choco.add("Toblerone");

		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("Baklava");
		sweets.add("Tiramisu");
		sweets.add("Tires Leches");
		sweets.add("Ice Cream");

		// add all elements of choco on the sweets arraylist
		sweets.addAll(choco);

		System.out.println("The size of sweets is: " + sweets.size());
		System.out.println(sweets);

		System.out.println("---------------");

		// iterator:
		// we can loop the list with:
		// for loops(idexed or for each)
		// while
		// do while

		Iterator<String> it = sweets.iterator();

		while (it.hasNext()) {

			String element = it.next(); // gives us the element
			System.out.print(element + "-");

			if (element.equals("Albeni")) {
				it.remove();
			}
		}
		System.out.println();

		System.out.println(sweets);

		for (String str : sweets) {
			System.out.print(str + " ");
		}
		System.out.println();

		for (int i = sweets.size() - 1; i >= 0; i--) {
			System.out.print(sweets.get(i) + " ");

		}
		System.out.println();

	}
}
