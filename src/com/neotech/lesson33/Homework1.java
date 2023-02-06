package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Homework1 {

	public static void main(String[] args) throws IOException {

		// 1. create a path to file
		// to avaoid file location issues
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		String fullPath = projectPath + "/configs/homework";
		System.out.println(fullPath);

		// 2.crate an object to read data(FileInputStream)
		FileInputStream fis = new FileInputStream(fullPath);

		// 3.load the data from the stream
		Properties p = new Properties();
		p.load(fis);

		// what is inside the object
		System.out.println(p);

		// get parameters individualy
		String browser = p.getProperty("browser");
		System.out.println(browser);

		String browser2 = p.getProperty("BROWSER");
		System.out.println(browser2);

		// how do i get all the values
		Set<Object> keys = p.keySet();

		for (Object o : keys) {
			System.out.println(o + " ===> " + p.get(o));
		}

		System.out.println("------Selenium Steps--------");
		System.out.println("I am opening the browser: " + p.getProperty("browser"));
		System.out.println("I will navigate to this page : " + p.getProperty("url"));
		System.out.println("I will enter the username : " + p.getProperty("username"));
		System.out.println("I will enter the pasword: " + p.getProperty("password"));

		// how do we write??
		// 1. I created a new property
		p.setProperty("phonenumber", "5541553251");

		// 2. we neeed an output stream to the file
		FileOutputStream fos = new FileOutputStream(projectPath + "/configs/homework2.txt");

		// 3.Store the properties
		p.store(fos, "Added a new property");

	}

}
