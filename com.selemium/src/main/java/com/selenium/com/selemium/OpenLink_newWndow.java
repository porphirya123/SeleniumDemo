package com.selenium.com.selemium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLink_newWndow {

	public static void main(String[] args) {
		
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.nopcommerce.com/");
	
	String click = Keys.chord(Keys.COMMAND,Keys.ENTER);
	driver.findElement(By.xpath("//a[text()=\"Register\"]")).sendKeys(click);
	
	Set<String> windows = driver.getWindowHandles();
	Iterator it = windows.iterator();
	String win1 = (String) it.next();
	String win2 = (String) it.next();
	driver.switchTo().window(win2);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");
	
	
	
	//driver.close();
	
	
	
	
	
	
		
	}

}
