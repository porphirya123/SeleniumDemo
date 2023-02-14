package com.selenium.com.selemium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyword_Actions {
	
	@Test
	public void keyboadAction()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		WebElement shopcart = driver.findElement(By.xpath("//span[text() = \"Shopping cart\"]"));
		
		Actions act = new Actions(driver);
		act.click(shopcart).perform();
		
		
		driver.navigate().to("https://text-compare.com/");
		WebElement text1 = driver.findElement(By.id("inputText1"));
		WebElement text2 = driver.findElement(By.id("inputText1"));
		text1.sendKeys("Hello Selenium");
		act.keyDown(Keys.COMMAND);
		act.sendKeys("A");
		act.keyUp(Keys.COMMAND);
		act.perform();
		
		act.keyDown(Keys.COMMAND);
		act.sendKeys("C");
		act.keyUp(Keys.COMMAND);
		act.perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.keyDown(Keys.COMMAND);
		act.sendKeys("V");
		act.keyUp(Keys.COMMAND);
		act.build();
		
	}
	

}
