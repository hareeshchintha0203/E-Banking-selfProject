package com.eBanking.testCases;

import org.testng.annotations.Test;

import com.eBanking.PageObjects.AddCustomerPage;
import com.eBanking.PageObjects.LoginPage;

public class TC_CreateNewCustomer_003 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws Exception {
		driver.get(BaseURL);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage acp = new AddCustomerPage(driver);
	
		acp.clickonAddNewCustomer();
		
		acp.custName("hahaha");
		
		acp.custMaleGenderBtn();
		acp.custDob("06","20","1988");
		Thread.sleep(2000);
		acp.custAddress("India");
		acp.custCity("Bangalore");
		acp.custState("KA");
		
		acp.custTelePhone("445184");
		
		String email= randomString()+"gmail.com";
		acp.custMail(email);
		acp.cSubbmit();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
