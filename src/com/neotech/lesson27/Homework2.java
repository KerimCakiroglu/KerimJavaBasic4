package com.neotech.lesson27;

interface WebDriver {

	void open(); // by default public & abstract

	void close();

	String getTitle();

}

interface TakesScreenShot {
	void getScreenShot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenShot {

	void navigate();

}

class ChromeDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Chrome driver opened");

	}

	@Override
	public void close() {
		System.out.println("Chrome driver closed");

	}

	@Override
	public String getTitle() {

		return "NeoTech Academy";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screentshot is taken by Chrome");

	}

	@Override
	public void navigate() {
		System.out.println("Navigating to a web page using Chrome");

	}

}

class FirefoxDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Friefox driver opened");

	}

	@Override
	public void close() {
		System.out.println("Firefox driver closed");

	}

	@Override
	public String getTitle() {

		return "NeoTech Academy";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screentshot is taken by Firefox");

	}

	@Override
	public void navigate() {
		System.out.println("Navigating to a web page using firefox");

	}

}

class SafariDriver implements RemoteWebDriver {

	@Override
	public void open() {
		System.out.println("Safari driver opened");
	}

	@Override
	public void close() {
		System.out.println("Safari driver closed");
	}

	@Override
	public String getTitle() {
		return "Neotech Academy - Safari";
	}

	@Override
	public void getScreenShot() {
		System.out.println("Screenshot is taken by Safari");
	}

	@Override
	public void navigate() {
		System.out.println("Navigating to a web page using Safari");
	}
}

public class Homework2 {

	public static void main(String[] args) {

		// You can not create an object from an interface
		// RemoteWebDriver rwd = new RemoteWebDriver();

		ChromeDriver c = new ChromeDriver();
		c.open();

		FirefoxDriver f = new FirefoxDriver();
		f.open();

		SafariDriver s = new SafariDriver();
		s.open();

		System.out.println("----Up-casting------");

		RemoteWebDriver rwd1 = c; // up casting
		rwd1.open();

		RemoteWebDriver rwd2 = f; // up-casting

		System.out.println("Why do we need up-casting ?");

		ChromeDriver[] chromeArray = new ChromeDriver[3];
		FirefoxDriver[] firefoxArray = new FirefoxDriver[3];

		RemoteWebDriver[] remoteArray = new RemoteWebDriver[3];
		remoteArray[0] = c;
		remoteArray[1] = f;
		remoteArray[2] = s;

		for (RemoteWebDriver driver : remoteArray) {
			System.out.println("-------------");
			driver.open();
			driver.getScreenShot();
			System.out.println(driver.getTitle());
			driver.navigate();
			driver.close();
		}

	}

}
