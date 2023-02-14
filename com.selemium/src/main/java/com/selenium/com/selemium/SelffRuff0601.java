package com.selenium.com.selemium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
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

public class SelffRuff0601 {
	
	
	
	@Test
	public void launchurl()
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement jw = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(jw));
		
		jw.click();
		
		//---------------------Screenshot------------------------
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//selRuff0602.png");
		try {
			FileUtils.copyFile(src, tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//---------------------------------------------------------
		
		//---------------------Targeted Screenshot-----------------
		WebElement neck = driver.findElement(By.xpath("//img[@title=\"Show details for Flower Girl Bracelet\"]"));
		File nec = neck.getScreenshotAs(OutputType.FILE);
		File ntar = new File(".//Screenshot//nec.png"); 
		try {
			FileUtils.copyFile(nec, ntar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//---------------------------------------------------------
		
		//---------------------Scroll Up and Down------------------
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		js.executeScript("window.scrollBy(0,-1000)");
		
		//---------------------------------------------------------
		
		//---------------------Switch to New Window -------------------------
		
		WebElement fb = driver.findElement(By.xpath("//a[text() = \"Facebook\"]"));
		
		fb.click();
		Set<String> windows = driver.getWindowHandles();
		Iterator it = windows.iterator();
		
		String win1 = (String) it.next();
		String win2 = (String) it.next();
		driver.switchTo().window(win2);
		driver.close();
		
		//---------------------------------------------------------

		//------------------------Cookies---------------------------------

		Set<Cookie> cks = driver.manage().getCookies();
		System.out.println(cks.size());
		for(Cookie ck: cks)
		{
			System.out.println(ck.getName());
			
		}
		
		Cookie adcookie = new Cookie("test12","3424234");
		driver.manage().addCookie(adcookie);
		driver.manage().getCookies();
		System.out.println("After adding"+cks.size());
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
