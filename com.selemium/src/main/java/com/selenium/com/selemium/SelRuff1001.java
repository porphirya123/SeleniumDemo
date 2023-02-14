package com.selenium.com.selemium;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelRuff1001 {
	
	@Test
	void ruffwork() throws IOException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement userCreation = driver.findElement(By.xpath("//a[text() = \"Register\"]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(userCreation));
		
		userCreation.click();
		//----------------------------------------------------------
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//SelRuff1001.png");
		FileUtils.copyFile(src, tar);
		
		//----------------------------------------------------------
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		
		//----------------------------------------------------------
		Set<Cookie> cks = driver.manage().getCookies();
		System.out.println(cks.size());
		for(Cookie ck:cks )
		{
			System.out.println(ck.getValue());
			
		}
		Cookie cookie = new Cookie("Test1212", "23243242");
		driver.manage().addCookie(cookie);
		cks = driver.manage().getCookies();
		System.out.println(cks.size());
		
		//----------------------------------------------------------
		
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(WebElement link:links)
		{
		System.out.println(link.getText());
		String url = link.getAttribute("href");
		URL urls = new URL(url);
		HttpURLConnection con = (HttpURLConnection)urls.openConnection();
		
		if(con.getResponseCode()>=400)
		{
			System.out.println("URL is valid");
		}
		else 
		{
			System.out.println("Url is broken");
		}
		
		}
		
		//----------------------------------------------------------
		
	
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in");
		
		
		
		
		
		
	}
	
	

}
