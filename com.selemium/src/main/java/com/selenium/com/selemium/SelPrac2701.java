package com.selenium.com.selemium;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelPrac2701 {
	
	@Test
	public static void launchapp()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		try
		{
		driver.get("https://www.amazon.in");
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(searchbox));
		searchbox.sendKeys("Sonos");
			
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//test123.png");
		FileUtils.copyFile(src, tar);
		
		List<WebElement>links = driver.findElements(By.xpath("//a"));
		System.out.println("Total number of urls"+links.size());
		for(WebElement link:links)
		{
			
			String url = link.getAttribute("href");
			URL newUrl = new URL(url);
			HttpURLConnection con = (HttpURLConnection)newUrl.openConnection();
			con.connect();
			if(con.getResponseCode()>=400)
				
			{
				System.out.println("Url is broken");
				
			}
			else
			{
				System.out.println("Url is valid");
			}
		}
		
		}catch(Exception e)
		{
			System.out.println("Exception found");
		}
		finally
		{
			System.out.println("This is a Finally exception");
		}
		
		
		
	}
	
	

}
