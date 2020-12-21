package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetStartedPage {

public WebDriver driver;
	
	By cmsHub=By.xpath("//p[contains(.,'CMS Hub')]");
	By seeFeatures=By.xpath("//*[@class='get-started-cards-variant__accordion-button-show getstarted-seefeatures-cms']");
	By premiumFeatures=By.xpath("//*[@class='get-started-cards-variant__features-primary']");
	By getAdemo=By.xpath("//*[@class='cta--primary cta--small get-started-cards-variant__card--primary-link launch-modal getstarted-cmsdemo']");
	

	
	
	public GetStartedPage(WebDriver driver) {
		this.driver=driver;
		
}
	
	public void scrollToCms()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(cmsHub));
	}
	
	public void validatePremiumFeatures()
	{


		driver.findElement(seeFeatures).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.findElement(premiumFeatures).isEnabled());
		Boolean text=driver.findElement(premiumFeatures).isEnabled();
		if(text)
		{
			System.out.println("Premium Features are displayed");
		}
		else
		{
			System.out.println("Premium Features are not displayed");
		}
	}
public void clickOnGetaDemo()
{
	 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(getAdemo));
	driver.findElement(getAdemo).click();
	
	}
}
