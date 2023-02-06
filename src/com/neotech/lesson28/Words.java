package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<>();

		words.add("book");
		words.add("apple");
		words.add("Glass");
		words.add("computer");

		System.out.println(words);

		Iterator<String> it = words.iterator();

		while (it.hasNext()) {
			String word = it.next();

			if (word.endsWith("e")) {
				it.remove();
			}

		}
		System.out.println(words);
	}

}
