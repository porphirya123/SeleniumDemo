package com.selenium.com.selemium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapValues {
	
	


	public static void main(String[] args) {
		
		WebDriver driver;
		String location = "/Users/santosh/Desktop/Programming/Selenium/chromedriver";
		System.setProperty("webdriver.chrome.driver", location);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hdfcbank.com");
		
		
		
		
		WebElement cattype = driver.findElement(By.xpath("//a[text() = \"Select Product\"]"));
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(cattype));
		cattype.click();
		List<WebElement> cats = driver.findElements(By.xpath("//ul[@class = \"dropdown2 dropdown-menu\"]//li"));
		for(WebElement cat: cats)
		{
			System.out.println(cat.getText());
			if (cat.getText().equals("Savings Accounts"))
			{
				cat.click();
				break;
			}
		}
		

	}

}
