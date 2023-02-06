package com.neotech.lesson25;

public class FileTest {

	public static void main(String[] args) {

		File f1 = new JavaFile();
		f1.close();
		f1.edit();
		f1.open();

		System.out.println("+++++++++++++");

		File java = new JavaFile();
		File pdf = new PdfFile();

		// 1st way
		File[] files = { java, pdf };

		// 2nd way
		File[] fileArray = { new JavaFile(), new PdfFile(), new WordFile(), new JavaFile() };

		for (File f : fileArray) {

		}

	}

}
