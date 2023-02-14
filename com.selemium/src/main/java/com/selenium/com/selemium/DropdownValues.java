package com.selenium.com.selemium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropdownValues {
	
	public static void main(String[] args)
	{
		
		WebDriver driver;
		String location = "/Users/santosh/Desktop/Programming/Selenium/chromedriver";
		System.setProperty("webdriver.chrome.driver", location);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		WebElement cat = driver.findElement(By.xpath("//select[@title=\"Search in\"]"));
		cat.click();
		Select sl = new Select(cat);
		sl.selectByVisibleText("Books");
		Actions act = new Actions(driver);
		act.click();
		
		
		
	}
	

}
