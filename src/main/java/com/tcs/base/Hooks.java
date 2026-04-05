package com.tcs.base;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.tcs.utils.App;
import com.tcs.utils.BrowserActions;
import com.tcs.utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	

	 @Before
	    public void setup() throws IOException {
	        DriverFactory.openBrowser();
	    }

	 @After
	    public void tearDown() {
	        BrowserActions.closeBrowser();
	    }

}
