package com.selenium.com.selemium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/ecosystem/");
	
	
	List<WebElement> headers = driver.findElements(By.xpath("//div[@class = \"row justify-content-center p-5 td-box--100\"]//tr/th[@scope=\"col\"]"));
	System.out.println(headers.size());
	for(WebElement head:headers)
	{
		System.out.println(head.getText());
	}
	
	List<WebElement> table = driver.findElements(By.xpath("//div[@class = \"row justify-content-center p-5\"]//tbody/tr"));
	System.out.println(table.size());
	for(WebElement t: table)
	{
		System.out.println(t.getText());
	}
		
		
	}
	
	

}
