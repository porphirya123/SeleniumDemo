package com.selenium.com.selemium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ruffwork18122022 {

	WebDriver driver;

	public void launchgoogle() {

		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https:www.google.com");
		WebElement Searchbox = driver.findElement(By.xpath("//input[@name = \"q\"]"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Searchbox));

		Searchbox.sendKeys("Selenium");
		Searchbox.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
	}

	public void testAlert()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		WebElement signIn = driver.findElement(By.xpath("//a[text()= \"Sign in\"]"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(signIn));
		signIn.click();
		
		driver.findElement(By.xpath("//input[@name = \"proceed\"]")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.quit();
	}
	
	
	public static void main(String[] args) {
		
		Ruffwork18122022 obj = new Ruffwork18122022();
		obj.testAlert();

	}

}
