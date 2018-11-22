package co.indebted.mypackage.pagefactories.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPageFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/li[1]/a")
	WebElement generalTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/li[2]/a")
	WebElement complianceTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/li[3]/a")
	WebElement permissionsTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/li[4]/a")
	WebElement usersTab;

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
	
	public WebElement getPermisionsTab() {
		return permissionsTab;
	}
	
	public WebElement getUsersTab() {
		return usersTab;
	}
	
	//constructor
	public SettingsPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
