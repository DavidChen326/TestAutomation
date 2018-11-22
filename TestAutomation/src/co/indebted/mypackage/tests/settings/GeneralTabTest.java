package co.indebted.mypackage.tests.settings;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import co.indebted.mypackage.pagefactories.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.GeneralTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class GeneralTabTest extends TestSetupAndTearDown{
	
	@Test
	public void GeneralTabTests() throws InterruptedException {
				
		//login and navigate to General tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		GeneralTabFactory generalTab = new GeneralTabFactory(driver);
		
		//assertions
		//test 1
		try {		
			generalTab.getGeneralTab().click();
			generalTab.getBrandNameTextBox().clear();
			generalTab.getBrandNameTextBox().sendKeys("Indebted.stg");
			generalTab.getCountryDropDown().click();
			generalTab.getCountryOptions().sendKeys("Australia" + Keys.ENTER);
			generalTab.getTimezoneDropDown().click();
			generalTab.getTimezoneOptions().sendKeys("Sydney" + Keys.ENTER);
			generalTab.getBrandColour().click();
			generalTab.getSaveButton().click();
			
			Assert.assertEquals(generalTab.getBrandNameTextBox(), "Indebted.stg");
		}
		catch(AssertionError ex){
			System.out.println("Error: ");
		    throw ex;
		}
		
	}
}
