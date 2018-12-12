package co.indebted.mypackage.tests.settings;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.indebted.mypackage.pagefactories.explore.ExplorePageFactory;
import co.indebted.mypackage.pagefactories.settings.TeamsTabFactory;
import co.indebted.mypackage.utilities.LoginFactory;
import co.indebted.mypackage.utilities.RandomStringGenerator;
import co.indebted.mypackage.utilities.TestSetupAndTearDown;

public class TeamsTabTest extends TestSetupAndTearDown{
	
	@Test
	public void TeamsTabTests() throws InterruptedException {
				
		//login and navigate to Compliance tab
		LoginFactory loginFactory = new LoginFactory(driver);
		loginFactory.login();
		
		RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
		
		ExplorePageFactory explorePage = new ExplorePageFactory(driver);
		explorePage.clickSettings();
		
		TeamsTabFactory teamsTab = new TeamsTabFactory(driver);
		Team team = new Team(randomStringGenerator.randomString(5), randomStringGenerator.randomString(5));
		
		//assertions
		//test 1
		try {		
			teamsTab.getTeamsTab().click();
			teamsTab.getAddNewTeamButton().click();
			Thread.sleep(500);
			teamsTab.getTeamName().sendKeys(team.teamName);
			teamsTab.getTeamDescription().sendKeys(team.teamDescription);
			Thread.sleep(500);
			teamsTab.getSaveTeamButton().click();
			Assert.assertEquals(teamsTab.getNewTeamName().getText(), team.teamName + team.teamMemberCount);
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
			System.out.println("Error: New team is not found");
		    throw ex;
		}
		
		//test 1
		try {		
			teamsTab.getNewTeamEditButton().click();
			teamsTab.getTeamName().sendKeys("-update");
			teamsTab.getTeamDescription().sendKeys("-update");
			Thread.sleep(500);
			teamsTab.getSaveTeamButton().click();
			Assert.assertEquals(teamsTab.getNewTeamName().getText(), team.teamName + "-update" + team.teamMemberCount );
			Thread.sleep(1000);
		}
		catch(AssertionError ex){
		System.out.println("Error:");
		throw ex;
		}		
	}
	
	
	//team constructor
	public class Team{
		public String teamName;
		public String teamDescription;
		public String teamMemberCount;
		public Team(String name, String description) {
			teamName = name;
			teamDescription = description;
			teamMemberCount = " (0)";
		}
	}
}
