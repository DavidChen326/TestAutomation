package co.indebted.mypackage.tests.debts;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.debts.DebtPageFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class AdjustmentTest extends TestSetupAndTearDown{

	@Test
	public void AdjustmentTests() {
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		driver.get("https://app.indebted-staging.co/debts/2447");
		DebtPageFactory debtPage = new DebtPageFactory(driver);

		//assertions
		//test 1
		try {
			debtPage.getAdjustmentsTab().click();
			debtPage.getSplitPrincipalButtonInitial().click();
			debtPage.getSplitIncreaseButtonInitial().click();
			debtPage.getSplitAmountTextBoxInitial().sendKeys("6");
			debtPage.getSplitReasonTextBoxInitial().sendKeys("Increase principal by $6");
			debtPage.getAddSplitButtonInitial().click();
			Assert.assertEquals(debtPage.getDeleteFirstSplitButton().isDisplayed(), true);
		}
		catch(AssertionError ex){
			System.out.println("Error: Increase principal by $6 split not created");
		    throw ex;
		}
		
		//test 2
		try {
			debtPage.getSplitFeeButtonSecond().click();
			debtPage.getSplitIncreaseButtonSecond().click();
			debtPage.getSplitAmountTextBoxSecond().sendKeys("7");
			debtPage.getSplitReasonTextBoxSecond().sendKeys("Increase fee by $7");
			debtPage.getAddSplitButtonSecond().click();
			Assert.assertEquals(debtPage.getDeleteSecondSplitButton().isDisplayed(), true);
		}
		catch(AssertionError ex){
			System.out.println("Error: Increase fee by $7 split not created");
		    throw ex;
		}
		
		//test 3
		try {
			debtPage.getDeleteSecondSplitButton().click();
			debtPage.getSplitFeeButtonSecond().click();
			debtPage.getSplitIncreaseButtonSecond().click();
			debtPage.getSplitAmountTextBoxSecond().sendKeys("6");
			debtPage.getSplitReasonTextBoxSecond().sendKeys("Increase fee by $6");
			debtPage.getAddSplitButtonSecond().click();
			Assert.assertEquals(debtPage.getDeleteSecondSplitButton().isDisplayed(), true);
		}
		catch(AssertionError ex){
			System.out.println("Error: Delete last split and tncrease fee by $6 split not successful");
		    throw ex;
		}
		
		//test 4
		try {
			debtPage.getSplitInterestButtonSecond().click();
			debtPage.getSplitDecreaseButtonSecond().click();
			debtPage.getSplitAmountTextBoxSecond().sendKeys("8");
			debtPage.getSplitReasonTextBoxSecond().sendKeys("Decrease interest by $8");
			debtPage.getAddSplitButtonSecond().click();
			debtPage.getAdjustmentDescriptionTextBox().sendKeys("A test adjustment with all types of splits");
			debtPage.getSaveAdjustmentButton().click();
			Assert.assertEquals(debtPage.getAddSplitButtonInitial().isDisplayed(), true);
		}
		catch(AssertionError ex){
			System.out.println("Error: Save djustment not successful");
		    throw ex;
		}
	}
}
