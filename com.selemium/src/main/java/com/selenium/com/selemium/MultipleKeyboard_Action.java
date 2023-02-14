package com.selenium.com.selemium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleKeyboard_Action {

public static void main(String[] args)
{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://text-compare.com/");
	WebElement src = driver.findElement(By.name("text1"));
	WebElement tar = driver.findElement(By.name("text2"));
	
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.elementToBeClickable(src));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	src.sendKeys("Welcome to Selenium Practice");
	
	
	
	Actions act = new Actions(driver);
	act.keyDown(Keys.COMMAND);
	act.sendKeys("A");
	act.keyUp(Keys.COMMAND);
	act.perform();
	
	act.keyDown(Keys.COMMAND);
	act.sendKeys("C");
	act.keyUp(Keys.COMMAND);
	act.perform();
	
	//wait.until(ExpectedConditions.elementToBeClickable(tar));
	
	
	  act.sendKeys(Keys.TAB); act.perform();
	  
	  act.keyDown(Keys.COMMAND); 
	  act.sendKeys("V");
	  act.keyUp(Keys.COMMAND);
	  act.perform();
	 
	
}
	

}
