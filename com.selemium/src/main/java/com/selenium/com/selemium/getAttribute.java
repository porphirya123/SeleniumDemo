package com.selenium.com.selemium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args)
	{
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com");
		
		driver.findElement(By.linkText("Sign in")).click();
		WebElement login = driver.findElement(By.id("login1"));
		login.clear();
		login.sendKeys("Porphirya123");
		System.out.println(login.getText());
		System.out.println(login.getAttribute("type"));
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
