package com.Flipcart.searchproduct;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Flipcart.generic.basetest.BaseClass;
import com.Flipcart.generic.listenerimplementation.ListenerImplementation;
import com.Flipcart.generic.objectrepositoryutility.ProductCategoryPage;
import com.Flipcart.generic.objectrepositoryutility.WelcomePage;
import com.aventstack.extentreports.Status;
@Listeners(com.Flipcart.generic.listenerimplementation.ListenerImplementation.class)
public class TC01_SearchProductAndPrintDetails extends BaseClass
{

	@Test
	public  void searchProductByName() throws Throwable 
	{
		/* read testScript data from Excel file*/
		String productName = elib.getDataFromExcel("product", 7, 1);
		wlib.waitForPageToLoad(driver);
		ListenerImplementation.test.log(Status.INFO, "Test CAse Started");
		
		// Step:1 Enter the Search item
		WelcomePage welcomePg=new WelcomePage(driver);
		
		welcomePg.getSearchTextField().sendKeys(productName);
		ListenerImplementation.test.log(Status.INFO, " Search Product Entered ");
		
		//Step:2 Click on Search Button
		welcomePg.getSearchButton().click();
		Thread.sleep(2000);

		//Step:3 print  First Product Details
	    ProductCategoryPage productCtpg=new ProductCategoryPage(driver);
	    productCtpg.printProductDetails();
	    ListenerImplementation.test.log(Status.INFO, "Printed first PRoduct Details Sucessfully");
	    
	    
	    ListenerImplementation.test.log(Status.INFO, "Test CAse End");
	}
}
