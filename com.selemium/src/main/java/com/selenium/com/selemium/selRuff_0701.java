package com.selenium.com.selemium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
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
import org.testng.annotations.Test;

public class selRuff_0701 {

	@Test
	public void ruffwork()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//0701ruffwork.png");
		try {
			FileUtils.copyFile(src, tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement shopcart = driver.findElement(By.xpath("//span[text() = \"Shopping cart\"]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(shopcart));
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(0,-1000)");
		
		shopcart.click();
		
		WebElement youtube = driver.findElement(By.xpath("//a[text() = \"YouTube\"]"));
		youtube.click();
		driver.findElement(By.xpath("//a[text() = \"Facebook\"]")).click();
		driver.findElement(By.xpath("//a[text() = \"Twitter\"]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println("No of open Browsers " + windows.size());
		Iterator it = windows.iterator();
		
		String win1 = (String) it.next();
		String win2 = (String) it.next();
		String win3 = (String) it.next();
		String win4 = (String) it.next();
		driver.switchTo().window(win2);
		driver.close();
		driver.switchTo().window(win3);
		driver.close();
		driver.switchTo().window(win4);
		driver.close();
		
		
		
		//driver.quit();
		
	}
	
	
}
