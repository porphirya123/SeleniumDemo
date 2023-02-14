package com.selenium.com.selemium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selruff2312 {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//2312-3.png");
		try {
			FileUtils.copyFile(src, tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement electronics = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(electronics));
		
		electronics.click();
		
		WebElement cellImg = driver.findElement(By.xpath("//img[@title=\"Show products in category Cell phones\"]"));
		File sc = cellImg.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sc,tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebDriverWait cellwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		cellwait.until(ExpectedConditions.elementToBeClickable(cellImg));
		cellImg.click();
		
		
		WebElement fb = driver.findElement(By.linkText("Facebook"));
		fb.click();
		Set<String> win = driver.getWindowHandles();
		Iterator it = win.iterator();
		String win1 = (String)it.next();
		String win2 = (String) it.next();
		
		driver.switchTo().window(win2);
		driver.close();
		
		
		
		
		
		//driver.quit();
		
		
	}

}
