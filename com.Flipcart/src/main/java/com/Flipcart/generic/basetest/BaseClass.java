package com.Flipcart.generic.basetest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.Flipcart.generic.fileutility.ExcelUtility;
import com.Flipcart.generic.fileutility.FileUtility;
import com.Flipkart.generic.webdriverUtility.WebdriverUtility;

public class BaseClass 
{
	public FileUtility flib=new FileUtility();
	public ExcelUtility elib=new ExcelUtility();
	public WebdriverUtility wlib=new WebdriverUtility();
	
	public WebDriver driver;
	public static WebDriver extradriver;
	
	@BeforeClass
	public void browserSet() throws Throwable 
	{
		String browser = flib.getDataFromPropertiesFile("browser");
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge") ){
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		extradriver=driver;
		
		//Maximize the Browser
		driver.manage().window().maximize();

		//Navigating to Url
		driver.get(flib.getDataFromPropertiesFile("url"));

		//Close the Login popups
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
	}
	@AfterMethod
	public void BrowserClose() 
	{
		//Closing the Browser
		driver.quit();
	}

}
