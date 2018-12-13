package co.indebted.mypackage.tests.settings;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.explore.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.DebtsTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.RandomStringGenerator;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class DebtsTabTest extends TestSetupAndTearDown{
	
	@Test
	public void DebtsTabTests() throws InterruptedException {
				
		//login and navigate to Debts tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
		
		DebtsTabFactory debtsTab = new DebtsTabFactory(driver);
		Debts debt = new Debts(randomStringGenerator.randomString(5), randomStringGenerator.randomString(5));
		CustomProperties customProperty = new CustomProperties (randomStringGenerator.randomString(5), randomStringGenerator.randomString(5));
		
		//assertions
		//test 1
		try {
			debtsTab.getDebtsTab();
			debtsTab.getDefaultInterestRateTextBox().clear();
			debtsTab.getDefaultInterestRateTextBox().sendKeys("6.6");
			debtsTab.getDebtsSaveButton().click();
			driver.navigate().refresh();
			Assert.assertEquals(debtsTab.getDefaultInterestRateTextBox().getText(), "6.6");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New default interest rates not saved");
		    throw ex;
		}
		
		//test 2
		try {
			String debtStageName = debt.debtStageName;
			debtsTab.getNewDebtStageButton().click();
			debtsTab.getDebtStageName().sendKeys(debtStageName);
			debtsTab.getDebtStageDescription().sendKeys(randomStringGenerator.randomString(5));
			debtsTab.getHardshipStateOfStageDropDown();
			Thread.sleep(500);
			debtsTab.getDebtStageSaveButton().click();
			Assert.assertEquals("", debtStageName);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New debt stage not created");
		    throw ex;
		}
		
		//test 3
		try {
			String updatedDebtStageName = debt.debtStageName;
			debtsTab.getFirstDebtStageEditButton().click();
			debtsTab.getDebtStageName().sendKeys(updatedDebtStageName);
			debtsTab.getDebtStageDescription().sendKeys(randomStringGenerator.randomString(5));
			Thread.sleep(500);
			debtsTab.getDebtStageSaveButton().click();
			Assert.assertEquals(debtsTab.getFirstDebtStageName(), updatedDebtStageName);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Update debt stage unsuccessful");
		    throw ex;
		}
		
		//test 4
		try {
			String customPropertyName = customProperty.customPropertyName;
			debtsTab.getNewCustomPropertyButton().click();
			debtsTab.getCustomPropertyName().sendKeys(customPropertyName);
			debtsTab.getCustomPropertyDescription().sendKeys(randomStringGenerator.randomString(5));
			debtsTab.getCustomPropertyTypeDropDown();
			Thread.sleep(500);
			debtsTab.getDebtStageSaveButton().click();
			Assert.assertEquals(debtsTab.getFirstCustomPropertyName().getText(), customPropertyName);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New custom property not created");
		    throw ex;
		}
		
		//test 5
		try {
			String updatedCustomPropertyName = customProperty.customPropertyName;
			debtsTab.getFirstCustomPropertyEditButton().click();
			debtsTab.getCustomPropertyName().sendKeys(updatedCustomPropertyName);
			debtsTab.getCustomPropertyDescription().sendKeys(randomStringGenerator.randomString(5));
			Thread.sleep(500);
			debtsTab.getCustomPropertySaveButton().click();
			Assert.assertEquals(debtsTab.getFirstCustomPropertyName().getText(), updatedCustomPropertyName);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Update custom property unsuccessful");
		    throw ex;
		}
	}
	
	//debts constructor
		public class Debts{
			public String debtStageName;
			public String debtStageDescription;
			public Debts(String name, String description) {
				debtStageName = name;
				debtStageDescription = description;
			}
		}
		
	//custom properties constructor
	public class CustomProperties{
		public String customPropertyName;
		public String customPropertyDescription;
		public CustomProperties(String name, String description) {
			customPropertyName = name;
			customPropertyDescription = description;
		}
	}
}
