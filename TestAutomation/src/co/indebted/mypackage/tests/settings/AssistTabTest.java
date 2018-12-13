package co.indebted.mypackage.tests.settings;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.explore.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.AssistTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.RandomStringGenerator;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class AssistTabTest extends TestSetupAndTearDown{
	
	@Test
	public void AssistTabTests() throws InterruptedException {
				
		//login and navigate to Assist tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
		
		AssistTabFactory assistTab = new AssistTabFactory(driver);
		Hardship hardship = new Hardship(randomStringGenerator.randomString(20));
		HardshipStage hardshipStage = new HardshipStage(randomStringGenerator.randomString(5),randomStringGenerator.randomString(5));
		
		//assertions
		//test 1
		try {
			String hardshipAcknowledgement = hardship.hardshipAcknowledgement;
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
			String hardshipStageName = hardshipStage.hardshipStageName;
			assistTab.getNewHardshipStageButton().click();
			assistTab.getHardshipStageName().sendKeys(hardshipStageName);
			assistTab.getHardshipStageDescription().sendKeys(randomStringGenerator.randomString(5));
			assistTab.getHardshipStateOfStageDropDown();
			Thread.sleep(500);
			assistTab.getHardshipStageSaveButton().click();
			Assert.assertEquals(assistTab.getFirstHardshipStageName(), hardshipStageName);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New hardship stage unsuccessful");
		    throw ex;
		}
		
		//test 3
		try {
			String updatedHardshipStageName = hardshipStage.hardshipStageName;
			assistTab.getFirstHardshipStageEditButton().click();
			assistTab.getHardshipStageName().sendKeys(updatedHardshipStageName);
			assistTab.getHardshipStageDescription().sendKeys(randomStringGenerator.randomString(5));
			Thread.sleep(500);
			assistTab.getHardshipStageSaveButton().click();
			Assert.assertEquals(assistTab.getFirstHardshipStageName(), updatedHardshipStageName);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Update hardship stage unsuccessful");
		    throw ex;
		}
	}
	
	//hardship constructor
	public class Hardship{
		public String hardshipAcknowledgement;
		public Hardship(String acknowledgement) {
				hardshipAcknowledgement = acknowledgement;
		}
	}
	
	//hardship stage constructor
	public class HardshipStage{
		public String hardshipStageName;
		public String hardshipStageDescription;
		public HardshipStage(String name, String description) {
			hardshipStageName = name;
			hardshipStageDescription = description;
		}
	}
}
