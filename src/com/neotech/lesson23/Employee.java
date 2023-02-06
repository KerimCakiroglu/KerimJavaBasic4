package com.neotech.lesson23;

public class Employee {

	double salary;

	// this is a parent behavior
	void getPaid() {
		System.out.println("The employee salary is " + salary);
	}

}

class Contractor extends Employee {
	double hourlyRate;

	// in the child class not everything has to be the same as parent
	// for the same behaviors, we can write the same methods
	// this method overrides the parent getPaid() method
	void getPaid() {
		System.out.println("The contractor hourly rate is " + hourlyRate);
	}
}

class FulltimeEmployee extends Employee {

}
