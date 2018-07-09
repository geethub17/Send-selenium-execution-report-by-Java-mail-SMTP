package Main;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)

@CucumberOptions(features="FeatureFiles",glue={"Stepdefination"},tags={"@All"},
plugin = { "pretty", "json:target/cucumber-reports/cucumber.json" },
monochrome = true
)

public class Runner{
	
@AfterClass
public static void SendingMail() throws AddressException, IOException, MessagingException{
	
	Runtime r=Runtime.getRuntime();  	  
	r.addShutdownHook(new Thread(){  
	public void run(){  
		Mailing sm = new Mailing();
		try {
			sm.mail();
			System.out.println("Report has been sent"); 
		} catch (IOException | MessagingException e) {
			e.printStackTrace();
		}
		
	    }  
	}  
	);  
	try{Thread.sleep(5000);}catch (Exception e) 
	{
		System.out.println(e);
	}  
	
	
	}
}