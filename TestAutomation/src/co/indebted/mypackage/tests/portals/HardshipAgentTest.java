package co.indebted.mypackage.tests.portals;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.HardshipPageFactory;
import co.indebted.mypackage.pagefactories.debts.DebtPageFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class HardshipAgentTest extends TestSetupAndTearDown{

	@Test
	public void hardshipAgentTests() throws InterruptedException {
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		driver.get("https://app.indebted-staging.co/debts/2448");
		DebtPageFactory debtPage = new DebtPageFactory(driver);
		HardshipPageFactory hardshipPage = new HardshipPageFactory(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//assertions
		//test 1
		try {
			debtPage.getApplyHardshipButton().click();
			
			//switch to new tab 
			String oldTab = driver.getWindowHandle();
		    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		    
		    //close old tab only
		    driver.close();
		    
		    //switch focus to new tab
		    newTab.remove(oldTab);
		    driver.switchTo().window(newTab.get(0));

			Assert.assertEquals(hardshipPage.getHardshipFormTitle().getText(), "Financial Hardship Application Form");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New hardship application form not initialised");
		    throw ex;
		}
		
		//test 2
		try {
			hardshipPage.getOccupationTextBox().sendKeys("Engineer");
			hardshipPage.getNumberOfDependentTextBox().sendKeys("1");
			Thread.sleep(500);
			hardshipPage.getNextStepButton().click();
			Assert.assertEquals(hardshipPage.getEmploymentIncomeTextBox().isDisplayed(), true);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Step 1 did not pass");
		    throw ex;
		}
		
		//test 3
		try {
			hardshipPage.getEmploymentIncomeTextBox().clear();
			hardshipPage.getEmploymentIncomeTextBox().sendKeys("100");
			Thread.sleep(500);
	
			//select fortnightly
			hardshipPage.getEmploymentIncomeFrequencyDropDown();
			hardshipPage.getOtherIncomeTextBox().clear();
			hardshipPage.getOtherIncomeTextBox().sendKeys("Cash");
			hardshipPage.getOtherIncomeAmountTextBox().sendKeys("1000");
			Thread.sleep(500);
			
			//select monthly
			hardshipPage.getOtherIncomeFrequencyDropDown();
	
			hardshipPage.getHouseValueTextBox().sendKeys("500000");
			hardshipPage.getVehicleValueTextBox().sendKeys("33000");
			hardshipPage.getSuperValueTextBox().sendKeys("6000");
			hardshipPage.getAccommodationCostTextBox().sendKeys("800");
			Thread.sleep(500);
			
			//select monthly
			hardshipPage.getAccommodationFrequencyDropDown();
			Thread.sleep(500);
			
			hardshipPage.getFirstTransportCostTextBox().sendKeys("200");
			
			//select monthly
			hardshipPage.getFirstTransportFrequencyDropDown();
			Thread.sleep(500);
			
			hardshipPage.getSecondTransportCostTextBox().sendKeys("50");
			
			//select weekly
			hardshipPage.getSecondTransportFrequencyDropDown();
			Thread.sleep(500);
			
			hardshipPage.getCreditCardInstitution().sendKeys("Westpac");
			hardshipPage.getCreditCardBalanceOwing().sendKeys("10000");
			hardshipPage.getCreditCardCost().sendKeys("10000");
			
			//select yearly
			hardshipPage.getCreditCardFrequencyDropDown();
			Thread.sleep(500);
			
			hardshipPage.getNextStep3Button().click();
			Assert.assertEquals(hardshipPage.getReasonDescription().isDisplayed(), true);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Step 2 did not pass");
		    throw ex;
		}
		
		//test 4
		try {
			//select unemployement
			hardshipPage.getReasonDropDown();
			Thread.sleep(500);
			
			hardshipPage.getReasonDescription().sendKeys("Test");
			
			//select selling assets
			hardshipPage.getPlanDropDown();
			Thread.sleep(500);
			
			hardshipPage.getEstimatedDate().sendKeys("12/12/2019");
			
			//file upload
			hardshipPage.getFileUploadBox().click();
			
			hardshipPage.getRelevantInfo().sendKeys("Test");
			hardshipPage.getNextStep4Button().click();
			Assert.assertEquals(hardshipPage.getDeclarationCheckBox().isDisplayed(), true);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Step 3 did not pass");
		    throw ex;
		}
		
		//test 5
		try {
			hardshipPage.getDeclarationCheckBox().click();
			hardshipPage.getSubmitButton().click();
			Thread.sleep(500);
			Assert.assertEquals(hardshipPage.getSuccessfulHeader().getText(), "Thank you for completing your application.");
			Thread.sleep(1000);
			}
		catch(AssertionError ex){
			System.out.println("Error: Step 4 did not pass");
			throw ex;
		}
	}
}
