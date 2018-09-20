package com.apollohs.test;

import org.testng.annotations.Test;

import com.apollohs.generic.BaseTest;
import com.apollohs.page.Kids_BoysFootWear_CasualShoes_page;

public class Kids_BoysFootWear_CasualShoes extends BaseTest {
	@Test(priority=1,groups= {"Kids","Regression"})
	public void testKids_BoysFootWear_Casualshoes() throws InterruptedException {
		Kids_BoysFootWear_CasualShoes_page kbf=new Kids_BoysFootWear_CasualShoes_page(driver);
		kbf.moveToKids(driver);
		Thread.sleep(1000);
		kbf.clickOnCasualShoes();
		Thread.sleep(25000);
		kbf.clickOnNike(driver);
		Thread.sleep(1000);
		kbf.moveToThumbnails(driver);
		
		
		
	}
	

	
	
	
	
	

}
