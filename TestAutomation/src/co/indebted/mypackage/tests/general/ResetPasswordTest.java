package co.indebted.mypackage.tests.general;

import org.junit.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.general.LoginPageFactory;
import co.indebted.mypackage.pagefactories.general.ResetPageFactory;
import co.indebted.mypackage.pagefactories.general.ResetSuccessfulPageFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class ResetPasswordTest extends TestSetupAndTearDown{

	@Test
	public void resetPasswordTests() throws InterruptedException {
		String email = "david@indebted.io";
		String confirmationMessage = null;
		
		//click reset then type emial address then confirm
		driver.get("https://app.indebted-staging.co/");
		LoginPageFactory loginPage = new LoginPageFactory(driver);
		loginPage.clickReset();
		
		ResetPageFactory resetPageFactory = new ResetPageFactory(driver);
		resetPageFactory.reset(email);

		ResetSuccessfulPageFactory resetSuccessfulPageFactory = new ResetSuccessfulPageFactory(driver);
		confirmationMessage = resetSuccessfulPageFactory.getMessage();
		
		
		//assertions
		try {
			Assert.assertEquals(confirmationMessage, "You will receive an email within the next few minutes. It contains instructions for changing your password.");
		}
		catch(AssertionError ex){
			System.out.println("Error: Confirm message does not match with expected");
		    throw ex;
		}
	}
}
