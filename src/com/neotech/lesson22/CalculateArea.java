package com.neotech.lesson22;

public class CalculateArea {

//	Create a class named CalculateArea in which you
//	should create three methods (with the same name )that
//	will calculate the area (volume) of
//	- Rectangle - Square - Box
//	Use a separate class to test your code

	static void area(int side1, int side2) {
		System.out.println("The area of the Rectangle is --> " + side1 * side2);
	}

	static void area(int side) {
		System.out.println("The area of the square is --> " + side * side);
	}

	static void area(int length, int width, int heigh) {
		System.out.println("The area of the box is ---> " + length * width * heigh);
	}

	void area(double side1, double side2) {
		System.out.println("The area of the Rectangle is --> " + side1 * side2);
	}

}
