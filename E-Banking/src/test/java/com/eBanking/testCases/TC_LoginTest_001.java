package com.eBanking.testCases;  

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eBanking.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test     
	public void LoginTest() throws Exception {
		
		driver.get(BaseURL);
		
		
		LoginPage lp = new LoginPage(driver);
		
		
		lp.setUserName(username);
				
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			System.out.println("Test Passes");		
		}
		else {
			
			captureScreenshot(driver, " LoginTest");
			Assert.assertTrue(false);
			System.out.println("Test Fail");
		}
			
		
	}
	
	
	
}
