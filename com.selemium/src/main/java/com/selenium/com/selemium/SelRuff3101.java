package com.selenium.com.selemium;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelRuff3101 {
	
	@Test
	public static void test()
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		try
		{
		driver.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//pic31.png");
		FileUtils.copyFile(src, tar);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement fblink = driver.findElement(By.xpath("//a[text() = \"Facebook\"]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(fblink));
		
		fblink.click();
		Set<String>windows = driver.getWindowHandles();
		Iterator it = windows.iterator();
		String win1 = (String) it.next();
		String win2 = (String) it.next();
		driver.switchTo().window(win2);
		driver.close();
		driver.switchTo().window(win1);
		
		List<WebElement> urls = driver.findElements(By.xpath("//a"));
		System.out.println(urls.size());
		for(WebElement url:urls)
		{
			String link = url.getAttribute("href");
			URL nlink = new URL(link);
			HttpURLConnection con = (HttpURLConnection)nlink.openConnection();
			con.connect();
			if(con.getResponseCode()>=400)
			{
				System.out.println("Url is broken");
				
			}
			else
			{
				System.out.println(url.getText() + " URL is valid ");
			}
		}
		
		
		
		}catch(Exception e)
		{
			System.out.println("Test comes under exception");
		}
		
		
		
	}

}
