package co.indebted.mypackage.tests.portals;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.debts.DebtPageFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class AgentPortalTest extends TestSetupAndTearDown{

	@Test
	public void agentPortalTest() throws InterruptedException {
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		driver.get("https://app.indebted-staging.co/debts/2447");
		DebtPageFactory debtPage = new DebtPageFactory(driver);

		//assertions
		//test 1 credit card payment
		try {
			debtPage.getPaymentButton().click();
			Thread.sleep(500);
			debtPage.getAgentPortalButton().click();
			Thread.sleep(500);
			debtPage.getAgentPortalEmail().clear();
			debtPage.getAgentPortalEmail().sendKeys("indebted.tester1@gmail.com");
			debtPage.getAgentPortalDeclarationCheckbox().click();
			Thread.sleep(500);
			debtPage.getAgentPortalNextStepButton().click();
			debtPage.getAgentPortalCreditCardTab().click();
			debtPage.getAgentPortalCreditCardNumber().sendKeys("4111111111111111");
			debtPage.getAgentPortalFirstName().sendKeys("Foo");
			debtPage.getAgentPortalExpiryDate().sendKeys("12/2020");
			debtPage.getAgentPortalCVC().sendKeys("123");
			debtPage.getAgentPortalLastName().sendKeys("Bar");
			debtPage.getAgentPortalAmount().clear();
			debtPage.getAgentPortalAmount().sendKeys("6");
			Thread.sleep(1000);
			debtPage.getAgentPortalNextButton().click();
			Thread.sleep(2000);
			debtPage.getAgentPortalConfirmButton().click();
			Assert.assertEquals(debtPage.getAgentPortalSuccessfulHeader().getText(), "Thank you, Your payment was processed successfully.");
		}
		catch(AssertionError ex){
			System.out.println("Error: Credit Card payment was unsuccessful");
		    throw ex;
		}
	
		//test 2 direct debit payment
				try {
					driver.navigate().refresh();
					debtPage.getPaymentButton().click();
					Thread.sleep(500);
					debtPage.getAgentPortalButton().click();
					Thread.sleep(500);
					debtPage.getAgentPortalEmail().clear();
					debtPage.getAgentPortalEmail().sendKeys("indebted.tester1@gmail.com");
					debtPage.getAgentPortalDeclarationCheckbox().click();
					Thread.sleep(500);
					debtPage.getAgentPortalNextStepButton().click();
					debtPage.getAgentPortalDirectDebitTab().click();
					debtPage.getAgentPortalBankName().sendKeys("Westpac");
					debtPage.getAgentPortalAccountName().sendKeys("Foo Bar");
					debtPage.getAgentPortalAccountNumber().sendKeys("123456789");
					debtPage.getAgentPortalRoutingNumber().sendKeys("123456");
					
					//holder type
					debtPage.getAgentPortalHolderType();
					Thread.sleep(500);
					
					//account type
					debtPage.getAgentPortalAccountType();
					Thread.sleep(500);
					
					//country
					debtPage.getAgentPortalCountry();
					Thread.sleep(500);
					
					debtPage.getAgentPortalAmount().clear();
					debtPage.getAgentPortalAmount().sendKeys("6");
					Thread.sleep(1000);
					debtPage.getAgentPortalNextButton().click();
					Thread.sleep(2000);
					debtPage.getAgentPortalConfirmButton().click();
					Assert.assertEquals(debtPage.getAgentPortalSuccessfulHeader().getText(), "Thank you, Your payment was processed successfully.");
				}
				catch(AssertionError ex){
					System.out.println("Error: Bank payment was unsuccessful");
				    throw ex;
				}
				
				//test 3 existing credit card payment
				try {
					driver.navigate().refresh();
					debtPage.getPaymentButton().click();
					Thread.sleep(500);
					debtPage.getAgentPortalButton().click();
					Thread.sleep(500);
					debtPage.getAgentPortalEmail().clear();
					debtPage.getAgentPortalEmail().sendKeys("indebted.tester1@gmail.com");
					debtPage.getAgentPortalDeclarationCheckbox().click();
					Thread.sleep(500);
					debtPage.getAgentPortalNextStepButton().click();
					debtPage.getAgentPortalExistingCreditCard().click();
					debtPage.getAgentPortalAmount().clear();
					debtPage.getAgentPortalAmount().sendKeys("6");
					Thread.sleep(1000);
					debtPage.getAgentPortalNextButton().click();
					Thread.sleep(2000);
					debtPage.getAgentPortalConfirmButton().click();
					Assert.assertEquals(debtPage.getAgentPortalSuccessfulHeader().getText(), "Thank you, Your payment was processed successfully.");
				}
				catch(AssertionError ex){
					System.out.println("Error: Existing Credit Card payment was unsuccessful");
				    throw ex;
				}
				
				//test 4 existing bank payment
				try {
					driver.navigate().refresh();
					debtPage.getPaymentButton().click();
					Thread.sleep(500);
					debtPage.getAgentPortalButton().click();
					Thread.sleep(500);
					debtPage.getAgentPortalEmail().clear();
					debtPage.getAgentPortalEmail().sendKeys("indebted.tester1@gmail.com");
					debtPage.getAgentPortalDeclarationCheckbox().click();
					Thread.sleep(500);
					debtPage.getAgentPortalNextStepButton().click();
					debtPage.getAgentPortalExistingBank().click();
					debtPage.getAgentPortalAmount().clear();
					debtPage.getAgentPortalAmount().sendKeys("6");
					Thread.sleep(1000);
					debtPage.getAgentPortalNextButton().click();
					Thread.sleep(2000);
					debtPage.getAgentPortalConfirmButton().click();
					Assert.assertEquals(debtPage.getAgentPortalSuccessfulHeader().getText(), "Thank you, Your payment was processed successfully.");
				}
				catch(AssertionError ex){
					System.out.println("Error: Existing Bank payment was unsuccessful");
				    throw ex;
				}
				
				//test 5 BPay payment
				try {
					driver.navigate().refresh();
					debtPage.getPaymentButton().click();
					Thread.sleep(500);
					debtPage.getAgentPortalButton().click();
					Thread.sleep(500);
					debtPage.getAgentPortalEmail().clear();
					debtPage.getAgentPortalEmail().sendKeys("indebted.tester1@gmail.com");
					debtPage.getAgentPortalDeclarationCheckbox().click();
					Thread.sleep(500);
					debtPage.getAgentPortalNextStepButton().click();
					debtPage.getAgentPortalBPayTab().click();
					debtPage.getAgentPortalAmount().clear();
					debtPage.getAgentPortalAmount().sendKeys("6");
					Thread.sleep(1000);
					debtPage.getAgentPortalNextButton().click();
					Thread.sleep(2000);
					debtPage.waitForReferenceCodeGenerated2();
					debtPage.getAgentPortalConfirmButton().click();
					Assert.assertEquals(debtPage.getAgentPortalSuccessfulHeader().getText(), "Your debtor has now Promise to Pay");
				}
				catch(AssertionError ex){
					System.out.println("Error: BPay payment was unsuccessful");
				    throw ex;
				}
				
				//test 6 PayID payment
				try {
					driver.navigate().refresh();
					debtPage.getPaymentButton().click();
					Thread.sleep(500);
					debtPage.getAgentPortalButton().click();
					Thread.sleep(500);
					debtPage.getAgentPortalEmail().clear();
					debtPage.getAgentPortalEmail().sendKeys("indebted.tester1@gmail.com");
					debtPage.getAgentPortalDeclarationCheckbox().click();
					Thread.sleep(500);
					debtPage.getAgentPortalNextStepButton().click();
					debtPage.getAgentPortalWireTransferTab().click();
					debtPage.getAgentPortalAmount().clear();
					debtPage.getAgentPortalAmount().sendKeys("6");
					Thread.sleep(1000);
					debtPage.getAgentPortalNextButton().click();
					Thread.sleep(2000);
					debtPage.waitForReferenceCodeGenerated1();
					debtPage.getAgentPortalConfirmButton().click();
					Assert.assertEquals(debtPage.getAgentPortalSuccessfulHeader().getText(), "Your debtor has now Promise to Pay");
				}
				catch(AssertionError ex){
					System.out.println("Error: PayID payment was unsuccessful");
				    throw ex;
				}

	}
}
