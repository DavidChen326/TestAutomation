package co.indebted.mypackage.pagefactories.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPageFactory {

	WebDriver driver;
	
	@FindBy(css = "#app > div > div.c012 > li:nth-child(1) > a")
	WebElement generalTab;
	
	@FindBy(css = "#app > div > div.c012 > li:nth-child(2) > a")
	WebElement complianceTab;
	
	@FindBy(css = "#app > div > div.c012 > li:nth-child(3) > a")
	WebElement rolesTab;
	
	@FindBy(css = "#app > div > div.c012 > li:nth-child(4) > a")
	WebElement teamsTab;
	
	@FindBy(css = "#app > div > div.c012 > li:nth-child(5) > a")
	WebElement usersTab;
	
	@FindBy(css = "#app > div > div.c012 > li:nth-child(6) > a")
	WebElement assistTab;
	
	@FindBy(css = "#app > div > div.c012 > li:nth-child(7) > a")
	WebElement debtsTab;
	
	@FindBy(css = "#app > div > div.c012 > li:nth-child(8) > a")
	WebElement inboxTab;
	
	@FindBy(css = "#app > div > div.c012 > li:nth-child(9) > a")
	WebElement buildTab;
	
	@FindBy(css = "#app > div > div.c012 > li:nth-child(10) > a")
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
