package co.indebted.mypackage.tests.settings;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.UsersTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class UsersTabTest extends TestSetupAndTearDown{
	
	@Test
	public void PermissionsTabTests() throws InterruptedException {
				
		//login and navigate to Compliance tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		UsersTabFactory usersTab = new UsersTabFactory(driver);
		
		//assertions
		//test 1
		try {		
			usersTab.getUsersTab().click();
			Thread.sleep(500);
			usersTab.getUsersSearchBox().sendKeys("Roob");
			
			Assert.assertEquals(usersTab.getFirstUserName().getText(), "Clovis Roob");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New role is not found");
		    throw ex;
		}
	}
}
