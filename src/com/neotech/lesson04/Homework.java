package com.neotech.lesson04;

public class Homework {

	
	public static void main(String[] args) {
		//2. Write a java program that converts mile to km and km to miles.
		//Use scale 1 mile = 1.609344;
		
		double mile, km, scale;  //declarin 3 variavles
		
		scale = 1.609344;
		mile= 2;
		
		km = mile * scale;
		
		System.out.println(mile + " miles is " + km + " kilometers.");
		
		double km2 = 60;
		double mile2 = km2 / scale;
		
		System.out.println(km2 + " kilometers is " + mile2 + " miles.");
		
		/**
		 * 1. Write a java program to display the area and perimeter
of a circle that has a radius of 5. Use pi = 3.
		 */
		 int area = 3 * 5;
		 System.out.println(area);
		
	}
	
	
	
}
