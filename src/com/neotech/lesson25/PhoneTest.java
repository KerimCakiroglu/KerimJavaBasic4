package com.neotech.lesson25;

public class PhoneTest {

	public static void main(String[] args) {

		// we cannot crate from abstract classes
		// Phone p = new Phone():
		// p.takePicture();

		Phone iphone = new iPhone(); // upcasting
		iphone.call();
		iphone.text();
		iphone.takePicture();
		iphone.playMusic();

		Phone samsung = new Samsung();
		samsung.call();
		samsung.text();
		samsung.takePicture();
		samsung.playMusic();

		// Error. No googlePlay() method in Phone class
		// samsung.googlePlay();

	}

}
