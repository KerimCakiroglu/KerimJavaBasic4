package com.neotech.lesson22;

public class Addition {

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.err.println(a + b + c);

	}

	void add(double a, double b) {
		System.out.println(a + b);
	}

	void add(int a, int b, double c) {

		System.out.println(a + b + c);
	}

	void add(int a, double b, int c, double d) {
		System.out.println(a + b + c + d);
	}

	void add(String s, int i) {
		System.out.println("we cannot add them!");
	}

	void add(int a, double b) {
		System.out.println(a + b);
	}

	int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	int add(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
}
