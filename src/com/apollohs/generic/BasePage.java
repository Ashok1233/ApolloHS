package com.apollohs.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	//Synchronization common methods
	public static void clickOn(WebDriver driver,WebElement locator,int timeout) {
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	//JavascriptExecjutor common methods
	public static void scrollIntoView(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);" ,element);
		
	}
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	public static String getTitleByJs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		String title = js.executeScript("return document.title;" ).toString();
		return title;
 	}
	public static void clickElementByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
	}
	public static void drawBorder(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3pxsolid red'", element);
	}
	//Actions class common methods
	
	public static void moveToAction(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		
	}
	public static void doubleClickonElement(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();
		
	}
	public static void dragAndDroptoElement(WebDriver driver,WebElement source,WebElement target)
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
	public static void clickContextClick(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
		
	}
	public static void clickCompositeActions(WebDriver driver,WebElement element) {
		Actions action=new Actions(driver);
		action.sendKeys().click(element).perform();
		
	}
	//select class common methods
	public static void clickOnDropDownListWebElement(WebDriver driver,WebElement element ,String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
		
	}
	public static void clickOnDropDownListWebElementID(WebDriver driver,WebElement element ,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
		
	}
	public static void clickOnDropDownListWebElementText(WebDriver driver,WebElement element ,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		
	}
	public static void deSelectOnDropDownListWebElement(WebDriver driver,WebElement element ,String value) {
		Select sel=new Select(element);
		sel.deselectByValue(value);
		
	}
	public static void deSelectOnDropDownListWebElementID(WebDriver driver,WebElement element ,int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
		
	}
	public static void deSelectOnDropDownListWebElementText(WebDriver driver,WebElement element ,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		
	}
	
	//Popups common methods
	
	
	
	
	

}
