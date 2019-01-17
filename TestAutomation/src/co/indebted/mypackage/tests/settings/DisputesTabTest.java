package co.indebted.mypackage.tests.settings;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.explore.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.DisputesTabFactory;
import co.indebted.mypackage.pagefactories.settings.TeamsTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.RandomStringGenerator;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class DisputesTabTest extends TestSetupAndTearDown{
	
	@Test
	public void DisputesTabTests() throws InterruptedException {
				
		//login and navigate to Teams tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		DisputesTabFactory disputesTab = new DisputesTabFactory(driver);
		Disputes dispute = new Disputes(randomStringGenerator.randomString(5), randomStringGenerator.randomString(5));
		
		//assertions
		//test 1
		try {		
			disputesTab.getDisputesTab().click();
			disputesTab.getNewDisputeReasonButton().click();
			Thread.sleep(500);
			disputesTab.getDisputeReasonName().sendKeys(dispute.disputeReasonName);
			disputesTab.getDisputeReasonDescription().sendKeys(dispute.disputeReasonDescription);
			Thread.sleep(500);
			disputesTab.getSaveNewDisputeReasonButton().click();
			Assert.assertEquals(disputesTab.getNewDisputeReasonName().getText(), dispute.disputeReasonName);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New dispute reason is not found");
		    throw ex;
		}
		
		//test 1
		try {		
			disputesTab.getNewDisputeReasonEditButton().click();
			disputesTab.getDisputeReasonName().sendKeys("-update");
			disputesTab.getDisputeReasonDescription().sendKeys("-update");
			Thread.sleep(500);
			disputesTab.getSaveNewDisputeReasonButton().click();
			Assert.assertEquals(disputesTab.getNewDisputeReasonName().getText(), dispute.disputeReasonName + "-update");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
		System.out.println("Error: Update dispute reason failed");
		throw ex;
		}		
	}
	
	
	//teams constructor
	public class Disputes{
		public String disputeReasonName;
		public String disputeReasonDescription;
		public Disputes(String name, String description) {
			disputeReasonName = name;
			disputeReasonDescription = description;
		}
	}
}
