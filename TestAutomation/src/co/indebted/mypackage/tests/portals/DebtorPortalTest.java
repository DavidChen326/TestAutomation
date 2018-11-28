package co.indebted.mypackage.tests.portals;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.debtor.DebtorPortalPageFactory;
import co.indebted.mypackage.pagefactories.debts.DebtPageFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class DebtorPortalTest extends TestSetupAndTearDown{

	@Test
	public void debtorPortalTest() throws InterruptedException {
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		driver.get("https://app.indebted-staging.co/debts/2447");
		DebtPageFactory debtPage = new DebtPageFactory(driver);
		DebtorPortalPageFactory debtorPortalPage = new DebtorPortalPageFactory(driver);
		String debtorProtalLink;
		
		//assertions
		//test 1 open debt portal
		try {
			debtPage.getSendEmailTab().click();
			debtPage.getSendEmailToDropDown().click();
			Select sendToDropdown = new Select(debtPage.getSendEmailToDropDown());
			sendToDropdown.selectByVisibleText("indebted.tester1@gmail.com");
			Thread.sleep(500);
			Select templateDropdown = new Select(debtPage.getSendEmailTemplateDropDown());
			templateDropdown.selectByVisibleText("debtor portal");
			Thread.sleep(500);
			
			//get debtor portal link and send email
			debtorProtalLink = debtPage.getDebtorPortalLink().getText();
			debtPage.getSendEmailButton().click();
			Thread.sleep(500);
			
			//open debtor portal via link sent to debtor by email
			driver.get(debtorProtalLink);
			Assert.assertEquals(debtorPortalPage.getGreetingsHeader().getText().contains("Vedvrat Lavada Sharma"), true);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Debtor name is incorrect");
		    throw ex;
		}
		
		//test 2 credit card payment
		try {
			debtorPortalPage.getStartButton().click();
			debtorPortalPage.getNextStepButton().click();
			debtorPortalPage.getCreditCardNumber().sendKeys("4111111111111111");
			debtorPortalPage.getFirstName().sendKeys("Foo");
			debtorPortalPage.getExpiryDate().sendKeys("12/2020");
			debtorPortalPage.getCVC().sendKeys("123");
			debtorPortalPage.getLastName().sendKeys("Bar");
			debtorPortalPage.getAmount().clear();
			debtorPortalPage.getAmount().sendKeys("6");
			Thread.sleep(1000);
			debtorPortalPage.getReviewDetailsButton1().click();
			Thread.sleep(2000);
			debtorPortalPage.getConfirmButton().click();
			Assert.assertEquals(debtorPortalPage.getSuccessfulHeader().getText(), "Yay! Your payment has been successful. Thanks!");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Credit Card payment was unsuccessful");
		    throw ex;
		}
		
		
		//test 3 direct debit payment
		try {
			driver.navigate().refresh();
			debtorPortalPage.getStartButton().click();
			debtorPortalPage.getNextStepButton().click();
			debtorPortalPage.getDirectDebitTab().click();
			debtorPortalPage.getBankName().sendKeys("Westpac");
			debtorPortalPage.getAccountName().sendKeys("Foo Bar");
			debtorPortalPage.getAccountNumber().sendKeys("123456789");
			debtorPortalPage.getRoutingNumber().sendKeys("123456");
			
			//holder type
			debtorPortalPage.getHolderType();
			Thread.sleep(500);
			
			//account type
			debtorPortalPage.getAccountType();
			Thread.sleep(500);
			
			//country
			debtorPortalPage.getCountry();
			Thread.sleep(500);
			
			debtorPortalPage.getAmount().clear();
			debtorPortalPage.getAmount().sendKeys("6");
			Thread.sleep(1000);
			debtorPortalPage.getReviewDetailsButton1().click();
			Thread.sleep(2000);
			debtorPortalPage.getConfirmButton().click();
			Assert.assertEquals(debtorPortalPage.getSuccessfulHeader().getText(), "Yay! Your payment has been successful. Thanks!");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Bank payment was unsuccessful");
		    throw ex;
		}
		
		//test 4 existing credit card payment
		try {
			driver.navigate().refresh();
			debtorPortalPage.getStartButton().click();
			debtorPortalPage.getNextStepButton().click();
			debtorPortalPage.getExistingTab().click();
			debtorPortalPage.getExistingCreditCard().click();
			debtorPortalPage.getAmount().clear();
			debtorPortalPage.getAmount().sendKeys("6");
			Thread.sleep(1000);
			debtorPortalPage.getReviewDetailsButton2().click();
			Thread.sleep(2000);
			debtorPortalPage.getConfirmButton().click();
			Assert.assertEquals(debtorPortalPage.getSuccessfulHeader().getText(), "Yay! Your payment has been successful. Thanks!");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Existing Credit Card payment was unsuccessful");
		    throw ex;
		}
		
		//test 5 existing bank payment
		try {
			driver.navigate().refresh();
			debtorPortalPage.getStartButton().click();
			debtorPortalPage.getNextStepButton().click();
			debtorPortalPage.getExistingTab().click();
			debtorPortalPage.getExistingBank().click();
			debtorPortalPage.getAmount().clear();
			debtorPortalPage.getAmount().sendKeys("6");
			Thread.sleep(1000);
			debtorPortalPage.getReviewDetailsButton2().click();
			Thread.sleep(2000);
			debtorPortalPage.getConfirmButton().click();
			Assert.assertEquals(debtorPortalPage.getSuccessfulHeader().getText(), "Yay! Your payment has been successful. Thanks!");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Existing Bank payment was unsuccessful");
		    throw ex;
		}

		//test 6 wire transfer payment
		try {
			driver.navigate().refresh();
			debtorPortalPage.getStartButton().click();
			debtorPortalPage.getNextStepButton().click();
			debtorPortalPage.getWireTransferTab().click();
			debtorPortalPage.getAmount().clear();
			debtorPortalPage.getAmount().sendKeys("6");
			Thread.sleep(1000);
			debtorPortalPage.getReviewDetailsButton1().click();
			Thread.sleep(2000);
			debtorPortalPage.waitForReferenceCodeGenerated1();
			debtorPortalPage.getConfirmButton().click();
			Assert.assertEquals(debtorPortalPage.getSuccessfulHeader().getText(), "Your debts is now Promise to Pay.");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Wire Transfer payment was unsuccessful");
		    throw ex;
		}

		//test 7 BPay payment
		try {
			driver.navigate().refresh();
			debtorPortalPage.getStartButton().click();
			debtorPortalPage.getNextStepButton().click();
			debtorPortalPage.getBPayTab().click();
			debtorPortalPage.getAmount().clear();
			debtorPortalPage.getAmount().sendKeys("6");
			Thread.sleep(1000);
			debtorPortalPage.getReviewDetailsButton1().click();
			Thread.sleep(2000);
			debtorPortalPage.waitForReferenceCodeGenerated2();
			debtorPortalPage.getConfirmButton().click();
			Assert.assertEquals(debtorPortalPage.getSuccessfulHeader().getText(), "Your debts is now Promise to Pay.");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: BPay payment was unsuccessful");
		    throw ex;
		}
	}
}
