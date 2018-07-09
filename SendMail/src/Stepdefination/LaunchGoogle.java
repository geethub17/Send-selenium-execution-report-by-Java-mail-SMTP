package Stepdefination;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class LaunchGoogle {
	
	static WebDriver driver;
	ChromeOptions options = new ChromeOptions();

	@When("^i opened google browser$")
	public void i_opened_google_browser()  {
		File  file = new File("Driver/chromedriver.exe");
		try{
			System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		}catch(Exception e){
			System.out.println(e);
		}

	}
	
}
