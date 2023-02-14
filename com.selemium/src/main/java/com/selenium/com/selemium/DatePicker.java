package com.selenium.com.selemium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		String year = "2023";
		String month = "Mar";
		String date = "30";
		
		WebElement dinput = driver.findElement(By.xpath("//input[@id = \"onward_cal\"]"));
		dinput.click();
		
		while(true)
		{
			String dateyear = driver.findElement(By.xpath("//td[@class = \"monthTitle\"]")).getText();
			String arr[] = dateyear.split(" ");
			String m = arr[0];
			String y = arr[1];
			
			System.out.println("Month" + m);
			System.out.println("Year" + y);
			
			if(m.equalsIgnoreCase(month) && y.equals(year)) {
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
			}
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class=\"rb-monthTable first last\"]//td"));
		for(WebElement d:alldates)
		{
			if(d.getText().equals(date))
			
			{
				d.click();
			}
		}
		
		
	}

}
