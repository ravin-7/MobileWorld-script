package demoproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mworldsignin {
	WebDriver driver;
	public mworldsignin(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(xpath="//button[text()='SIGN IN']")
	WebElement signin;
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By proceed=By.xpath("//a[@type='submit']");
	By click=By.xpath("//button[text()='SIGN IN']");
	
	public WebElement signin()
	{
		return signin;
	}
	
	public WebElement  username()
	{
		return driver.findElement(username);
	}
	public WebElement  password()
	{
		return driver.findElement(password);
	}
	public WebElement  submit()
	{
		return driver.findElement(proceed);
	}
	public WebElement  click()
	{
		return driver.findElement(click);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object [][] data=new Object[2][2];
		data[0][0]="dhanu";
		data[0][1]="dhanu7760";
		data[1][0]="ravi";
		data[1][1]="rav1";
		return data;
	}
	
}
