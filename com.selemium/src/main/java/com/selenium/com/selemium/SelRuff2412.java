package com.selenium.com.selemium;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelRuff2412 {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://demo.nopcommerce.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//ruff2412.png");
		try {
			FileUtils.copyFile(src, tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement sb = driver.findElement(By.xpath("//*[@id =\"small-searchterms\"]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(sb));
		sb.clear();
		sb.sendKeys("Apple");
		driver.findElement(By.xpath("//*[text() =\"Search\" and @class = \"button-1 search-box-button\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		WebElement fb = driver.findElement(By.xpath("//*[text() =\"Facebook\" ]"));
		fb.click();

		Set<String> windows = driver.getWindowHandles();
		Iterator it = windows.iterator();
		String win1 = (String) it.next();
		String win2 = (String) it.next();

		driver.switchTo().window(win2);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("test@testing.in");
		driver.quit();
		driver.get("http://www.deadlinkcity.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			if (url == null || url.isEmpty()) 
			{
				System.out.println("Url is empty");
				continue;
			}
			
			URL nlink = new URL(url);
			try {
				HttpURLConnection con = (HttpURLConnection)nlink.openConnection();
				con.connect();
				if (con.getResponseCode()>=400) 
					{
					System.out.println(con.getResponseCode() + " " + "Broken Link");
					}
				else
					{
					System.out.println("Url is valid");
					}
			}
			
			catch(MalformedURLException e)
			{
				
				e.printStackTrace();
			}
		

	
		}
	}
}

