package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<>();

		ls.add("Baris");
		ls.add("Enes");
		ls.add("Moises");
		ls.add("Oguzhan");
		ls.add("Baris");
		ls.add("Harun");

		System.out.println(ls);

		// LinkedHAshSet -- no duplicate , insertaion order

		Set<String> lhs = new LinkedHashSet<>();
		lhs.addAll(ls);

		System.out.println(lhs);

		Set<String> hs = new HashSet<>(ls);
		System.out.println(hs);

		// Treeset
		Set<String> ts = new TreeSet<>();
		ts.addAll(ls);

		System.out.println(ts);

		// we can convert set back to list
		List<String> list = new ArrayList<>(ts);

		list.add("Hakan");
		list.add("Harun");
		System.out.println(list);

		// can we convert set to an array

		Object[] array = lhs.toArray();
		// Arrays
		Arrays.sort(array);

		// for collections we have another utilty class

		Collections.sort(list);
		System.out.println(list);
	}

}
