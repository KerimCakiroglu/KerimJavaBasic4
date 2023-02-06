package com.neotech.lesson14;

public class Student {
//features
	// firstName, lastName, StudentId, school

	String firstName, lastName, StudentId, school;
	int studenId;
	char gender;
	char grade;

	// behaviors:
	// study(), doHomework()

	void study() {
		System.out.println(firstName + " " + lastName + " is studying");
	}

	void doHomework() {
		System.out.println(firstName + " is doing homework!");
	}

}
