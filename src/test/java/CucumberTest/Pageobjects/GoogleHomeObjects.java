package CucumberTest.Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomeObjects {

	WebDriver driver;
	
	public GoogleHomeObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	By searchbar = By.name("q");  // search bar element
	By wikilink = By.xpath("//span[contains(text(),'Duck - Wikipedia')]");   //Wikipedia link for ducks 
	
	public WebElement Searchducks() {
		
		return driver.findElement(searchbar);
		
	}
	
	public WebElement Wlink() {
		
		return driver.findElement(wikilink);
	}
	
	
}
