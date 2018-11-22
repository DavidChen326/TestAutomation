package co.indebted.mypackage.tests.settings;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.ComplianceTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class ComplianceTabTest extends TestSetupAndTearDown{
	
	@Test
	public void ComplianceTabTests() throws InterruptedException {
				
		//login and navigate to Compliance tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		ComplianceTabFactory complianceTab = new ComplianceTabFactory(driver);
		Compliance newCompliance = new Compliance("Test Scheme10");
		boolean complianceExist = false;
		
		//assertions
		//test 1
		try {		
			complianceTab.getComplianceTab().click();
			complianceTab.getNewComplianceButton().click();
			complianceTab.getcomplianceNameTextBox().sendKeys(newCompliance.complianceName);
			complianceTab.getMaxInSpreadNumberTextBox().clear();
			complianceTab.getMaxInSpreadNumberTextBox().sendKeys("6");
			complianceTab.getMaxInSpreadDaysTextBox().clear();
			complianceTab.getMaxInSpreadDaysTextBox().sendKeys("6");
			complianceTab.getMaxPerWeekTextBox().clear();
			complianceTab.getMaxPerWeekTextBox().sendKeys("3");
			complianceTab.getMaxPerMonthTextBox().clear();
			complianceTab.getMaxPerMonthTextBox().sendKeys("10");
			complianceTab.getDefaultBumpTimeHourTextBox().clear();
			complianceTab.getDefaultBumpTimeHourTextBox().sendKeys("23");
			complianceTab.getDefaultBumpTimeMinTextBox().clear();
			complianceTab.getDefaultBumpTimeMinTextBox().sendKeys("59");
			complianceTab.getDefaultBumpTimeSecTextBox().clear();
			complianceTab.getDefaultBumpTimeSecTextBox().sendKeys("59");
			complianceTab.getTODblock15().click();
			complianceTab.getTODblock39().click();
			
			Assert.assertEquals(complianceTab.getBlockersLabel().getText(), "Select on the bar to block out particular times(24 hour format) for everyday.");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Label for TOD is incorrect");
		    throw ex;
		}
		
		//test 2
		try {		
			complianceTab.getDOWbutton().click();
			complianceTab.getDOWMondayBlock15().click();
			complianceTab.getDOWMondayBlock39().click();
			complianceTab.getDOWWednesdayBlock15().click();
			complianceTab.getDOWWednesdayBlock39().click();
			
			Assert.assertEquals(complianceTab.getBlockersLabel().getText(), "Select times that you want to block for the particular days of the week.");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Label for DOW is incorrect");
		    throw ex;
		}
		
		//test 3
		try {		
			complianceTab.getDOMbutton().click();
			complianceTab.getDOMBlock().click();
			complianceTab.getDOMBlock15().click();
			complianceTab.getDOMBlock39().click();
			complianceTab.getSaveComplianceButton().click();
			
			
			Assert.assertEquals(complianceTab.getBlockersLabel().getText(), "Select day(s) from Calendar and add time period to block date(s)");
			for(WebElement c: complianceTab.getComplianceList()) {
				if(c.getText().contains(newCompliance.complianceName)) {
					complianceExist = true;
				}
			}
			Assert.assertEquals(complianceExist,true);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New compliance scheme is not found");
		    throw ex;
		}
	}
	
	//compliance constructor
	public class Compliance{
		public String complianceName;
		
		public Compliance(String name) {
			complianceName = name;
		}
	}
}
