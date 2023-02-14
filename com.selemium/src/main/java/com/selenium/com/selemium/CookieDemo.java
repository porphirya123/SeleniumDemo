package com.selenium.com.selemium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of all cookies " +cookies.size());
		Cookie obj = new Cookie("test123", "3221312");
		driver.manage().addCookie(obj);
		cookies = driver.manage().getCookies();
		System.out.println("New Size " + cookies.size());
		driver.manage().deleteCookieNamed("test123");
		cookies = driver.manage().getCookies();
		
		System.out.println("After Deleting" + cookies.size());
		for(Cookie cookie:cookies)
		{
			System.out.println("Cookie Name" + cookie.getName());
		}
		driver.quit();
	}

}
