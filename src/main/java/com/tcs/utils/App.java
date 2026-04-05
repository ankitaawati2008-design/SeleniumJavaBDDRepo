package com.tcs.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class App {

	private static final String filePath = "./src/test/resources/config.properties";

	public static String returnProperty(String filePath, String key) throws IOException {
		FileInputStream fis  = new FileInputStream(filePath);
		String value = null;
		
		Properties prop = new Properties();
		prop.load(fis);
		
		value = prop.getProperty(key);
		return value;
	}
	
	public static String getProperty(String key) throws IOException {
		return returnProperty(filePath, key);
	}
	
	public static String getBrowserName() {
		String browserName = null;

		try {
			browserName = returnProperty(filePath, "browser_name");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return browserName;
	}
	
	public static String getUrl() {
		String url = null;

		try {
			url = returnProperty(filePath, "url");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return url;
	}
}
