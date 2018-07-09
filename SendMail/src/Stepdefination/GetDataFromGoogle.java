package Stepdefination;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;




import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.java.en.When;

public class GetDataFromGoogle {
	
	@When("^capture the screenshot od today weather$")
	public void capture_the_screenshot_od_today_weather() throws IOException{
		try{
		
		File scrn = ((TakesScreenshot)LaunchGoogle.driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrn, new File("Screenshots/"+"Image.png")); 
	    LaunchGoogle.driver.quit();
		}catch(Exception e){
			System.out.println(e);
		}
		

	}

}
