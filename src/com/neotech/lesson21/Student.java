package com.neotech.lesson21;

public class Student {

	// Homework 1: DONE
//    Write program as a Student class that has instance variables name and address. 
//    Create a constructor that will initialize those variables. 
// Print name & address of given student using displayInfo method.

//	Homework 2:
//	  Write a program that will have 4 different access levels of constructors and create 3 objects of this class: 
//		  1 -inside same class; 
//	2 -from outside the class; 
//	3 -from different class inside different package and observe result.
//	  
//	  
//	Homework 3:
//	  Write program that have static constructor and observe result.

	String name, adress;

	public Student() {

	}

	public Student(String name, String adress) {
		this.name = name;
		this.adress = adress;

	}

	public Student(String name) {
		this.name = name;

	}

	public void displayInfo() {
		String name = "Aykut";
		System.out.println("Name: " + name);
		System.out.println("Name -->" + this.name + " Adresss ---> " + this.adress);
	}

}
