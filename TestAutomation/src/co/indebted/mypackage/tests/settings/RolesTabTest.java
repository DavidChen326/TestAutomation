package co.indebted.mypackage.tests.settings;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.explore.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.RolesTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class RolesTabTest extends TestSetupAndTearDown{
	
	@Test
	public void RolesTabTests() throws InterruptedException {
				
		//login and navigate to Roles tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		RolesTabFactory permissionsTab = new RolesTabFactory(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Role newRole = new Role("Tester19");
		boolean roleExist = false;
		
		//assertions
		//test 1
		try {		
			permissionsTab.getPermissionsTab().click();
			permissionsTab.getNewRoleButton().click();
			permissionsTab.getRoleNameTextBox().sendKeys(newRole.roleName);
			Thread.sleep(1000);
			permissionsTab.getSaveNewRoleButton().click();	
			Thread.sleep(2000);
			for (WebElement r : permissionsTab.getRolesList()) {
				if (r.getText().contains(newRole.roleName)){
					roleExist = true;
				}
			}
			Assert.assertEquals(roleExist, true);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New role is not found");
		    throw ex;
		}
		
		//test 2
		try {
			for (WebElement r : permissionsTab.getRolesList()) {
				if (r.getText().equals(newRole.roleName)){
					r.click();
				}
			}
			Thread.sleep(1000);
			permissionsTab.getAnalyseCommunicationsCanViewButton().click();
			Thread.sleep(500);
			permissionsTab.getExploreGeneralCanAccessButton().click();
			Thread.sleep(500);
			permissionsTab.getSettingsDebtStagesCanAccessButton().click();
			Thread.sleep(500);
			permissionsTab.getSettingsDebtTypesCanAccessButton().click();
			Thread.sleep(500);
			permissionsTab.getSettingsUsersCanDeleteButton().click();
			Thread.sleep(500);
			permissionsTab.getSettingsUsersCanDeleteButton().click();
			Thread.sleep(500);
			driver.navigate().refresh();
			
			//window scrolling
			for (int second = 0;; second++) {
		        if(second >=60){
		            break;
		        }
		            jse.executeScript("window.scrollBy(0,10)", "");
			}
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New premissions are not saved");
		    throw ex;
		}
	}
	
	//roles constructor
	public class Role{
		public String roleName;
		
		public Role(String name) {
			roleName = name;
		}
	}
}
