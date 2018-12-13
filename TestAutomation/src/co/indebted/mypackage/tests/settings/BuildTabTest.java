package co.indebted.mypackage.tests.settings;

import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.explore.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.BuildTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class BuildTabTest extends TestSetupAndTearDown{
	
	@Test
	public void BuildTabTests() throws InterruptedException {
				
		//login and navigate to Build tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		BuildTabFactory buildTab = new BuildTabFactory(driver);
		
		//assertions
		//test 1
		try {
			buildTab.getBuildTab();
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: ");
		    throw ex;
		}
	}
}
