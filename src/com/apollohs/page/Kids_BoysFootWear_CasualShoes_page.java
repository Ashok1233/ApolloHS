package com.apollohs.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apollohs.generic.BasePage;

public class Kids_BoysFootWear_CasualShoes_page extends BasePage {
	@FindBy(xpath="//a[.='Kids']")
	private WebElement kids;
	
	@FindBy(xpath="//a[@href='/boys-casual-shoes']")
	private WebElement casualshoes1;
	
	@FindBy(xpath="//img[contains(@alt,'Adidas Originals Kids Black Samba OG J Leather Sneakers')]")
	private WebElement nikeToys;
	
	@FindBy(xpath="(//img[@class='thumbnails-selected-thumbnail thumbnails-thumbnail'])[2]")
    private WebElement thumbNails;
	
	
	public Kids_BoysFootWear_CasualShoes_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void moveToKids(WebDriver driver) {
		moveToAction(driver,kids);
		
	}
	public void clickOnCasualShoes() {
		casualshoes1.click();
	}
	
	public void clickOnNike(WebDriver driver) {
		scrollIntoView(nikeToys,driver);
		nikeToys.click();
		
	}
	
	public void moveToThumbnails(WebDriver driver ) {
		moveToAction(driver,thumbNails);
		
		
	}
	
	
}
