package com.selenium.com.selemium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		WebElement box = driver.findElement(By.id("target"));
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		WebElement shopcart = driver.findElement(By.xpath("//span[text() = \"Shopping cart\"]"));
		act.click().perform();
		
		
	}

}
