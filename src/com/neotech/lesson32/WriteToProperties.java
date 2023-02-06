package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {

	public static void main(String[] args) throws IOException {

		// where is my .properties file located?

		// 1st locate your.properties file
		String filePath = "example.properties";

		// 2.create an object of FileInputStream
		FileInputStream fis = new FileInputStream(filePath);

		// 3. to handle .properties file; we need to use a Properties java class
		Properties prop = new Properties();

		// load the file: if you don't load the file and try to write on it,
		// everything on the file will be lost
		prop.load(fis);

		prop.setProperty("phoneNumber", "987654");

		prop.setProperty("city", "Manhatton");

		// to write to the file, we need a connection FiletOutputStream

		FileOutputStream fos = new FileOutputStream(filePath);

		prop.store(fos, "we updated the phone number");

	}

}
