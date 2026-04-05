package com.tcs.stepdefinations;

import java.awt.desktop.OpenFilesEvent;

import com.tcs.utils.App;
import com.tcs.utils.DriverFactory;

import io.cucumber.java.en.Given;

public class LoginSteps {
	
	@Given("User is on the login page of OrangeHRM")
	public void openBrowserAndLaunchURL()
	{
		App.getUrl();
	}

}
