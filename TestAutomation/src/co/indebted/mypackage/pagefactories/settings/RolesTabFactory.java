package co.indebted.mypackage.pagefactories.settings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RolesTabFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[3]/a")
	WebElement permissionsTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[1]/div/div[1]/div/img")
	WebElement newRoleButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[1]/div/div[2]/div/li/form/div[1]/fieldset/div/input")
	WebElement newRoleNameTextBox;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[1]/div/div[2]/div/li/form/div[2]/img[2]")
	WebElement saveNewRoleButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[1]/div/div[2]/div")
	List<WebElement> rolesList;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Communications'])[1]/following::span[1]")
	WebElement analyseCommunicationsCanViewButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div[4]/div/div/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div/label")
	WebElement exploreGeneralCanAccessButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div[6]/div/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/div/div/label")
	WebElement settingsDebtStagesCanAccessButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div[6]/div/div/div/div[2]/div[3]/div/div/div/div[2]/div/div/div/div/div/div/label")
	WebElement settingsDebtTypesCanAccessButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div[6]/div/div/div/div[2]/div[5]/div/div/div/div[2]/div[4]/div/div/div/div/div/label/span")
	WebElement settingsUsersCanDeleteButton;
	
	//get elements
	public WebElement getPermissionsTab() {
		return permissionsTab;
	}
	
	public WebElement getNewRoleButton() {
		return newRoleButton;
	}
	
	public WebElement getRoleNameTextBox() {
		return newRoleNameTextBox;
	}
	
	public WebElement getSaveNewRoleButton() {
		return saveNewRoleButton;
	}
	
	public List<WebElement> getRolesList() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		List<WebElement> list = wait.until(
		ExpectedConditions.visibilityOfAllElements(rolesList));
		return list;
	}
	
	public WebElement getAnalyseCommunicationsCanViewButton() {
		return 	analyseCommunicationsCanViewButton;
	}
	
	public WebElement getExploreGeneralCanAccessButton() {
		return 	exploreGeneralCanAccessButton;
	}
	
	public WebElement getSettingsDebtStagesCanAccessButton() {
		return 	settingsDebtStagesCanAccessButton;
	}
	
	public WebElement getSettingsDebtTypesCanAccessButton() {
		return 	settingsDebtTypesCanAccessButton;
	}
	
	public WebElement getSettingsUsersCanDeleteButton() {
		return 	settingsUsersCanDeleteButton;
	}
	
	//constructor
	public RolesTabFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
