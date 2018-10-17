package co.indebted.mypackage.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.ExplorePageFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndCloseDown;

public class LoginTest extends TestSetupAndCloseDown{

	@Test
	public void loginTestPOM() {
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		
		//assertions
		String title = explorePage.getTitle();
		try {
			Assert.assertEquals(title, "Explore • InDebted");
		}
		catch(AssertionError ex){
			System.out.println("Error: Explore • InDebted is not found");
		    throw ex;
		}
	}
}
