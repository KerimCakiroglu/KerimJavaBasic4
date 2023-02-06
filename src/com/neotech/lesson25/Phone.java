package com.neotech.lesson25;

public abstract class Phone {

	public void call() {
		System.out.println("Phone can make calls!");
	}

	public void text() {
		System.out.println("Phones can send texts!");
	}

	// unimplemented / abstract / undefined
	public abstract void takePicture();

	public abstract void playMusic();
}

class iPhone extends Phone {
// implementing abstract method
	@Override
	public void takePicture() {
		System.out.println("iPhones can take good pictures");

	}

// implementing abstract method
	@Override
	public void playMusic() {
		System.out.println("iphones can play music!");

	}

	// overriding parent method
	@Override
	public void call() {
		System.out.println("Iphone  also makes Facetime calls!");
	}

}

class Samsung extends Phone {

	@Override
	public void takePicture() {
		System.out.println("Samsung takes bad pictures");

	}

	@Override
	public void playMusic() {
		System.out.println("Samsung can play simple music");

	}

	public void googlePlay() {
		System.out.println("Samsung has a google play");
	}

}
