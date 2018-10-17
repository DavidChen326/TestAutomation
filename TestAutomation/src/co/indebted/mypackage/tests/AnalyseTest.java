package co.indebted.mypackage.tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.AnalysePageFactory;
import co.indebted.mypackage.pagefactories.ExplorePageFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndCloseDown;

public class AnalyseTest extends TestSetupAndCloseDown{
	
	@Test
	public void AnalyseTestPOM() {
				
		//login and navigate to Analyse page
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickAnalyse();
		
		AnalysePageFactory analysePage = new AnalysePageFactory(driver);
		
		String title = analysePage.getTitle();
		String firstCategory = analysePage.getFirstCategory();
		String secondCategory = analysePage.getSecondCategory();
		
		//assertions
		try {
			Assert.assertEquals(title, "Analyse • InDebted");
		}
		catch(AssertionError ex){
			System.out.println("Error: Analyse • InDebted is not found");
		    throw ex;
		}
		try {
			Assert.assertEquals(firstCategory, "Performance");
			Assert.assertEquals(secondCategory, "Communications");
		}
		catch(AssertionError ex){
			System.out.println("Error: Categories are not matching with expected");
		    throw ex;
		}
	}
	
	@AfterMethod
	public void closeDown () {
		driver.close();
		System.out.println("Test completed");
	}
}
