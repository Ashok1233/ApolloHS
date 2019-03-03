package com.apollohs.test;

import org.testng.annotations.Test;

import com.apollohs.generic.BaseTest;
import com.apollohs.page.Men_ActiveTshirts_Page;

public class ActiveTshirts extends BaseTest {
	@Test(priority=1,groups= {"Men","ActiveTshirts"})
	public void testActiveTshirts1() throws InterruptedException {
		Men_ActiveTshirts_Page ap=new Men_ActiveTshirts_Page(driver);
		ap.actionMenu1(driver);
		
		ap.clickOnActiveTshirts1();
		
		ap.clickOnHrithikRoshan1();
		
		ap.clickOnsize1();
		
		
		ap.clicnkOnAddtoCart1();
		
		Thread.sleep(1000);
		
		ap.clickOnGotocart1();
		
		Thread.sleep(3000);
		
		ap.clickOnPlaceOrder1();
		
		
		System.out.println("Hi Ashok pull it to Eclipse now")
		
		
		
		
	}

}
