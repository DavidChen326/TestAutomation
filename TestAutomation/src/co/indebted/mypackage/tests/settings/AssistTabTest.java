package co.indebted.mypackage.tests.settings;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.explore.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.AssistTabFactory;
import co.indebted.mypackage.pagefactories.settings.UsersTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.RandomStringGenerator;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class AssistTabTest extends TestSetupAndTearDown{
	
	@Test
	public void AssistTabTests() throws InterruptedException {
				
		//login and navigate to Compliance tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
		
		AssistTabFactory assistTab = new AssistTabFactory(driver);
		Hardship assist = new Hardship(randomStringGenerator.randomString(20));
		
		//assertions
		//test 1
		try {
			String hardshipAcknowledgement = assist.hardshipAcknowledgement;
			assistTab.getAssistTab().click();
			assistTab.getAcknowledgementTextField().clear();
			assistTab.getAcknowledgementTextField().sendKeys(hardshipAcknowledgement);
			Thread.sleep(500);
			assistTab.getAcknowledgementSaveButton().click();
			driver.navigate().refresh();
			Assert.assertEquals(assistTab.getAcknowledgementTextField().getText(), hardshipAcknowledgement);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Hardship acknowledgement not saved");
		    throw ex;
		}
		
		//test 2
		try {
			String hardshipStageName = randomStringGenerator.randomString(5);
			assistTab.getNewHardshipStageButton().click();
			assistTab.getHardshipStageName().sendKeys(hardshipStageName);
			assistTab.getHardshipStageDescription().sendKeys(randomStringGenerator.randomString(5));
			assistTab.getHardshipStateOfStageDropDown();
			Thread.sleep(500);
			assistTab.getAcknowledgementSaveButton().click();
			Assert.assertEquals(assistTab.getFirstHardshipStageName(), hardshipStageName);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New hardship stage unsuccessful");
		    throw ex;
		}
		
		//test 3
		try {
			String updatedHardshipStageName = randomStringGenerator.randomString(5);
			assistTab.getFirstHardshipStageNameEditButton().click();
			assistTab.getHardshipStageName().sendKeys(updatedHardshipStageName);
			assistTab.getHardshipStageDescription().sendKeys(randomStringGenerator.randomString(5));
			Thread.sleep(500);
			assistTab.getAcknowledgementSaveButton().click();
			Assert.assertEquals(assistTab.getFirstHardshipStageName(), updatedHardshipStageName);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Update hardship stage unsuccessful");
		    throw ex;
		}
	}
	
	//user constructor
		public class Hardship{
			public String hardshipAcknowledgement;
			public Hardship(String acknowledgement) {
				hardshipAcknowledgement = acknowledgement;
			}
		}
}
