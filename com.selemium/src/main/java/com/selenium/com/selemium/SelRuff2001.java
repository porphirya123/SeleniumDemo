package com.selenium.com.selemium;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelRuff2001 {
	
	@Test
	public void seltest()
	{
		try
		{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement ContactUs = driver.findElement(By.xpath("//a[text() = \"Contact us\"]"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ContactUs));
		
		ContactUs.click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//selruff2001.png");
		FileUtils.copyFile(src, tar);
		
		
		
		driver.navigate().back();
		
		List<WebElement>links = driver.findElements(By.xpath("//a"));
		for(WebElement link:links)
		{
			String slink = link.getAttribute("href");
			URL url = new URL(slink);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			if(con.getResponseCode()>=400)
			{
				System.out.println("Link is broken");
			}
			else
			{
				System.out.println("Link is working fine");
			}
		}
		
		Set<Cookie>cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie cookie : cookies)
		{
			cookie.getName();
		}
		Cookie ncookie = new Cookie("TEst323", "32424234234");
		driver.manage().addCookie(ncookie);
		cookies = driver.manage().getCookies();
		System.out.println("After adding"+cookies.size());
		
		
		}catch(ArithmeticException e)
		{
			System.out.println("There is an exception");
		}
		
		catch(Exception e)
		{
			System.out.println("There seems an exception");
		}
		finally
		{
			System.out.println("This is finally block");
		}
		
		
		
		
		
		
		
		
	}

}
