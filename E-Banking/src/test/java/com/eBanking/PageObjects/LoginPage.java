package com.eBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	@FindBy(xpath = "//input[@name='uid']")
	WebElement txtUsername;
	public void setUserName(String uname)
	{
		txtUsername.sendKeys(uname );
	}
	
	
	@FindBy(name="password")
	WebElement txtPassword;
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd );
	}
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	@FindBy(xpath = "/html/body/div[3]/div/ul/li[10]/a")
	WebElement Logout;
	public void clickOnLogout() {
		Logout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
