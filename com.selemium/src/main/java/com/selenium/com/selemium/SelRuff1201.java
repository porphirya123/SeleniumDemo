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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelRuff1201 {
	@Test
	void test() throws IOException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		WebElement searchbox = driver.findElement(By.xpath("//input[@id = \"twotabsearchtextbox\"]"));
		
		Actions act = new Actions(driver);
		act.click(searchbox).perform();
		searchbox.sendKeys("Sonos");
		WebElement search = driver.findElement(By.xpath("//div[@class = \"nav-search-submit nav-sprite\"]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(search));
		
		
		act.click(search).perform();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//amazon.png");
		FileUtils.copyFile(src, tar);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
				
		List<WebElement>links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		/*for(WebElement link:links)
		{
			String urlText = link.getAttribute("href");
			
			URL url = new URL(urlText);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			if(con.getResponseCode()>=400)
			{
				System.out.println("Bad Connection or URL is broken");
			}
			else
			{
				System.out.println("URL is valid");
			}
			
		}*/
		
		
		//driver.quit();
		
		
		
		
		
	}

}
