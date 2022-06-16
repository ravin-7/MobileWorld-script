package demoproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	 WebDriver driver;
     
     public homepage(WebDriver driver)
     {
   	  this.driver=driver;
     }
     By latest=By.xpath("(//a[@id='navbarDropdown'])[1]");
     
     By samsung=By.xpath("//a[text()='Samsung']");
     
     By moredetails=By.xpath("//a[text()='More Details']");
     
     By order=By.xpath("(//a[text()='Order'])[1]");
     
     By contactus=By.xpath("//a[text()='Contact Us']");
     
     By uparrow=By.xpath("(//button[@id='btn-back-to-top'])[1]");
     
     By support=By.xpath("(//a[@id='navbarDropdown'])[2]");
     
     public WebElement  latest()
 	{
 		return driver.findElement(latest);
 	}
   public WebElement  samsung()
 	{
 		return driver.findElement(samsung);
 	}
   public WebElement  moredetails()
 	{
 		return driver.findElement(moredetails);
 	}
   public WebElement  order()
 	{
 		return driver.findElement(order);
 	}
   public WebElement  contactus()
 	{
 		return driver.findElement(contactus);
 	}
   public WebElement  uparrow()
 	{
 		return driver.findElement(uparrow);
 	}
}
