package com.neotech.lesson18;

public class Employee {

//	Create a Class called Employee:
//	 Create three variables: eID, salary and set the CEO to “Elion”
//		:black_small_square: CEO should be a static variable
//		:black_small_square: Create a method printInfo() that prints out the eID, salary and
//		CEO of the object
//		:black_small_square: Create two objects of the class Employee
//		:black_small_square: Set the value of eID, salary for each of the objects
//		:black_small_square: Call the printInfo() method for both objects
//		:black_small_square: Change the CEO to “Ahmet”
//		:black_small_square: Call the printInfo() method for both objects

	int eID;
	long salary;
	static String CEO = "Elion";

	void printInfo() {
		System.out.println("eID: " + eID + " salary: " + salary + " CEO: " + CEO);

	}

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.eID = 1;
		emp1.salary = 50000;
		Employee emp2 = new Employee();
		emp2.eID = 2;
		emp2.salary = 90000;

		emp1.printInfo();

		Employee.CEO = "Ahmet";
		emp2.printInfo();

	}

}
