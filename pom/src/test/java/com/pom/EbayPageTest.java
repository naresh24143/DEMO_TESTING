package com.pom;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeDriverService;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	import com.pom.page.LoginGmailPage;
	import com.pom.page.EbayPage;

	public class EbayPageTest
	{
	@ Test (priority=1)
	public void verifyFirstItemPrice()
	{
		

	System.setProperty("webdriver.chrome.driver", "D:\\Project\\pom\\drivers\\chromedriver_win32 (1)/chromedriver.exe");
	//System.setProperty("webdriver.chrome.silentOutput","true");
	WebDriver driver = new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://www.ebay.com");


	EbayPage eBay= new EbayPage(driver);

	eBay.SearchItem("electric guitar");

	eBay.ClickSearch();
	}
	@ Test (priority=2)
	public void ValidateFirstPrlicelist()
	{
		String ItemPrice= EbayPage.FirstPrlicelist();
		System.out.println("First Item Price is  "+ItemPrice);
		
	}
	}




