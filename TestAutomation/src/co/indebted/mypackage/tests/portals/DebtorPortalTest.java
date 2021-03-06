package co.indebted.mypackage.tests.portals;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.debtor.DebtorPortalPageFactory;
import co.indebted.mypackage.pagefactories.debts.DebtPageFactory;
import co.indebted.mypackage.utilities.LogOutFactory;
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
		
		LogOutFactory logOutFactory = new LogOutFactory(driver);
		
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
			
			//logout current user
			logOutFactory.logOut();
			
			//open debtor portal via link sent to debtor by email
			driver.get(debtorProtalLink);
			Assert.assertEquals(debtorPortalPage.getGreetingsHeader().getText().contains("let's clear your debt in 4 simple steps"), true);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Debtor protal not opened");
		    throw ex;
		}
		
		//test 2 credit card payment
		try {
			debtorPortalPage.getStartButton().click();
			debtorPortalPage.getDeclarationCheckbox().click();
			Thread.sleep(1000);
			debtorPortalPage.getNextButton().click();
			debtorPortalPage.getCreditCardNumber().sendKeys("4111111111111111");
			debtorPortalPage.getFirstName().sendKeys("Foo");
			debtorPortalPage.getExpiryDate().sendKeys("12/2020");
			debtorPortalPage.getCVC().sendKeys("123");
			debtorPortalPage.getLastName().sendKeys("Bar");
			debtorPortalPage.getAmount().clear();
			debtorPortalPage.getAmount().sendKeys("6");
			Thread.sleep(1000);
			debtorPortalPage.getStep2NextButton().click();
			Thread.sleep(2000);
			debtorPortalPage.getConfirmButton().click();
			Assert.assertEquals(debtorPortalPage.getSuccessfulHeader().getText(), "Thank you, Your payment was processed successfully.");
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
			debtorPortalPage.getDeclarationCheckbox().click();
			Thread.sleep(1000);
			debtorPortalPage.getNextButton().click();
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
			debtorPortalPage.getStep2NextButton().click();
			Thread.sleep(2000);
			debtorPortalPage.getConfirmButton().click();
			Assert.assertEquals(debtorPortalPage.getSuccessfulHeader().getText(), "Thank you, Your payment was processed successfully.");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Bank payment was unsuccessful");
		    throw ex;
		}

		//test 4 BPay payment
		try {
			driver.navigate().refresh();
			debtorPortalPage.getStartButton().click();
			debtorPortalPage.getDeclarationCheckbox().click();
			Thread.sleep(1000);
			debtorPortalPage.getNextButton().click();
			debtorPortalPage.getBPayTab().click();
			debtorPortalPage.getAmount().clear();
			debtorPortalPage.getAmount().sendKeys("6");
			Thread.sleep(1000);
			debtorPortalPage.getStep2NextButton().click();
			Thread.sleep(2000);
			debtorPortalPage.waitForReferenceCodeGenerated2();
			debtorPortalPage.getConfirmButton().click();
			Assert.assertEquals(debtorPortalPage.getSuccessfulHeader().getText(), "Thank you for notifying us of your intention to pay.\n" + 
					"Your next step is to transfer the funds to complete the payment.");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: BPay payment was unsuccessful");
			throw ex;
		}
				
		//test 5 PayID payment
		try {
			driver.navigate().refresh();
			debtorPortalPage.getStartButton().click();
			debtorPortalPage.getDeclarationCheckbox().click();
			Thread.sleep(1000);
			debtorPortalPage.getNextButton().click();
			debtorPortalPage.getWireTransferTab().click();
			debtorPortalPage.getAmount().clear();
			debtorPortalPage.getAmount().sendKeys("6");
			Thread.sleep(1000);
			debtorPortalPage.getStep2NextButton().click();
			Thread.sleep(2000);
			debtorPortalPage.waitForReferenceCodeGenerated1();
			debtorPortalPage.getConfirmButton().click();
			Assert.assertEquals(debtorPortalPage.getSuccessfulHeader().getText(), "Thank you for notifying us of your intention to pay.\n" + 
					"Your next step is to transfer the funds to complete the payment.");
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: PayID payment was unsuccessful");
		    throw ex;
		}

	}
}
