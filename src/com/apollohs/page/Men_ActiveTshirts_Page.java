package com.apollohs.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Men_ActiveTshirts_Page {
	//Declaration
	@FindBy(xpath="//a[.='Men']")
	private WebElement actionMenu;
	
	@FindBy(xpath="//a[.='Active T-Shirts']")
	private WebElement clickOnActiveTshirts;
	
	@FindBy(xpath="//img[@alt='HRX by Hrithik Roshan Men Navy Advanced Rapid Dry Round Neck T-shirt']")
	private WebElement clickOnHrithikRoshan;
	
	@FindBy(xpath="//p[.='M']")
	private WebElement clickOnsize;
	
	@FindBy(xpath="//button[.='ADD TO CART']//div")
	private WebElement clicnkOnAddtoCart;
	
	@FindBy(xpath="//span[.='GO TO CART']")
	private WebElement clickOnGotocart;
	
	@FindBy(xpath="//button[.='PLACE ORDER']")
	private WebElement clickOnPlaceOrder;
	
	@FindBy(name="email")
	private WebElement enterEmailID;
	
	@FindBy(name="password")
	private WebElement enterPassword;
	
	@FindBy(xpath="//button[.='Log in']")
	private WebElement clickOnLogin;
	 
	@FindBy(xpath="//button[.='continue']")
	private WebElement clickOnContinue; 
	
	//Initialization
	
	
	public Men_ActiveTshirts_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//Utilization
	
	
	public void actionMenu1(WebDriver driver) {
		Actions action=new Actions( driver);
		action.moveToElement(actionMenu).perform();
		
	}
	public void clickOnActiveTshirts1() {
		clickOnActiveTshirts.click();
		
	}
	public void clickOnHrithikRoshan1() {
		clickOnHrithikRoshan.click();
	}
	public void clickOnsize1() {
		clickOnsize.click();
		
	}
	public void clicnkOnAddtoCart1() {
		
		clicnkOnAddtoCart.click();
		
		
	}
	
	public void clickOnGotocart1() {
		clickOnGotocart.click();
		
	}
	
	public void clickOnPlaceOrder1() {
		clickOnPlaceOrder.click();
	}
	
	public void setEnterEmailID(String email) {
		enterEmailID.sendKeys(email);
		
		
	}
	public void setEnterPassword(String password) {
		 enterPassword.sendKeys(password);
		
	}
	public void clickOnLoginButton() {
		clickOnLogin.click();
	}
	public void clickOnContineButton() {
		clickOnContinue.click();
	}
	
	
	
	
	
	
	
	

}
