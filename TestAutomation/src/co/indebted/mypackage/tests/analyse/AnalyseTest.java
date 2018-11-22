package co.indebted.mypackage.tests.analyse;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.analyse.AnalysePageFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class AnalyseTest extends TestSetupAndTearDown{
	
	@Test
	public void AnalyseTests() throws InterruptedException {
				
		//login and navigate to Analyse page
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickAnalyse();
		
		AnalysePageFactory analysePage = new AnalysePageFactory(driver);
		
		String title = analysePage.getTitle();
		String firstCategory = analysePage.getFirstCategoryHeader();
		String secondCategory = analysePage.getSecondCategoryHeader();
		String defaultReportName = analysePage.getDefaultSelectedReportName();
		
		//assertions
		//test 1
		try {
			Assert.assertEquals(title, "Analyse • InDebted");
		}
		catch(AssertionError ex){
			System.out.println("Error: Page title doesn't match");
		    throw ex;
		}
		
		//test 2
		try {
			Assert.assertEquals(firstCategory, "Performance");
			Assert.assertEquals(secondCategory, "Communications");
		}
		catch(AssertionError ex){
			System.out.println("Error: Categories name are not matching with expected");
		    throw ex;
		}
		
		//test 3
		try {
			Assert.assertEquals(defaultReportName, "Overview");
		}
		catch(AssertionError ex){
			System.out.println("Error: Default report is not set to Overview");
		    throw ex;
		}
		
		//test 4
		try {
			analysePage.getAndClickFirstCategoryList();
			analysePage.getAndClickSecondCategoryList();
		}
		catch(AssertionError ex){
			System.out.println("Error: Report loading failed");
		    throw ex;
		}

	}
}
