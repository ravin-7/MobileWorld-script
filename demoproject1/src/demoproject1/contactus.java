package demoproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactus {
	WebDriver driver;
	public contactus (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@id='navbarDropdown'])[2]")
	WebElement support;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement contactus;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement phone;
	
	@FindBy(xpath="//textarea[@name='message']")
	WebElement message;
	
	@FindBy(xpath="//input[@value='Send']")
	WebElement button;
	
	public WebElement contactus()
	{
		return contactus;
	}
	public WebElement username()
	{
		return username;
	}
	public WebElement email()
	{
		return email;
	}
	public WebElement phone()
	{
		return phone;
	}
	public WebElement message()
	{
		return message;
	}
	public WebElement support()
	{
		return support;
	}
	public WebElement button()
	{
		return button;
	}
	
}
