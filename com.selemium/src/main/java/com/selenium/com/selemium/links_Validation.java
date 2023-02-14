package com.selenium.com.selemium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links_Validation {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in");
		
		List<WebElement> links= driver.findElements(By.xpath("//a"));
		int len=0;
		int blankurl = 0;
		for(WebElement link:links)
		{
			if(link.getText()==null || link.getText().isEmpty())
			{
				System.out.println("Below links are have no valid urls");
				blankurl++;
				continue;
				
			}
			
			if(!(link.getText()).isBlank())
			{
			System.out.println(link.getText());
			
			len++;
			continue;
			}
		
			
		}
		System.out.println("No of Blank URLs are = "+ blankurl);
		System.out.println("Total Valid Links available on the page is = "+len);
	}

}
