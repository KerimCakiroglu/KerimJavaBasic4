package com.neotech.lesson25;

public abstract class File {

	// Create a class File that will have the following behaviors:
	// open, edit, close.
	// Edit and close are implemented method while open is an abstract.
	// Create 3 subclasses: JavaFile, WordFile, PdfFile that
	// will provide specific implementation of open behaviour:
	// Example: to open .java file we need notepad++ or
	// sublime text, to open .doc file we
	// need Microsoft word to be installed etc

	public abstract void open();

	public void edit() {
		System.out.println("edit method");
	}

	public void close() {
		System.out.println("close method");
	}

}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("to open java file we need Eclipse ");

	}

}

class WordFile extends File {

	@Override
	public void open() {
		System.out.println("to open word file we need Microsof Word ");

	}

}

class PdfFile extends File {

	@Override
	public void open() {
		System.out.println("to open pdf file we need Acrobat Reader ");

	}

}