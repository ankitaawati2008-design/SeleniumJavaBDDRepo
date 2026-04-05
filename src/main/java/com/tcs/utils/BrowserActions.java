package com.tcs.utils;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserActions {


	 public static void launchUrl() {
		 App.getUrl();
	 }
	 
	 public static void closeBrowser() {
	        if (DriverFactory.getDriver() != null) {
	            DriverFactory.getDriver().quit();
	            System.out.println("Browser closed successfully.");
	        } else {
	            System.out.println("No browser instance found to close.");
	        }
	    }
}
