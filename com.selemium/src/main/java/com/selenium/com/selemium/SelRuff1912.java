package com.selenium.com.selemium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelRuff1912 {

	public static void main(String[] args) {
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
	
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com");
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(src, new File(".//Screenshot//homepage3.png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		WebElement img = driver.findElement(By.xpath("//img[contains(@alt, \"When Saffron\")]"));
		File src1 = img.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//homepage4.png");
		try {
			FileUtils.copyFile(src1, tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		
		
		
		
	}

}
