package com.apollohs.test;

import org.testng.annotations.Test;

import com.apollohs.generic.BaseTest;
import com.apollohs.page.HomeAndLivind_HouseThis_Page;

public class HomeAndLivind_HouseThis extends BaseTest {
	@Test(priority=1,groups= {"home&living","housethis"})
	public void testHomeAndLiving_HouseThis() throws InterruptedException {
	HomeAndLivind_HouseThis_Page ht=new HomeAndLivind_HouseThis_Page(driver);
	ht.homeLiving1(driver);
	ht.clickOnhouseThis1();
	Thread.sleep(12000);
	ht.clickOnsBsHousethis1(driver);
	Thread.sleep(2000);
	ht.clickOnBPrice1();
	ht.clickOnAddtoCart1();
	Thread.sleep(2000);
	ht.clickOnGotocart();
	
	
	
		
		
	}
}
