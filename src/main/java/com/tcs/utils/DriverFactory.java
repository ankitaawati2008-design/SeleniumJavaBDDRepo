package com.tcs.utils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.tcs.exceptions.InvalidBrowserNameException;

public class DriverFactory {

	public static RemoteWebDriver driver;

	public static void openBrowser() {

		String browserName = App.getBrowserName();
		if (browserName.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browserName.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else
			throw new InvalidBrowserNameException(browserName);
		driver.manage().window().maximize();
	}

	public static RemoteWebDriver getDriver() {
		return driver;
	}
}
