package co.indebted.mypackage.pagefactories.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisputesTabFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[9]/a")
	WebElement disputesTab;
	
	@FindBy(css = "#app > div > div.c011 > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > button")
	WebElement addNewDisputeReasonButton;
	
	@FindBy(name = "name")
	WebElement disputeReasonName;
	
	@FindBy(name = "description")
	WebElement disputeReasonDescription;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[3]/div[3]/div/div/div[2]/div/form/div[2]/div[2]/button")
	WebElement saveNewDisputeReasonButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]")
	WebElement newDisputeReasonName;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[3]/div[2]/div[2]/div[2]/img")
	WebElement newDisputeReasonEditButton;
	
	//get elements
	public WebElement getDisputesTab() {
		return disputesTab;
	}
	
	public WebElement getNewDisputeReasonButton() {
		return addNewDisputeReasonButton;
	}
	
	public WebElement getDisputeReasonName() {
		return disputeReasonName;
	}
	
	public WebElement getDisputeReasonDescription() {
		return disputeReasonDescription;
	}
	
	public WebElement getSaveNewDisputeReasonButton() {
		return saveNewDisputeReasonButton;
	}
	
	public WebElement getNewDisputeReasonName() {
		return newDisputeReasonName;
	}
	
	public WebElement getNewDisputeReasonEditButton() {
		return newDisputeReasonEditButton;
	}
	//constructor
	public DisputesTabFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
