package com.Flipcart.generic.objectrepositoryutility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
	

	public WelcomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	private WebElement searchTextField;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchButton;
	
	
	
	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	

	
	
	
	
	
	
}
