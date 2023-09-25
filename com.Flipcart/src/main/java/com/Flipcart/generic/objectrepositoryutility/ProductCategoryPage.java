package com.Flipcart.generic.objectrepositoryutility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCategoryPage {

	public ProductCategoryPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath  = "(//select)[1]")
	private WebElement MinimumPriceDRopdown;

	@FindBy(xpath =   "(//select)[2]")
	private WebElement MaximumPriceDRopdown;

	@FindBy(xpath = "(//div[@class='_4rR01T'])[1]")
	private WebElement firstSearchItem_name;

	@FindBy(xpath = "(//div[@class='_30jeq3 _1_WHN1'])[1]")
	private WebElement firstsearchItem_Discountprice;

	@FindBy(xpath = "(//div[@class='_3I9_wc _27UcVY'])[1]")
	private  WebElement firstSearchItem_Actualprice;

	@FindBy(xpath = "(//div[@class='_3Ay6Sb'])[1]/span")
	private  WebElement firstSearchItem_DicountPercentage;

	@FindBy(xpath = "//div[@class='_4rR01T']")
	private List<WebElement> searchItem_name;

	@FindBy(xpath = "//div[@class='_30jeq3 _1_WHN1']")
	private List<WebElement> searchItem_price;

	@FindBy(xpath = "//div[@class='_3I9_wc _27UcVY']")
	private List<WebElement> searchItem_Discountprice;

	public void printProductDetails() {
		System.out.println( "Name:"+getFirstSearchItem_name().getText());
		System.out.println( "Actualprice:"+getFirstSearchItem_Actualprice().getText());
		System.out.println( "discountPrice:"+getFirstsearchItem_Discountprice().getText());
		System.out.println( "discountPercentage:"+getfirstSearchItem_DicountPercentage().getText());

	}


	public WebElement getfirstSearchItem_DicountPercentage() {
		return firstSearchItem_DicountPercentage;
	}

	public WebElement getFirstSearchItem_name() {
		return firstSearchItem_name;
	}

	public WebElement getFirstSearchItem_Actualprice() {
		return firstSearchItem_Actualprice;
	}

	public WebElement getFirstsearchItem_Discountprice() {
		return firstsearchItem_Discountprice;
	}
	public List<WebElement> getSearchItem_name() {
		return searchItem_name;
	}

	public List<WebElement> getSearchItem_price() {
		return searchItem_price;
	}

	public List<WebElement> getSearchItem_Discountprice() {
		return searchItem_Discountprice;
	}

	public WebElement getMinimumPriceDRopdown() {
		return MinimumPriceDRopdown;
	}

	public WebElement getMaximumPriceDRopdown() {
		return MaximumPriceDRopdown;
	}

	public void printSearchItemName() {

		int count = searchItem_name.size();
		for (int i = 0; i <count; i++)
		{
			String name = searchItem_name.get(i).getText();
			System.out.println(name);
		}
	}
	public void printSearchItemPrice() {
		int count = searchItem_price.size();
		for (int i = 0; i < count; i++)
		{
			String price = searchItem_price.get(i).getText();
			System.out.println(price);
		}
	}
	public void printSearchItemDiscountprice() {
		int count = searchItem_Discountprice.size();
		for (int i = 0; i <count; i++)
		{
			String price = searchItem_Discountprice.get(i).getText();
			System.out.println(price);
		}
	}
}
