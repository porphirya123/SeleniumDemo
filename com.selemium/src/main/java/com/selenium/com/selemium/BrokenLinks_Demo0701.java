package com.selenium.com.selemium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks_Demo0701 {
	
	@Test
	public void brokenLink() throws IOException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total Links available = "+links.size());
		for(WebElement link:links)
		{
			String url = link.getAttribute("href");
			URL newlink = new URL(url);
			HttpURLConnection con = (HttpURLConnection)newlink.openConnection();
			
			if(con.getResponseCode()>=400)
			{
				System.out.println("The link is broken");
			}
			else
			{
				System.out.println("Link is good");
			}
		}
		
				
		
	}
	
	

}
