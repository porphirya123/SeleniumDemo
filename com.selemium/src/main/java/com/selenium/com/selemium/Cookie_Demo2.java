package com.selenium.com.selemium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookie_Demo2 {
	
	@Test
	void cookietest()
	{
		
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
	driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	driver.get("https://www.apple.in");
	Set<Cookie> test = driver.manage().getCookies();
	System.out.println(test.size());
	
	for(Cookie test1:test)
	{
		System.out.println("Value "  + test1.getValue());
		System.out.println("Name " +test1.getName() );
	}
	
	Cookie newc = new Cookie("test", "3424324243");
	driver.manage().addCookie(newc);
	test = driver.manage().getCookies();
	System.out.println("after adding " +test.size());
	
	
	
	
	
	
	}
	

	

}
