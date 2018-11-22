package co.indebted.mypackage.tests.settings;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.SettingsPageFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class SettingsTest extends TestSetupAndTearDown{
	
	@Test
	public void SettingsTests() throws InterruptedException {
				
		//login and navigate to Settings page
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		SettingsPageFactory settingsPage = new SettingsPageFactory(driver);
		
		String title = settingsPage.getTitle();
		
		//assertions
		//test 1
		try {
			Assert.assertEquals(title, "Admin Settings • InDebted");
		}
		catch(AssertionError ex){
			System.out.println("Error: Page title doesn't match");
		    throw ex;
		}

		//test 2
		try {
			Assert.assertEquals(settingsPage.getGeneralTab().isDisplayed(), true);
		}
		catch(AssertionError ex){
			System.out.println("Error: General Tab not found");
		    throw ex;
		}
		
		//test 3
		try {
			Assert.assertEquals(settingsPage.getComplianceTab().isDisplayed(), true);
		}
		catch(AssertionError ex){
			System.out.println("Error: Compliance Tab not found");
		    throw ex;
		}
		
		//test 4
		try {
			Assert.assertEquals(settingsPage.getPermisionsTab().isDisplayed(), true);
		}
		catch(AssertionError ex){
			System.out.println("Error: Permisions Tab not found");
		    throw ex;
		}
		
		//test 5
		try {
			Assert.assertEquals(settingsPage.getUsersTab().isDisplayed(), true);
		}
		catch(AssertionError ex){
			System.out.println("Error: Users Tab not found");
		    throw ex;
		}
		
	}
}
