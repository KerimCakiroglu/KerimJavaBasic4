package com.neotech.lesson09;

import java.util.Scanner;

public class HomeworkEkstra {

	public static void main(String[] args) {

//		1. Print numbers from 1 to 50 except those that are divisible by 3
		
		System.out.println("Print numbers from 1 to 50 except those that are divisible by 3");
		
		for(int num =1;num<=50;num++) {
			
			if(num%3==0) {
				 continue;
			}
			
			
			System.out.print(num+" ");
			
		}
		System.out.println();
		
//
//		2. Create a program that will be asking user to apply for a credit card 10 times.
//		As soon you get an "yes" from a user program should stop asking.
		
	

		
		Scanner scan= new Scanner(System.in);
		
		
		
		
		
		
		
for (int a =1;a<=10;a++) {
			
				
	System.out.println("Please apply for a credit card? (Yes or No)");
String answer=scan.next();


	if(answer.equals("Yes")) {
		break;
	}
}
		}
	}


