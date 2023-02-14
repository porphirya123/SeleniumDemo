package PageObjectModel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class pageObjectMainClass {
	
	@Test
	public void verifyFlight()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElements obj = new WebElements(driver);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(obj.FirstName));
		
		
		
		obj.setFname("Santosh");
		obj.setLname("Kumar");
		obj.setPhone("3424324234");
		obj.setEmail("test@test.in");
		obj.setaddress1("GautamBudh Nagar");
		obj.setCity("Noida");
		obj.setState("UP");
		obj.setPostalcode("32324");
		obj.setCountry("India");
		obj.setUser("test@test.in");
		obj.setPass("test123");
		obj.setconfirmPass("test123");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(".//Screenshot//mp.png");
		try {
			FileUtils.copyFile(src, tar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		obj.clickSubmit();
		
		
		
		
		
	}
	
	
	

}
