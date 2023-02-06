package com.neotech.lesson05;

public class Task01 {

	public static void main(String[] args) {
		
		/**
		 * Write a program. Create a variable day ( 1 - 7)
For every weekday, print "Today is Monday and we are working."
For weekend, print "We are on a break on Weekend."  
		 */
		
		int day = 2;
		//1. if day == 1 ---> Today is Monday and we are working
				//2. if day == 2
				//3. if day == 3
				//....
		
		if (day==1) {System.out.println("Today is Monday and we are working.");}
		
		else if (day==2) {System.out.println("Today is Tuesday and we are working.");}
		else if (day==3) {System.out.println("Today is Wednesday and we are working.");}
		else if (day==4) {System.out.println("Today is Thusday and we are working.");}
		else if (day==5) {System.out.println("Today is Friday and we are working.");}
		
		else {System.out.println("We are on a break on Weekend.");}
		
		
		//lets modify this question
		// instead of printing Today is Monday....
		// we want to print today is a weekday....
		//Possibilties
		//1 . if day  [1-5] -----> today is weekday
		//2. if day is 6 or 7 -----> today is weekend
		
		if (day < 6) {System.out.println("Today is weekday.");}
		else if (day< 8) {System.out.println("Today is weekend.");}
		else {System.out.println("Wrong input!");}
		

	}}


