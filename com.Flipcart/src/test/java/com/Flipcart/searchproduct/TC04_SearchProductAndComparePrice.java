package com.Flipcart.searchproduct;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Flipcart.generic.basetest.BaseClass;
import com.Flipcart.generic.objectrepositoryutility.ProductCategoryPage;
import com.Flipcart.generic.objectrepositoryutility.WelcomePage;

public class TC04_SearchProductAndComparePrice extends BaseClass
{
	@Test
	public void searchProductAndComparePrice()
	{
		WelcomePage welcomePg=new WelcomePage(driver);
		ProductCategoryPage ProductCpg=new ProductCategoryPage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//enter the Search item
		welcomePg.getSearchTextField().sendKeys("TravelBags");

		//Click on Search Button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		//count of item
//		int count = welcomePg.getSearchItem_price().size();
//		System.out.println("count of items: "+count);
//		System.out.println("=======");
//		
//		//fetch the  item and print
//		for (int i = 0; i < count; i++)
//		{
//			String name1 =  welcomePg.getSearchItem_price().get(i).getText();
//			String name2 =  welcomePg.getSearchItem_Discountprice().get(i).getText();
//			
//			System.out.println(+i+">Actualprice:"+name2+"  Discountprice :"+name1);
//		}
//		
	}

}
