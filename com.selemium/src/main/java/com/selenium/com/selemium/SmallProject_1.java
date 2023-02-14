package com.selenium.com.selemium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SmallProject_1 {
	
	
	
	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		//Flashing
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement logo  = driver.findElement(By.xpath("//img[@alt = \"nopCommerce demo store\"]"));
		js.executeScript("arguments[0].style.border='5px dotted blue'", logo);
		
		WebElement register = driver.findElement(By.xpath("//a[text()=\"Register\"]"));
		
		// Explicit Wait
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(register));
		
		
		// Takes Screenshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//MiniProject.png");
		try {
			FileUtils.copyFile(src, tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Scroll Down
		
		
		js.executeScript("window.scrollBy(0,2500)");
		
		driver.findElement(By.xpath("//a[contains(text(), \"Facebook\")]")).click();
		
		
		
		
		
		//Switch to another window
		
		Set<String> windows = driver.getWindowHandles();
		Iterator it = windows.iterator();
		String win1 = (String) it.next();
		String win2 = (String) it.next();
		driver.switchTo().window(win2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.switchTo().window(win1);
		
		
		register.click();
		
		
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File s = screen.getScreenshotAs(OutputType.FILE);
		File r = new File(".//Screenshot//Register.png");
		try {
			FileUtils.copyFile(s,r);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		for (WebElement link:links)
		{
			link.getText();
		}
		
		
		
		
		
		
	}
	
	

}
