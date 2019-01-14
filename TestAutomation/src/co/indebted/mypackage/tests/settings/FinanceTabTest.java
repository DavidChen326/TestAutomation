package co.indebted.mypackage.tests.settings;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.explore.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.DebtsTabFactory;
import co.indebted.mypackage.pagefactories.settings.FinanceTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.RandomStringGenerator;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class FinanceTabTest extends TestSetupAndTearDown{
	
	@Test
	public void FinanceTabTests() throws InterruptedException {
				
		//login and navigate to Debts tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
		
		FinanceTabFactory financeTab = new FinanceTabFactory(driver);
		Finance finance = new Finance(randomStringGenerator.randomString(5), randomStringGenerator.randomString(5));
		
		//assertions
		//test 1
		try {
			String acknowledgementTerms = finance.acknowledgementTerms;
			
			financeTab.getFinanceTab();
			financeTab.getTermsTextBox().sendKeys(acknowledgementTerms);
			financeTab.getMinimumAmount().sendKeys("6");
			financeTab.getWeekly().click();
			financeTab.getFortnightly().click();
			financeTab.getQuarterly().click();
			financeTab.getSaveButton().click();
			driver.navigate().refresh();
			Assert.assertEquals(financeTab.getMinimumAmount().getText(), "6");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New acknowledgement terms and minimum amount are not saved");
		    throw ex;
		}
	}
	
	//debts constructor
		public class Finance{
			public String acknowledgementTerms;
			public String minimumAmount;
			public Finance (String terms, String minAmount) {
				acknowledgementTerms = terms;
				minimumAmount = minAmount;
			}
		}
}
