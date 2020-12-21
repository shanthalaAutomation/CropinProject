package Cropin;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.GetStartedPage;
import pageObjects.LandingPage;
import pageObjects.RegistrationPage;
import resources.Base;

public class HomePage extends Base{
	
	@BeforeTest
	
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
			
	}

	
	@Test(dataProvider="getData")
public void homePageNavigation(String fn, String ln, String email,String mobile, String comp, String website) throws IOException
	
	{
		//Reach the Get Hubspot free section of the website
		LandingPage l=new LandingPage(driver);
		l.getFreeHubSpot().click();
		
		//Scroll to CMS Hub
		GetStartedPage gs =new GetStartedPage(driver);
		gs.scrollToCms();
		
		//ValidatePremium features
		gs.validatePremiumFeatures();
		//Click on Get a demo
		gs.clickOnGetaDemo();
		
		//Register To free demo
		RegistrationPage rp=new RegistrationPage(driver);
		rp.getFirstName().sendKeys(fn);
		rp.getlastName().sendKeys(ln);
		rp.getemail().sendKeys(email);
		rp.getphone().sendKeys(mobile);
		rp.getcompany().sendKeys(comp);
		rp.getwebsite().sendKeys(website);
		rp.getEmployees();
		//rp.clickOnSubmit().click();
		
		
		
		
	}
	
	@DataProvider
	public Object[][] getData()
			{
		Object[][] data= new Object[1][6];
		data[0][0]="abc";
		data[0][1]="def";
		data[0][2]="shanaha39@gmail.com";
		data[0][3]="6361862930";
		data[0][4]="google";
		data[0][5]="www.google.com";
		
		return data;
		
			}
	@AfterTest
	
	public void closeBrowser()
	{
	driver.close();
	}
}
