package com.selenium.com.selemium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker_Demo1 {
	
	@Test
	void DatePicker()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		String year = "2023";
		String month = "May";
		String date = "20";
		
		WebElement dateBox = driver.findElement(By.xpath("//input[@id=\"onward_cal\"]"));
		dateBox.click();
		
		
		
		while(true)
		{
			
			String yymm = driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
			String[] ym = yymm.split(" ");
			String mm = ym[0];
			String yy = ym[1];
			if(mm.equalsIgnoreCase(month) && yy.equals(year))
			{
			break;
			}
		
			else
			{
			driver.findElement(By.xpath("//td[@class = \"next\"]")).click();
		
			}
		}
		List<WebElement> alldates = driver.findElements(By.xpath("//td[contains(@class, \"day\")]"));
		for(WebElement alldate:alldates)
		{
			if(alldate.getText().equals(date))
			{
				alldate.click();
			}
		}
		
		
		
		
		
	}

}
