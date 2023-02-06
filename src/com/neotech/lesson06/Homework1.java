package com.neotech.lesson06;

public class Homework1 {

	public static void main(String[] args) {

		// NotAllergic or Allergic
		// Allergic: peanut, lacoste, bee, seafood
		// "Don't eat " +

		boolean allergy = true;
		boolean peanut = true;
		boolean lacoste = false;
		boolean bee = true;
		boolean seafood = true;

		// Run Code Shortcut Command + F11

		if (allergy) {
			// the patient has allergies

			System.out.println("You have allergy!");

			if (peanut) {
				// the patient has peanut allergies

				System.out.println("Don't eat peanuts!!!");
			}
			if (lacoste) {
				System.out.println("Don't drink milk!!!");
			}
			if (bee) {
				
				System.out.println("Don't eat honey!!!");
			}
			if (seafood) {
				
				System.out.println("Don't eat fish!!!");
			}
		}
		else {System.out.println("You are healhty!!");}

	}

}
