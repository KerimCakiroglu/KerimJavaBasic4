package com.neotech.lesson16;

public class StringMethods {

	public static void main(String[] args) {

		// 1st way we used to create strings
		String name = "Oktay"; // string literal

		// 2nd way create string
		String name2 = new String("Dardan");

		// length()
		int size = name.length();

		System.out.println("The size of name is " + size);
		String school = "Neotech";

		// toUpperCase() toLowerCase()

		String city = "New York";

		String lowercaseCity = city.toLowerCase();
		System.out.println(lowercaseCity);
//2nd way
		System.out.println(city.toUpperCase());
		// 3rd way
		System.out.println(city);// no change

		city = "New York City";

		// trim ()
		String str2 = "    T am   very hungry    !     ";
		System.out.println(str2.trim());

		System.out.println("Length of str2 is " + str2.length());
		System.out.println("Length of trimmed str2 is " + str2.trim().length());

		System.out.println("-------------------------------");

		int[] num = { 4, 3, 6, 7 };
		int sizeArray = num.length; // this is a property of arrays

		int sizeOfString = "Hello".length(); // this is a string method

	}

}
