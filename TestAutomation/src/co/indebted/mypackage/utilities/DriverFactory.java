package co.indebted.mypackage.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	public static WebDriver open(String browserType) {
		
		switch (browserType) {
		
			case "firefox":{
				//set up Firefox driver
				System.setProperty("webdriver.gecko.driver", "//Users//davidchen//Documents//Selenium//geckodriver");
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette",true);
				return new FirefoxDriver();
			}
			
			case "chrome":{
				//set up Chrome driver
				System.setProperty("webdriver.chrome.driver", "//Users//davidchen//Documents//Selenium//chromedriver");
				return new ChromeDriver();
			}
			
			case "ie":{
				//setup IE driver
				System.setProperty("webdriver.ie.driver", "//Users//davidchen//Documents//Selenium//IEDriverServer.exe");
				return new InternetExplorerDriver();
			}
			
			case "safari":{
				//setup Safari driver
				return new SafariDriver();
			}
			
			default:{
				return new FirefoxDriver();
			}
		}
		
	}
	
}
