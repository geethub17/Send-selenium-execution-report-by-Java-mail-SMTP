package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class SearchInGoogle {
		
	@When("^searched for \"([^\"]*)\"$")
	public void searched_for(String arg1) {
		
		LaunchGoogle.driver.findElement(By.id("lst-ib")).sendKeys(arg1);
		LaunchGoogle.driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
	    
	}

}
