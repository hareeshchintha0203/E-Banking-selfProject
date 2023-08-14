package com.eBanking.testCases;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.eBanking.Utilities.ReadConfig;

import freemarker.log.Logger;

public class BaseClass {
	
	ReadConfig rc = new ReadConfig();
	
	
	public static WebDriver driver;
	
	public String BaseURL = rc.getApplicationUrl();
	
	public String username = rc.getUsername();
	
	public String password = rc.getPassword();
	
	public static Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
	
	}
	
/**
	@AfterClass
	public void setDown() {
		driver.quit();
	}

	**/
	public void captureScreenshot(WebDriver driver, String tname) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname+ ".png");
		 FileUtils.copyFile(source, target);
		 System.out.println("Screenshot Taken");
		 
	}
	
	public static String randomString()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(10);
		return generatedString;
	}
	
	public static String randomNum()
	{
		String generatedNum = RandomStringUtils.randomNumeric(4);
		return generatedNum;
	}
	
	
	

}
