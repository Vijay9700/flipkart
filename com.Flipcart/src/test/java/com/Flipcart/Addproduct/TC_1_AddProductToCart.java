package com.Flipcart.Addproduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Flipcart.generic.basetest.BaseClass;
import com.Flipcart.generic.objectrepositoryutility.WelcomePage;

public class TC_1_AddProductToCart extends BaseClass
{

	@Test
	public void addProductToCart() throws Throwable 
	{
		WelcomePage welcompg= new WelcomePage(driver);
		wlib.waitForPageToLoad(driver);
		
		/* read testScript data from Excel file*/
		String productName = elib.getDataFromExcel("product", 6, 1);
		wlib.waitForPageToLoad(driver);
		
		// Step:1 Enter the Search item
		WelcomePage welcomePg=new WelcomePage(driver);
		welcomePg.getSearchTextField().sendKeys(productName);
	    
		//Step:2 Click on Search Button
		welcomePg.getSearchButton().click();
		
		
	}
}
