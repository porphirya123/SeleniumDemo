package com.selenium.com.selemium;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {

	public static void main(String[] args) {
		
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
	driver = new ChromeDriver();
	driver.get("http://www.deadlinkcity.com");
	
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int count = 0;
	

		for(WebElement link:links)
		{
			if(link.getText() == null || link.getText().isEmpty())
			{
			System.out.println("No URL is available");
			count = count+1;
			continue;
			}
			try
			{
				String vlink = link.getAttribute("href");
				URL url = new URL(vlink);
				HttpURLConnection con;
				con = (HttpURLConnection)url.openConnection();
				
					
				
				con.connect();
				if(con.getResponseCode()>=400)
				{
					System.out.println(con.getResponseCode() + " Bad Connection or Broken Link");
				}
				else
				{
					System.out.println("Valid Connection");
				}
			}catch(Exception e)
			{
				e.printStackTrace();

			}	
			
		}
	}
}

	
			
			
		
		
	
	
	
	
	
	
	
	
	/*TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File tar = new File(".//Screenshot//brokenlink.png");
	try {
		FileUtils.copyFile(src, tar);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	*/
	
	
	
	
	
	
	


