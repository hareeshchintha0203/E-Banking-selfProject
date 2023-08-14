package com.eBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.eBanking.PageObjects.LoginPage;
import com.eBanking.Utilities.XLUtilities;

public class TC_LoginDDT_002 extends BaseClass {
	
	
	
	//public void LoginDDT(String username, String password) 
	@Test (dataProvider = "loginData")
	public void LoginDDT(String username, String password){
		
		LoginPage lp = new LoginPage(driver);
		driver.get(BaseURL);
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		
		if(isAlertPresent() ==  true )
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(true);		
		}
		else
		{
			Assert.assertTrue(true);
			lp.clickOnLogout();
			driver.switchTo().alert().accept(); //close the logout alreat
			driver.switchTo().defaultContent();
		}
		
		
		lp.clickOnLogout();
		
		driver.switchTo().alert().accept();
		
	}
	
	
	//user defined method to check alert is present or not
	
	public Boolean isAlertPresent() {
		try
		{
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e){
			return false;
			
		}
	}
	@DataProvider(name = "loginData")
	String[][] getData() throws Exception
	{
		String path = System.getProperty("user.dir") + "//src//test//java//com/eBanking/testData//LoginData.xlsx";
		
		int rownum = XLUtilities.getRowCount(path, "Sheet1");
		
		int colcount = XLUtilities.getCellCount(path, "Sheet1",0 );
		
		String Logindata[][] = new String [rownum] [colcount];
		
		for (int i = 1; i<= rownum; i++)
		{
			for (int j = 0; j<colcount; j++)
			{
				Logindata[i-1][j] = XLUtilities.getCellData(path, "Sheet1", i, j);
			}
		}
		return Logindata;
	
		
	}

}
