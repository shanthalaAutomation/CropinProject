package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By freeHubspot=By.xpath("//*[@class='homepage-hero-convert cta--primary cta--large homepage-hero-cta']");

	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getFreeHubSpot()
	{
		return driver.findElement(freeHubspot);
	}
}
