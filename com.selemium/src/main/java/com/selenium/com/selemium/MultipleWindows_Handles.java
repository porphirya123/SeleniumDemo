package com.selenium.com.selemium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows_Handles {
	
	@Test
	public void multi_Windows()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement FBwin = driver.findElement(By.xpath("//a[text() = \"Facebook\"]"));
		FBwin.click();
		Set<String> windows = driver.getWindowHandles();
		Iterator it = windows.iterator();
		String win1 = (String) it.next();
		String win2 = (String) it.next();
		driver.switchTo().window(win2);
		driver.close();
		
		
		
		
		
	}

}
