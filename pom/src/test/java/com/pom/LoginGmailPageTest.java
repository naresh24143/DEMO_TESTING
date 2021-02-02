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

public class LoginGmailPageTest
{
@Test (priority=1)
public void verifyValidLogin()
{
	

System.setProperty("webdriver.chrome.driver", "D:\\Project\\pom\\drivers\\chromedriver_win32 (1)/chromedriver.exe");
//System.setProperty("webdriver.chrome.silentOutput","true");
WebDriver driver = new ChromeDriver(); 
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://www.gmail.com");


LoginGmailPage login= new LoginGmailPage(driver);

login.typeUsername("naresh.gurram58");

login.ClickNext();
String ErrorMessage= LoginGmailPage.ValidateError();
Assert.assertEquals(ErrorMessage,"Sign in");
}
@ Test (priority=2)
public void gmailtitletest()
{
	String title= LoginGmailPage.ValidateGmailTitle();
	Assert.assertEquals(title,"Gmail");
}
}


