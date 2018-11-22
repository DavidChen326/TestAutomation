package co.indebted.mypackage.pagefactories.settings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComplianceTabFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/li[2]/a")
	WebElement complianceTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[1]/div/div[1]/div/img")
	WebElement newComplianceButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[1]/div[1]/div/fieldset/div/input")
	WebElement complianceNameTextBox;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[1]/div[2]/div[1]/div[1]/fieldset/div/input")
	WebElement maxInSpreadNumberTextBox;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[1]/div[2]/div[1]/div[2]/fieldset/div/input")
	WebElement maxInSpreadDaysTextBox;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[1]/div[2]/div[2]/div[1]/fieldset/div/input")
	WebElement maxPerWeekTextBox;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[1]/div[2]/div[2]/div[2]/fieldset/div/input")
	WebElement maxPerMonthTextBox;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[1]/div[3]/div/div[1]/fieldset/div/input")
	WebElement defaultBumpTimeHourTextBox;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[1]/div[3]/div/div[2]/fieldset/div/input")
	WebElement defaultBumpTimeMinTextBox;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[1]/div[3]/div/div[3]/fieldset/div/input")
	WebElement defaultBumpTimeSecTextBox;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[1]/li[1]")
	WebElement TODbutton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[1]/li[2]")
	WebElement DOWbutton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[1]/li[3]")
	WebElement DOMbutton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[2]/div/div[1]")
	WebElement blockersLabel;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[2]/div/div[2]/div/div/div[15]")
	WebElement TODblock15;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[2]/div/div[2]/div/div/div[39]")
	WebElement TODblock39;

	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[2]/div/div[2]/div[1]/div[2]/div/div[15]")
	WebElement DOWMondayBlock15;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[2]/div/div[2]/div[1]/div[2]/div/div[39]")
	WebElement DOWMondayBlock39;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[2]/div/div[2]/div[3]/div[2]/div/div[15]")
	WebElement DOWWednesdayBlock15;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[2]/div/div[2]/div[3]/div[2]/div/div[39]")
	WebElement DOWWednesdayBlock39;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[2]/div/div[2]/div/fieldset/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[6]")
	WebElement DOMBlock;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[2]/div/div[2]/div/div/div/div[15]")
	WebElement DOMBlock15;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[2]/fieldset/div/div[2]/div/div[2]/div/div/div/div[39]")
	WebElement DOMBlock39;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div/form/div[3]/div/button")
	WebElement saveComplianceButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[1]/div/div[2]/div")
	List<WebElement> complianceList;
	
	//get elements
	public WebElement getComplianceTab() {
		return complianceTab;
	}
	
	public WebElement getNewComplianceButton() {
		return newComplianceButton;
	}
	
	public WebElement getcomplianceNameTextBox() {
		return complianceNameTextBox;
	}
	
	public WebElement getMaxInSpreadNumberTextBox() {
		return maxInSpreadNumberTextBox;
	}
	
	public WebElement getMaxInSpreadDaysTextBox() {
		return maxInSpreadDaysTextBox;
	}
	public WebElement getMaxPerWeekTextBox() {
		return maxPerWeekTextBox;
	}
	
	public WebElement getMaxPerMonthTextBox() {
		return maxPerMonthTextBox;
	}
	
	public WebElement getDefaultBumpTimeHourTextBox() {
		return defaultBumpTimeHourTextBox;
	}
	
	public WebElement getDefaultBumpTimeMinTextBox() {
		return defaultBumpTimeMinTextBox;
	}
	
	public WebElement getDefaultBumpTimeSecTextBox() {
		return defaultBumpTimeSecTextBox;
	}
	
	public WebElement getTODbutton() {
		return TODbutton;
	}
	
	public WebElement getDOWbutton() {
		return DOWbutton;
	}
	
	public WebElement getDOMbutton() {
		return DOMbutton;
	}
	
	public WebElement getBlockersLabel() {
		return blockersLabel;
	}
	
	public WebElement getTODblock15() {
		return TODblock15;
	}
	
	public WebElement getTODblock39() {
		return TODblock39;
	}
	
	public WebElement getDOWMondayBlock15() {
		return DOWMondayBlock15;
	}
	
	public WebElement getDOWMondayBlock39() {
		return DOWMondayBlock39;
	}
	
	public WebElement getDOWWednesdayBlock15() {
		return DOWWednesdayBlock15;
	}
	
	public WebElement getDOWWednesdayBlock39() {
		return DOWWednesdayBlock39;
	}
	
	public WebElement getDOMBlock() {
		return DOMBlock;
	}
	
	public WebElement getDOMBlock15() {
		return DOMBlock15;
	}
	
	public WebElement getDOMBlock39() {
		return DOMBlock39;
	}
	
	public WebElement getSaveComplianceButton() {
		return saveComplianceButton;
	}
	
	public List<WebElement> getComplianceList() {
		return complianceList;
	}
	
	//constructor
	public ComplianceTabFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
