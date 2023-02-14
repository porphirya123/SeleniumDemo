package com.selenium.com.selemium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selruff2101 {
	
	@Test
	public void firefox()
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/santosh/Desktop/Programming/Selenium/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		
	}

}
