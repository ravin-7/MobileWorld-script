package demoproject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class mworld {
	WebDriver driver;
	@BeforeSuite
	public void launchbrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://mobileworld.azurewebsites.net/");
		this.driver=driver;
	}
	@AfterSuite
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test(priority=0)
	public void signup() throws InterruptedException
	{
		mworldsignup add=new mworldsignup(driver);
		add.signin().click();
		add.signup().click();
		add.firstname().sendKeys("ravi");
		add.lastname().sendKeys("s");
		add.emailid().sendKeys("ravi@gmail.com");
		add.password().sendKeys("ravi7760");
		add.date().sendKeys("10/24/1998");
		add.genderF().click();
		add.phone().sendKeys("987656789");
		add.bio().sendKeys("hey iam graduate engineering trainee" );
		add.register().click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		add.clicksignin().click();
		driver.switchTo().alert().accept();
	}
		
	@Test(priority=1)
	public void signin() throws InterruptedException
	{
		mworldsignin Mw=new mworldsignin(driver);
		
		Mw.username().sendKeys("ravi");
		Mw.password().sendKeys("ravi");
		Thread.sleep(1000);
		Mw.submit().click();
	}
			
	@Test(priority=4)
	public void homepage() throws InterruptedException
	{
		homepage home=new homepage(driver);
		String text1=driver.getTitle();
		System.out.println(text1);
		System.out.println(text1.equals("Mobile"));
		home.latest().click();
		home.samsung().click();
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0,2500)");
		Thread.sleep(2000);
		home.moredetails().click();
		JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
		scroll1.executeScript("window.scrollBy(0,2500)");
		home.uparrow().click();
		Thread.sleep(1000);
		driver.navigate().back();
		home.order().click();
		driver.navigate().back();
		Thread.sleep(1000);
		home.contactus().click();
	}
	
	@Test(priority=3)
	public void order()
	{
		Orderpage purchase=new Orderpage(driver);
//		purchase.support().click();
//		purchase.clickorder().click();
		Set<String> window = driver.getWindowHandles();
		List<String> list= new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		purchase.enterfirstname().sendKeys("ravi");
		purchase.enterlastname().sendKeys("s");
		purchase.enteremailid().sendKeys("ravi@gmail.com");
		purchase.enterpassword().sendKeys("ravi7");
		purchase.gender().click();
		purchase.number().sendKeys("987656789");
		purchase.address1().sendKeys("75th cross");
		purchase.address2().sendKeys("rajajinagar,bangaloe");
		purchase.cityname().sendKeys("bangalore");
		purchase.state().click();
		Select option=new Select(purchase.state());
		option.selectByIndex(1);
		purchase.state().sendKeys("560010");
		purchase.apple().click();
		purchase.size().sendKeys("2");
		purchase.bought().click();
		purchase.clickNO().click();
		purchase.checked().click();
		purchase.checked2().click();
		purchase.clickordernow().click();	
		purchase.popupclick().click();
	}
	
	@Test(priority=5)
	public void contact() 
	{
		contactus contact=new contactus(driver);
		contact.support().click();
		contact.contactus().click();
		Set<String> window = driver.getWindowHandles();
		int no=window.size();
		System.out.println(no);
		List<String> list= new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		contact.username().sendKeys("ravi");
		contact.email().sendKeys("ravi@gmail.com");
		contact.phone().sendKeys("987656789");
		contact.message().sendKeys("its open in child browser");
		contact.button().click();
	}
	
	@Test(priority=2)
	public void allmobiles()
	{
		allmobiles mobile=new allmobiles(driver);
		mobile.allmobile().click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().equals("Mobile"));
		mobile.search().sendKeys("ap");
		mobile.order().click();
		
	}
}	

