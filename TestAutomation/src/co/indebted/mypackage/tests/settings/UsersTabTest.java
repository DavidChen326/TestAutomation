package co.indebted.mypackage.tests.settings;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.explore.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.UsersTabFactory;
import co.indebted.mypackage.tests.settings.TeamsTabTest.Team;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.RandomStringGenerator;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class UsersTabTest extends TestSetupAndTearDown{
	
	@Test
	public void PermissionsTabTests() throws InterruptedException {
				
		//login and navigate to Compliance tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
		
		UsersTabFactory usersTab = new UsersTabFactory(driver);
		User user = new User(randomStringGenerator.randomString(5), randomStringGenerator.randomString(5), randomStringGenerator.randomString(5) + "@gmail.com");
		
		//assertions
		//test 1
		try {		
			usersTab.getUsersTab().click();
			usersTab.getNewUserButton().click();
			usersTab.getUserFirstName().sendKeys(user.userFirstName);
			usersTab.getUserLastName().sendKeys(user.userLastName);
			usersTab.getUserEmail().sendKeys(user.userEmail);
			usersTab.getUserRole();
			usersTab.getUserTeam();
			Thread.sleep(500);
			usersTab.getSaveUserButton().click();
			Assert.assertEquals(usersTab.getNewUserName().getText(), user.userFirstName + " " + user.userLastName);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New role is not found");
		    throw ex;
		}
		
		//test 2
		try {		
			usersTab.getDoneButton().click();
			usersTab.getFirstUserEditButton().click();
			usersTab.getUserFirstName().sendKeys(user.userFirstName);
			usersTab.getUserLastName().sendKeys(user.userLastName);
			usersTab.getUserEmail().sendKeys(user.userEmail);
			usersTab.getUserRole();
			usersTab.getUserTeam();
			Thread.sleep(500);
			usersTab.getSaveUserButton().click();
			Assert.assertEquals(usersTab.getFirstUserFirstName().getText(), user.userFirstName);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: Edit role was unsuccessful");
		    throw ex;
		}
	}
	
	//user constructor
		public class User{
			public String userFirstName;
			public String userLastName;
			public String userEmail;
			public User(String firstName, String lastName, String email) {
				userFirstName = firstName;
				userLastName = lastName;
				userEmail = email;
			}
		}
}
