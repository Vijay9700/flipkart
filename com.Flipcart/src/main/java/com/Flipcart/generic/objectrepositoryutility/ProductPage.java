package com.Flipcart.generic.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	public ProductPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='_3zQntF'])[1]/p")
	private WebElement productDescription;
	
	public WebElement getProductDescription() {
		return productDescription;
	}


}
