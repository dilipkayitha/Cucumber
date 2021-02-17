package StepDefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import CucumberTest.Pageobjects.GoogleHomeObjects;
import CucumberTest.Pageobjects.WikiPageDucks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DucksVerificationStep {	
	
	WebDriver driver=new ChromeDriver();

	     
	    @Given("^Open chrome and launch google$")				
	    public void Enter_ducks_in_search_bar_and_hit_search() throws Throwable							
	    {		
	       
	// driver initialization and opening google
	System.setProperty("WebDriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver.manage().window().maximize();		
	       driver.get("https://www.google.com");		
			GoogleHomeObjects gho = new GoogleHomeObjects(driver);
			
			//search for Ducks 
		gho.Searchducks().sendKeys("Ducks");
		gho.Searchducks().sendKeys(Keys.ENTER);
			
	    }	
	    
	    @When("^search ducks and open wikipage$")					
	    public void search_ducks_and_open_wikipage	() throws Throwable 							
	    {		
	    	GoogleHomeObjects gho = new GoogleHomeObjects(driver);
	    	
	    	//Click on Wikipedia link for DUcks
	    	gho.Wlink().click();
	    	
	    
	    }	
	    
	    @Then("^ducks wiki should open$")					
	    public void ducks_wiki_should_open() throws Throwable 							
	    {    		
	       			
	    	WikiPageDucks wpd = new WikiPageDucks(driver);
	    	
	    	 // capturing Wikipedia page title 
	    	String actualtitle = wpd.VerifyHeading().getText(); 
	    	
	    	//verifying the title to be DUck
	    
	    	assertTrue(actualtitle.contains("Duck"));  
	    	
	    		driver.quit();
	    	
	    		
	    	}
	    }		



