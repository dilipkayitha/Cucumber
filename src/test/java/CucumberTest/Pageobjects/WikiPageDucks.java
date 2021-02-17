package CucumberTest.Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiPageDucks {

	
	WebDriver driver;
	
	By heading = By.id("firstHeading");  //Title of the wiki page
	
	public WikiPageDucks(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement VerifyHeading() {
		
		return driver.findElement(heading);
		
	}
	
}
