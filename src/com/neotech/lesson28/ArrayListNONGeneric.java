package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListNONGeneric {

	public static void main(String[] args) {

		// Generic ArrayList

		ArrayList<Double> a1 = new ArrayList<>();

		a1.add(2.5);
		a1.add(4.7);
		a1.add(5.5);
		a1.add(2.7);
		a1.add(2.2);
		a1.add(4.2);
		// a1.add(100); // CE, this is not converted automatically

		System.out.println(a1);

		// replacing items in the ArrayList
		a1.set(1, 10.2);

		// if the index is the larger than the size of the arrayList

		// removing element
		a1.remove(0);
		// a1.remove(2.5);

		System.out.println(a1);

		// get an element at the index 0 ??

		System.out.println(a1.get(0));

		// for loop

		for (int i = 0; i < a1.size(); i++) {
			// arr[i]
			System.out.print(a1.get(i) + " ");
		}

		System.out.println();

		// for each loop

		for (Double d : a1) {
			System.out.print(d + " ");
		}
		System.out.println();

		System.out.println("===============");

		// Non-generic ArrayList

		ArrayList al2 = new ArrayList();

		al2.add(100);
		al2.add("Hello");
		al2.add('A');
		al2.add(a1);

		System.out.println(al2);
		System.out.println("++++++++++++");

		// retrieving all elements from NOn-Generic ArrayList

		for (Object obj : al2) {
			System.out.println(obj);
		}

	}

}
