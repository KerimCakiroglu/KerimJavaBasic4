package com.neotech.lesson22;

public class CalculateAreaTest {

	public static void main(String[] args) {

		CalculateArea.area(5);
		CalculateArea.area(6, 7);
		CalculateArea.area(4, 5, 6);

		CalculateArea ca = new CalculateArea();
		ca.area(5.5, 7.2);

	}

}
