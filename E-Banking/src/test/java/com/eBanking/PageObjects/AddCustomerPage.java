package com.eBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	public WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='New Customer']")
	WebElement lnkNewCustomer;
	public void clickonAddNewCustomer() {
		lnkNewCustomer.click();
	}
	
	@FindBy(xpath = "(//input[@type=\"text\"])[1]")
	WebElement txtCustomerName;
	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
	}
	
	@FindBy (xpath = "(//input[@name='rad1'])[1]")
	WebElement rdGenderMale;
	public void custMaleGenderBtn() {
		rdGenderMale.click();		
	}
	
	@FindBy(xpath =  "(//input[@name='rad1'])[2]")
	WebElement rdGenderFemale;
	public void custFemaleGenderBtn() {
		rdGenderFemale.click();		
	}
	
	@FindBy (id = "dob")
	WebElement txtDob;
	public void custDob(String mm, String dd, String yyyy) {
		txtDob.sendKeys(mm);
		txtDob.sendKeys(dd);
		txtDob.sendKeys(yyyy);		
	}
	
	@FindBy (xpath = "//textarea[@name='addr']")
	WebElement txtAddress;
	public void custAddress(String address) {
		txtAddress.sendKeys(address);		
	}
	
	@FindBy(name="city")
	WebElement txtCity;
	public void custCity(String city) {
		txtCity.sendKeys(city);
	}
	
	@FindBy(name="state")
	WebElement txtState;
	public void custState(String state) {
		txtState.sendKeys(state);
	}
	
	@FindBy(name="pinno")
	WebElement txtPin;
	public void custPin(String pin) {
		txtPin.sendKeys(String.valueOf(pin));
	}
	
	@FindBy(name="telephoneno")
	WebElement txtTelephone;
	public void custTelePhone(String telephoneno) {
		txtTelephone.sendKeys(telephoneno);
	}
	
	@FindBy(name="emailid")
	WebElement txtEmailID;
	public void custMail(String mail) {
		txtEmailID.sendKeys(mail);
	}
	
	
	@FindBy(name="sub")
	WebElement btnSubmit;
	public void cSubbmit() {
		btnSubmit.click();
	}
	
	
	@FindBy(name="res")
	WebElement btnReset;
	public void cReset() {
		btnReset.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
