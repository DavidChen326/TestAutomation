package co.indebted.mypackage.pagefactories.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralTabFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/li[1]/a")
	WebElement generalTab;
	
	@FindBy(name = "legal_name")
	WebElement legalNameTextBox;
	
	@FindBy(name = "email_display_name")
	WebElement emailDisplayNameTextBox;
	
	@FindBy(name = "bcc_emails")
	WebElement bccEmailsTextBox;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/form/div[2]/div[1]/fieldset/div/div")
	WebElement countryDropDown;
	
	@FindBy(xpath = "//*[@id=\"react-select-2--value\"]/div[2]/input")
	WebElement countryOptions;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/form/div[2]/div[2]/fieldset/div")
	WebElement timezoneDropDown;
	
	@FindBy(xpath = "//*[@id=\"react-select-3--value\"]/div[2]/input")
	WebElement timezoneOptions;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/form/div[3]/fieldset/div[2]/div[2]/div/span[6]/div/span/div")
	WebElement brandColour;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/form/div[4]/div/button")
	WebElement saveButton;
	
	//get elements
	public WebElement getGeneralTab() {
		return generalTab;
	}
	
	public WebElement getLegalNameTextBox() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement brandName = wait.until(
		ExpectedConditions.visibilityOf(legalNameTextBox));
		return brandName;
	}
	
	public WebElement getEmailDisplayNameTextBox() {
		return emailDisplayNameTextBox;
	}
	
	public WebElement getBCCEmailsTextBox() {
		return bccEmailsTextBox;
	}
	
	public WebElement getCountryDropDown() {
		return countryDropDown;
	}
	
	public WebElement getCountryOptions() {
		return countryOptions;
	}
	
	public WebElement getTimezoneDropDown() {
		return timezoneDropDown;
	}
	
	public WebElement getTimezoneOptions() {
		return timezoneOptions;
	}
	
	public WebElement getBrandColour() {
		return brandColour;
	}
	
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	//constructor
	public GeneralTabFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
