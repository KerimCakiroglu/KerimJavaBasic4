package com.neotech.lesson34;

public class IntroToExceptions {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		// System.out.println(a / b);

		// 0, 1, 2
		int[] arr = { 2, 4, 6 };

		// System.out.println(arr[5]);

		String filePath = "";
//				FileInputStream fis = new FileInputStream(filePath); //FileNotFoundException

		NullPointerException npe = new NullPointerException();
		throw (npe);

		// System.out.println("Exceptions are fun!!");

	}

}
