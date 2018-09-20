package com.apollohs.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollohs.generic.BasePage;

public class HomeAndLivind_HouseThis_Page extends BasePage {
	//Declaration
	@FindBy(xpath="(//a[contains(.,'Home & Living')])[1]")
	private WebElement homeLiving;
	
	@FindBy(xpath="//a[.='House This']")
	private WebElement houseThis;
	
	@FindBy(xpath="//img[@alt='House This Purple Printed 210 TC Fine Cotton Double King Bedsheet with 4 Pillow Covers']")
	private WebElement sBsHouseThis;
	
	@FindBy(xpath="//span[@class='pdp-offers-moreOffersButton']")
	private WebElement clickforBPrice;
	
	@FindBy(xpath="//button[.='ADD TO CART']")
	private WebElement addTocart;
	
	@FindBy(xpath="//span[.='GO TO CART']")
	private WebElement goTocart;
	
	//initialization
	
	public  HomeAndLivind_HouseThis_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//Utilization
	
	public void homeLiving1(WebDriver driver) {
		Actions action =new Actions(driver);
		action.moveToElement(homeLiving).perform();
		
		
	}
	public void clickOnhouseThis1() {
		houseThis.click();
	}
	public void clickOnsBsHousethis1(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//img[@alt='House This Purple Printed 210 TC Fine Cotton Double King Bedsheet with 4 Pillow Covers']"));
		scrollIntoView(element,driver);

		sBsHouseThis.click();
		
		
	}
	public void clickOnBPrice1() {
		clickforBPrice.click();
		
		
	}
	public void clickOnAddtoCart1() {
		addTocart.click();
	}
	public void clickOnGotocart() {
		goTocart.click();
		
	}
	
	

}
