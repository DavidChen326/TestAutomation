package co.indebted.mypackage.pagefactories.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPageFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[1]/a")
	WebElement generalTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[2]/a")
	WebElement complianceTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[3]/a")
	WebElement rolesTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[4]/a")
	WebElement teamsTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[5]/a")
	WebElement usersTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[6]/a")
	WebElement assistTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[7]/a")
	WebElement debtsTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[8]/a")
	WebElement financeTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[9]/a")
	WebElement inboxTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[10]/a")
	WebElement buildTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[11]/a")
	WebElement contactsTab;

	//steps
	public String getTitle() {
		return driver.getTitle();
	}
	
	public WebElement getGeneralTab() {
		return generalTab;
	}
	
	public WebElement getComplianceTab() {
		return complianceTab;
	}
	
	public WebElement getRolesTab() {
		return rolesTab;
	}
	
	public WebElement getTeamsTab() {
		return teamsTab;
	}
	
	public WebElement getUsersTab() {
		return usersTab;
	}
	
	public WebElement getAssistTab() {
		return assistTab;
	}
	
	public WebElement getDebtsTab() {
		return debtsTab;
	}
	
	public WebElement getInboxTab() {
		return inboxTab;
	}
	
	public WebElement getBuildTab() {
		return buildTab;
	}
	
	public WebElement getContactsTab() {
		return contactsTab;
	}
	
	//constructor
	public SettingsPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
