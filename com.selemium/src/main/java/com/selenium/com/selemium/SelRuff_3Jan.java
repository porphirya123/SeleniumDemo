package com.selenium.com.selemium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SelRuff_3Jan {
	
	@Test
	public void checkBrokenLink()
	{
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.apple.in");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie cookie:cookies)
		{
			System.out.println("Orginal Cookie size" +cookie.getName());
			System.out.println(cookie.getValue());
			
			
		}
		Cookie obj = new Cookie("test12123", "22423424");
		driver.manage().addCookie(obj);
		cookies = driver.manage().getCookies();
		System.out.println("Cookie size after adding new cookie"+cookies.size());
				
		/*
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		for(WebElement link:links)
		{
			System.out.println(link.getText());
			String url = link.getAttribute("href");
			try
			{
				
			
			URL nurl = new URL(url);
			HttpURLConnection con = (HttpURLConnection)nurl.openConnection();
			con.connect();
			if(con.getResponseCode()>=400)
			{
				System.out.println("Invalid URL");
				
			}
			else
			{
				System.out.println("Valid URL");
			}
			}catch(Exception e)
			{
				System.out.println("Something wrong");
			}
			
		}*/
		
		driver.quit();
		
		
	}
	

}
