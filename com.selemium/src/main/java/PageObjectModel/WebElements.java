package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WebElements {
	
	WebDriver driver;
	
	
	@FindBy(how = How.NAME, using ="firstName" )
	WebElement FirstName;
	
	
	@FindBy(how=How.NAME, using="lastName")
	WebElement LastName;

	
	@FindBy(how=How.NAME, using="phone")
	WebElement phone;
	
	@FindBy(how=How.NAME, using="userName")
	WebElement email;
	
	@FindBy(how=How.NAME, using="address1")
	WebElement address1;
	
	@FindBy(how=How.NAME, using="address2")
	WebElement address2;
	
	@FindBy(how=How.NAME, using="city")
	WebElement city;
	
	@FindBy(how=How.NAME, using="state")
	WebElement state;
	
	@FindBy(how=How.NAME, using="postalCode")
	WebElement postalCode;
	
	@FindBy(how=How.NAME, using="country")
	WebElement country;
	
	@FindBy(how = How.NAME, using="email")
	WebElement username;
	
	@FindBy(how = How.NAME, using="password")
	WebElement password;
	
	@FindBy(how = How.NAME, using="confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(how = How.NAME, using="submit")
	WebElement submit;
	
	
	
	
	WebElements (WebDriver d)
	{
		driver = d;
		PageFactory.initElements(d, this);
			
	}
	
	public void setFname(String fname)
	{
		FirstName.sendKeys(fname);
	}
	
	public void setLname(String lname)
	{
		LastName.sendKeys(lname);
	}
	
	public void setPhone(String ph )
	{
		phone.sendKeys(ph);
	}
	
	public void setEmail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void setaddress1(String ad1)
	{
		address1.sendKeys(ad1);
	}
	
	public void setaddress2(String ad2)
	{
		address2.sendKeys(ad2);
	}
	
	public void setCity(String c)
	{
		city.sendKeys(c);
	}
	public void setState(String st)
	{
		state.sendKeys(st);
	}
	
	public void setPostalcode(String pc)
	{
		postalCode.sendKeys(pc);
	}
	
	public void setCountry(String count)
	{
		country.sendKeys(count);
	}
	
	public void setUser(String user)
	{
		username.sendKeys(user);
	}
	
	public void setPass(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void setconfirmPass(String cpass)
	{
		confirmPassword.sendKeys(cpass);
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
	
}
