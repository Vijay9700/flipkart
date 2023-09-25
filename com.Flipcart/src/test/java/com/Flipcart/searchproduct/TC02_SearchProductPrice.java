package com.Flipcart.searchproduct;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Flipcart.generic.basetest.BaseClass;
import com.Flipcart.generic.objectrepositoryutility.ProductCategoryPage;
import com.Flipcart.generic.objectrepositoryutility.WelcomePage;
@Listeners(com.Flipcart.generic.listenerimplementation.ListenerImplementation.class)
public class TC02_SearchProductPrice extends BaseClass
{
	@Test
	public  void SearchProductByPrice() throws Throwable 
	{

		/* read testScript data from Excel file*/
		String productName = elib.getDataFromExcel("product", 5, 1);
		wlib.waitForPageToLoad(driver);
		
		//Step:1 Enter the Search item
		WelcomePage welcomePg=new WelcomePage(driver);
		welcomePg.getSearchTextField().sendKeys(productName);

		//Step:2 Click on Search Button
		welcomePg.getSearchButton().click();

		//Step:3 Select Minimum Price
		ProductCategoryPage ProductCpg=new ProductCategoryPage(driver);
		wlib.SelectOption(ProductCpg.getMinimumPriceDRopdown(), 2);
		
		//Step:4 count of item
		System.out.println(ProductCpg.getSearchItem_price().size());

		//Step:5Print the All item price
		ProductCpg.printSearchItemPrice();

		
		


	}

}
