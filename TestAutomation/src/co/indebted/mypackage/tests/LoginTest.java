package co.indebted.mypackage.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.ExplorePageFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class LoginTest extends TestSetupAndTearDown{

	@Test
	public void loginTests() {
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		
		//assertions
		String title = explorePage.getTitle();
		try {
			Assert.assertEquals(title, "Explore • InDebted");
		}
		catch(AssertionError ex){
			System.out.println("Error: P{age title doesn't match");
		    throw ex;
		}
	}
}
