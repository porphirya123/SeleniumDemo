package JavaPractice.Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithReturnType {
	

@Test
public static void launchurl()
{
	WebDriver driver;
	System.setProperty("webdriver.driver.chrome", "/Users/santosh/Desktop/Programming/Selenium/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.amazon.in");
	
}




}