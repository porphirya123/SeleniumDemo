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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelRuff1101 {
	
	//@Test
	void ruff() throws IOException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		
		
		WebElement seller = driver.findElement(By.xpath("//div[@class = \"go_DOp\"]/a/span[text() = \"Become a Seller\"]"));
		//------------targetscreenshot-----------------------
		File src = seller.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//flipkart.png");
		FileUtils.copyFile(src, tar);
		
		//-----------Explicit Wait----------------------------
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(seller));
		
		//---------Scrolldown & up--------------------------
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.quit();
		
	}
	
	@Test
	void cookie() throws IOException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.apple.in");
		WebElement support = driver.findElement(By.xpath("//a[contains(@class, \"ac-gn-link ac-gn-link-support\")]"));
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//apple.png");
		FileUtils.copyFile(src, tar);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
		
		js.executeScript("window.scrollBy(0,-1000)");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		Cookie ck = new Cookie("test2121","232423432" );
		driver.manage().addCookie(ck);
		cookies = driver.manage().getCookies();
		System.out.println("After adding "+cookies.size() );
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total Links available on Apple homepage = "+links.size());
		
		for(WebElement link:links)
		{
			String urls = link.getAttribute("href");
			URL url = new URL(urls);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			if(con.getResponseCode()>=400)
			{
				System.out.println("Link is broken");
				System.out.println(urls);
			}
			else
			{
				System.out.println("Link is working fine");
			}
			
		}
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
	

}
