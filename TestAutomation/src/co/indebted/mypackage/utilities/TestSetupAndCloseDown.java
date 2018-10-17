package co.indebted.mypackage.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestSetupAndCloseDown {

	public WebDriver driver;
	
	@BeforeMethod
	public void setUp () {
		System.out.println("Login test started...");
		String browserType = "firefox";
		driver = co.indebted.mypackage.utilities.DriverFactory.open(browserType);
	}
	
	@AfterMethod
	public void closeDown () {
		driver.close();
		System.out.println("Test is completed");
	}
}
