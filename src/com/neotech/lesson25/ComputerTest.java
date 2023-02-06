package com.neotech.lesson25;

public class ComputerTest {

	public static void main(String[] args) {

		Apple app = new Apple("Apple");
		HP hp = new HP("HP", "Red");

		Computer c1 = new Dell("Dell");
		Computer c2 = new Lenovo("Leneovo");

		// arrays want same data type
		int[] array = { 3, 5, 9, 2 };

		Computer[] comArray = { c1, c2 };

		Computer[] compArray2 = { new Dell("Dell"), new HP("HP", "Black"), new Apple("Apple") };

		for (Computer comp : compArray2) {
			System.out.println("The brand is " + comp.brand);
			comp.run();

			// what if try to run the save() method
			// comp.save(); This method does not exist in Computer class

			Apple[] appleArray = { new Apple("Apple1"), new Apple("Apple2") };

		}

	}

}
