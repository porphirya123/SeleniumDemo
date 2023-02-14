package com.selenium.com.selemium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jQuery {

	public static void main(String[] args) {
		
		WebDriver driver;
		String location = "/Users/santosh/Desktop/Programming/Selenium/chromedriver";
		System.setProperty("webdriver.chrome.driver", location);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		/*driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> lists= driver.findElements(By.xpath("//span[@class = \"comboTreeItemTitle\"]"));
		for(WebElement list: lists)
		{
			System.out.println(list.getSize());
			System.out.println(list.getText());
		}*/
		
		selectChoice(driver,"choice 1");
		
	}

	
	public static void selectChoice(WebDriver driver, String...value)
	{
		driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> lists= driver.findElements(By.xpath("//span[@class = \"comboTreeItemTitle\"]"));
		
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement list:lists)
			{
				String text = list.getText();
				for(String val:value)
				{
					if(text.equals(val))
					{
						list.click();
						break;	
					}
					
				}
			}
		}
		else
		{
			for(WebElement list1: lists)
			{
				list1.click();
			}
		}
	}
	
}
