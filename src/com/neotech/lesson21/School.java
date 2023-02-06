package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {

		// 1st constructor is used

		Student st1 = new Student();

		st1.displayInfo();
		st1.name = "Sedat";
		st1.adress = "123 main st";
		st1.displayInfo();

		System.out.println("---------------");

		Student st2 = new Student("Kenan", "456 Broen St");
		st2.displayInfo();
		System.out.println("---------------");

		Student st3 = new Student("Elmira");
		st3.displayInfo();
	}

}
