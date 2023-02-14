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
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SelRuff1601 {

	@Test
	void launchrul()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		
		try
		{
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//Selruff1601.png");
		FileUtils.copyFile(src, tar);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		WebElement newProduct = driver.findElement(By.xpath("//a[text() = \"New products\"]"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(newProduct));
		Actions act = new Actions(driver);
		act.click(newProduct).perform();
		
		
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Default Cookies " +cookies.size());
		for(Cookie ck:cookies)
		{
			System.out.println(ck.getName());
		}
		
		Cookie nck = new Cookie("test","3424234");
		driver.manage().addCookie(nck);
		cookies = driver.manage().getCookies();
		System.out.println("After adding new Cookie " +cookies.size());
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total Links available on the Gift Card page = "+links.size());
		for(WebElement link:links)
		{
			System.out.println(link.getText());
			String slink = link.getAttribute("href");
			URL url = new URL(slink);
			HttpURLConnection nurl = (HttpURLConnection)url.openConnection();
			if(nurl.getResponseCode()>=400)
			{
				System.out.println("Connection is broken");
			}
			else
			{
				System.out.println("URL is valid and connection is good");
			}
		}
		File tar2 = new File(".//Screenshot//np.png");
		FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), tar2);
		
		WebElement youTube = driver.findElement(By.xpath("//a[text() = \"YouTube\"]"));
		youTube.click();
		Set<String> windows = driver.getWindowHandles();
		Iterator it = windows.iterator();
		String win1 = (String) it.next();
		String win2 = (String) it.next();
		driver.switchTo().window(win1);
		driver.close();
		
		
		
		
		
		}catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
		finally
		{
			System.out.println("This is Finally Block");
		}
		
		
		
	}
	
}
