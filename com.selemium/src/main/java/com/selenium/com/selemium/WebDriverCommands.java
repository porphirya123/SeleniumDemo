package com.selenium.com.selemium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in");
		System.out.println("Current url" + driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		System.out.println("Title " + driver.getTitle());

		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println(searchbox.isDisplayed());
		System.out.println(searchbox.isEnabled());
		System.out.println(searchbox.isSelected());
		searchbox.sendKeys("Sonos");

		searchbox.sendKeys(Keys.ENTER);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot/test1.png");
		try {
			FileUtils.copyFile(src, tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.apple.in");
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File tar1 = new File(".//Screenshot/test2.png");
		try {
			FileUtils.copyFile(src1, tar1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();

	}

}
