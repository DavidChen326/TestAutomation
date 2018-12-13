package co.indebted.mypackage.tests.settings;

import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.explore.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.InboxTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class InboxTabTest extends TestSetupAndTearDown{
	
	@Test
	public void InboxTabTests() throws InterruptedException {
				
		//login and navigate to Inbox tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		InboxTabFactory inboxTab = new InboxTabFactory(driver);
		
		//assertions
		//test 1
		try {
			inboxTab.getInboxTab();
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: ");
		    throw ex;
		}
	}
}
