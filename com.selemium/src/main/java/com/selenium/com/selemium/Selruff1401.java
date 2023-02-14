package com.selenium.com.selemium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selruff1401 {
	
	@Test
	public void test()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("https://www.demo.guru99.com/v4/manager/Managerhomepage.php");
		System.out.println(driver.getTitle());
		
	}

}
