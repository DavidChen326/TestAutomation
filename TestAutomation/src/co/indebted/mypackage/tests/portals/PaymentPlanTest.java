package co.indebted.mypackage.tests.portals;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.debts.DebtPageFactory;
import co.indebted.mypackage.pagefactories.debts.PaymentPlanPageFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class PaymentPlanTest extends TestSetupAndTearDown{

	@Test
	public void paymentPlanTests() throws InterruptedException {
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		driver.get("https://app.indebted-staging.co/debts/2448");
		DebtPageFactory debtPage = new DebtPageFactory(driver);
		PaymentPlanPageFactory paymentPlanPage = new PaymentPlanPageFactory(driver);
		
		//assertions
		//test 1
		try {
			debtPage.getApplyPaymentPlanButton().click();
			
			//switch to new tab 
			String oldTab = driver.getWindowHandle();
		    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		    
		    //close old tab only
		    driver.close();
		    
		    //switch focus to new tab
		    newTab.remove(oldTab);
		    driver.switchTo().window(newTab.get(0));

			Assert.assertEquals(paymentPlanPage.getPaymentPlanPageTitle(), "Payment Plan • InDebted");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Payment plan portal not initialised");
		    throw ex;
		}
		
		//test 2
		try {
			//step 1
			paymentPlanPage.getEmailTextBox().clear();
			paymentPlanPage.getEmailTextBox().sendKeys("indebted.tester2@gmail.com");
			paymentPlanPage.getPhoneTextBox().clear();
			paymentPlanPage.getPhoneTextBox().sendKeys("+61450970123");
			paymentPlanPage.getTermsCheckBox().click();
			paymentPlanPage.getPhoneTextBox().click();
			Thread.sleep(500);
			
			//step 2
			paymentPlanPage.getNextMonthButton().click();
			paymentPlanPage.getDateButton().click();
			paymentPlanPage.getInstalmentAmountTextBox().sendKeys("60");
			
			//set frequency to fortnightly
			paymentPlanPage.getFrequency();		
			paymentPlanPage.getNextButton().click();
			Thread.sleep(500);
		}
		catch(AssertionError ex){
			System.out.println("Error: step 2 not passed");
		    throw ex;
		}
		//test 1 credit card payment
				try {
					paymentPlanPage.getCreditCardTab().click();
					paymentPlanPage.getcreditCardNumber().sendKeys("4111111111111111");
					paymentPlanPage.getFirstName().sendKeys("Foo");
					paymentPlanPage.getExpiryDate().sendKeys("12/2020");
					paymentPlanPage.getCVC().sendKeys("123");
					paymentPlanPage.getLastName().sendKeys("Bar");
					paymentPlanPage.getAmount().sendKeys("6");
					Thread.sleep(1000);
					paymentPlanPage.getNextButtonStep3().click();
					Thread.sleep(2000);
					paymentPlanPage.getConfirmButton().click();
					Assert.assertEquals(paymentPlanPage.getSuccessfulMsg().getText(), "Congrats for creating a payment plan!");
				}
				catch(AssertionError ex){
					System.out.println("Error: Credit Card payment plan was unsuccessful");
				    throw ex;
				}
			
				//test 2 direct debit payment
						try {
							driver.navigate().refresh();
							paymentPlanPage.getDirectDebitTab().click();
							paymentPlanPage.getBankName().sendKeys("Westpac");
							paymentPlanPage.getAccountName().sendKeys("Foo Bar");
							paymentPlanPage.getAccountNumber().sendKeys("123456789");
							paymentPlanPage.getRoutingNumber().sendKeys("123456");
							
							//holder type
							paymentPlanPage.getHolderType();
							Thread.sleep(500);
							
							//account type
							paymentPlanPage.getAccountType();
							Thread.sleep(500);
							
							//country
							paymentPlanPage.getCountry();
							Thread.sleep(500);
							
							paymentPlanPage.getAmount().sendKeys("6");
							Thread.sleep(1000);
							paymentPlanPage.getNextButtonStep3().click();
							Thread.sleep(2000);
							paymentPlanPage.getConfirmButton().click();
							Assert.assertEquals(paymentPlanPage.getSuccessfulMsg().getText(), "Congrats for creating a payment plan!");
						}
						catch(AssertionError ex){
							System.out.println("Error: Direct Debit payment plan was unsuccessful");
						    throw ex;
						}		
		
	}
}
