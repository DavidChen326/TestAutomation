package co.indebted.mypackage.tests.settings;

import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.explore.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.ContactsTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class ContactsTabTest extends TestSetupAndTearDown{
	
	@Test
	public void ContactsTabTests() throws InterruptedException {
				
		//login and navigate to Contacts tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		ContactsTabFactory contactsTab = new ContactsTabFactory(driver);
		
		//assertions
		//test 1
		try {
			contactsTab.getContactsTab();
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: ");
		    throw ex;
		}
	}
}
