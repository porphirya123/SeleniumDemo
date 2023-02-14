package com.selenium.com.selemium.WebDrivers;

import java.io.File;
import java.io.IOException;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

/* -----------TOPICS---------
 * get() - Done
 * WebElement Locators - Done
 * Handling Drop-down fields 
 * Submit form - Done
 * Handling iframes
 * Close & Quit - Done
 * Exception Handling
 * --------------------------
 * ------Popular WebDriver Methods------
 * get() - Done 
 * getTitle() - Done
 * getText() - Done
 * getAttribute()
 * getWindowHandles()
 * getConnection()
 * getCurrentUrl() - Done
 * findElement() & findElements() - Done
 * isEnabled() - Done
 * sendKeys() - Done 
 * Submit() - Done
 * implicitlyWait() & explicitWait() - Done
 * Select() 
 * navigate() - Done
 * getScreenshotAs() - Done
 * moveToElement() 
 * dragAndDrop()
 * switchTo() 
 *
 * POI
 * assertEquals(), assertTrue()
 * 
 */




public class ListofWebDriver_Commands {
	
	@BeforeTest
	void launchUrl() throws IOException
	{
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		WebElement searchbox = driver.findElement(By.xpath("//input[@id = \"twotabsearchtextbox\"]"));
	
		searchbox.sendKeys("Sonos");
		WebElement search = driver.findElement(By.xpath("//div[@class = \"nav-search-submit nav-sprite\"]"));
		
		Actions act = new Actions(driver);
		act.doubleClick(search).perform();
		
		System.out.println("Current URL " + driver.getCurrentUrl());
		System.out.println("Title of the page "+driver.getTitle());
		
		WebElement checkbox_Bose = driver.findElement(By.xpath("//span[text() = \"Bose\"]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(checkbox_Bose));
		
		System.out.println("Is Bose checkbox enabled"+ checkbox_Bose.isEnabled());
		
		act.click(checkbox_Bose).perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//AmazonSonos.png");
		FileUtils.copyFile(src,tar);
		
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		for(Cookie cookie:cookies)
		{
			System.out.println(cookie.getValue());
		}
		
		Cookie newcookie = new Cookie("Test123", "242343242");
		driver.manage().addCookie(newcookie);
		cookies = driver.manage().getCookies();
		System.out.println("After adding new cookies " +cookies.size() );
		
		
		
		//driver.quit();
	}
	
	@Test
	void webDriverCommands()
	{
		
	}

}
