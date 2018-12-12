package co.indebted.mypackage.ddt;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import co.indebted.mypackage.pagefactories.explore.ExplorePageFactory;
import co.indebted.mypackage.utilities.LoginFactory;

@RunWith(value = Parameterized.class)
public class LoginTestDDT_CSV {

	WebDriver driver;
	String email;
	String password;
	
	@Before
	public void setUp () {
		System.out.println("Login test started...");
		String browserType = "firefox";
		driver = co.indebted.mypackage.utilities.DriverFactory.open(browserType);
	}
	
	@Test
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
	
	@After
	public void closeDown () {
		driver.close();
		System.out.println("Test is completed");
	}
	
	//pass parameters into test method via constractor
	@Parameters
	public static List<String[]> getData(){
		return co.indebted.mypackage.utilities.CSV.get("/Users/davidchen/Documents/Selenium/DDT/LoginTestDDT.csv");
	}
	
	//constructor
	public LoginTestDDT_CSV(String email, String password) {
		this.email = email;
		this.password = password;
	}
}
