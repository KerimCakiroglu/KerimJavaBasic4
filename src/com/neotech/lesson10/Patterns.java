package com.neotech.lesson10;

public class Patterns {

	public static void main(String[] args) {
//		Let's print this pattern
//		*
//		**
//		***
//		****
//		*****
//		*****
//		****
//		***
//		**
//		*

//		The first part
//		*
//		**
//		***
//		****
//		*****

		for (int row = 1; row <= 5; row++) {
			// this inner loop executes as many times as the value of row
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}

			// This is for the new line
			System.out.println();
		}

//The second part
//*****
//****
//***
//**
//*
		for (int row = 5; row >= 1; row--) {

			// this inner loop executes as many times as the value of row
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}

			// this is for the new line
			System.out.println();
		}

	}

}
