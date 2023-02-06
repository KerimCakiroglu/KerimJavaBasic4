package com.neotech.lesson06;

import java.util.Scanner;

public class Task1 {



	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = input.next();
		
		System.out.println("What is your last name?");
		String surName = input.next();
		
		System.out.println("Full name : " + firstName + " "+ "Surname : " + surName );
		
		
}}
