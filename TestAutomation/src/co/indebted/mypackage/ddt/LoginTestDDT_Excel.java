package co.indebted.mypackage.ddt;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.ExplorePageFactory;
import co.indebted.mypackage.utilities.LoginFactory;

public class LoginTestDDT_Excel {

	WebDriver driver;
	String email;
	String password;
	
	@BeforeMethod
	public void setUp () {
		System.out.println("Login test started...");
		String browserType = "firefox";
		driver = co.indebted.mypackage.utilities.DriverFactory.open(browserType);
	}
	
	@Test(dataProvider = "getData")
	public void loginTest() {
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		
		//assertions
		String title = explorePage.getTitle();
		try {
			Assert.assertEquals(title, "Explore • InDebted");
		}
		catch(AssertionError ex){
		    throw ex;
		}
	}
	
	@AfterMethod
	public void closeDown () {
		driver.close();
		System.out.println("Test completed");
	}
	
	@DataProvider
	public String[][] getData(){
		return co.indebted.mypackage.utilities.Excel.get("/Users/davidchen/Documents/Selenium/DDT/LoginTestDDT.xlsx");
	}
}
