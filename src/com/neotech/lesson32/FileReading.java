package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) throws IOException {

		// 1st locate your.properties file
		String filePath = "example.properties";
		System.out.println(filePath);

		// find the user directory
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);

		// find user name
		String userName = System.getProperty("user.name");
		System.out.println(userName);

		String os = System.getProperty("os.name");
		System.out.println(os);

		// lets create dynamic path

		String dynamicFilePath = userDirectory + "/example.properties";
		System.out.println(dynamicFilePath);

		FileInputStream fis = new FileInputStream(dynamicFilePath);

		// create a properties obj

		Properties prop = new Properties();
		// load the data from file
		prop.load(fis);

		String name = prop.getProperty("name");

		System.out.println(name);

		System.out.println(prop.getProperty("phoneNumber"));

	}

}
