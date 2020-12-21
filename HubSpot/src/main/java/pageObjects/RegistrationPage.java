package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	
	public WebDriver driver;

	By firstNmae = By.xpath("//input[contains(@id,'firstname-8c4a85f3-f3bb-4881-a8f8-b58ac0b36049')]");
	By lastName = By.xpath("//input[contains(@id,'lastname-8c4a85f3-f3bb-4881-a8f8-b58ac0b36049')]");
	By email = By.xpath("//input[contains(@id,'email-8c4a85f3-f3bb-4881-a8f8-b58ac0b36049')]");
	By phone = By.xpath("//input[contains(@id,'phone-8c4a85f3-f3bb-4881-a8f8-b58ac0b36049')]");
	By company = By.xpath("//input[contains(@id,'company-8c4a85f3-f3bb-4881-a8f8-b58ac0b36049')]");
	By website = By.xpath("//input[contains(@id,'website-8c4a85f3-f3bb-4881-a8f8-b58ac0b36049')]");
	By noemployees = By.xpath("//select[contains(@id,'employees__c-8c4a85f3-f3bb-4881-a8f8-b58ac0b36049')]");
	By submit = By.xpath("//input[@type='submit']");
	
	
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}


public WebElement getFirstName()
{
  return driver.findElement(firstNmae);
	
	
}
public WebElement getlastName()
{

	return driver.findElement(lastName);
	
	
}
public WebElement getemail()
{

	return driver.findElement(email);
	
	
}
public WebElement getphone()
{

	return driver.findElement(phone);
	
	
}
public WebElement getcompany()
{

	return driver.findElement(company);
	
	
}
public WebElement getwebsite()
{

	return driver.findElement(website);
	
	
}

public void getEmployees()
{
	
WebElement noOfEmployees=driver.findElement(noemployees);
Select select =new Select(noOfEmployees);
select.selectByValue("201 to 1,000");

}

public WebElement clickOnSubmit()
{
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(submit));

	
	return driver.findElement(submit);
//    WebDriverWait wait = new WebDriverWait(driver, 10);

	//WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(submit));
	//return driver.findElement(submit);
	//return passwordElement;
	
	//WebElement freeRegisteer=driver.findElement(submit);
	
	//WebElement webElement = driver.findElement(noemployees);//You can use xpath, ID or name whatever you like
	//webElement.sendKeys(Keys.TAB);
	//webElement.sendKeys(Keys.ENTER);
	//actions.moveToElement(freeRegisteer).click().perform();
	
	//String s=driver.findElement(submit).getAttribute("type");
	// System.out.println(s);
	//WebDriverWait wait2 = new WebDriverWait(driver, 10);
	//wait2.until(ExpectedConditions.invisibilityOfElementLocated(submit));
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(submit));

	//WebElement element1=driver.findElement(submit);
	//JavascriptExecutor js = (JavascriptExecutor) driver;

	//js.executeAsyncScript("arguments[0].click();",element1);

}
}