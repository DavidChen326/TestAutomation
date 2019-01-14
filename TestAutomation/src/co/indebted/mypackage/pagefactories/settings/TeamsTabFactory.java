package co.indebted.mypackage.pagefactories.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeamsTabFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[4]/a")
	WebElement teamsTab;
	
	@FindBy(css = "#app > div > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > button")
	WebElement addNewTeamButton;
	
	@FindBy(name = "name")
	WebElement teamName;
	
	@FindBy(name = "description")
	WebElement teamDescription;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[3]/div/div/div[2]/div/form/div[2]/div[2]/button")
	WebElement saveTeamButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div[2]/div[1]/div[1]")
	WebElement newTeamName;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div[2]/div[2]/img")
	WebElement newTeamEditButton;
	
	//get elements
	public WebElement getTeamsTab() {
		return teamsTab;
	}
	
	public WebElement getAddNewTeamButton() {
		return addNewTeamButton;
	}
	
	public WebElement getTeamName() {
		return teamName;
	}
	
	public WebElement getTeamDescription() {
		return teamDescription;
	}
	
	public WebElement getSaveTeamButton() {
		return saveTeamButton;
	}
	
	public WebElement getNewTeamName() {
		return newTeamName;
	}
	
	public WebElement getNewTeamEditButton() {
		return newTeamEditButton;
	}
	//constructor
	public TeamsTabFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
