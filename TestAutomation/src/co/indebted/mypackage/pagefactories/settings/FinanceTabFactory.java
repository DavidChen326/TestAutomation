package co.indebted.mypackage.pagefactories.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinanceTabFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[8]/a")
	WebElement financeTab;
	
	@FindBy(name = "payment_plan_terms")
	WebElement termsTextBox;
	
	@FindBy(name = "payment_plan_min_amount")
	WebElement minimumAmount;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[3]/div/form/div[1]/div[3]/fieldset/div/div[1]/li[1]")
	WebElement weekly;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[3]/div/form/div[1]/div[3]/fieldset/div/div[1]/li[2]")
	WebElement fortnightly;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[3]/div/form/div[1]/div[3]/fieldset/div/div[1]/li[3]")
	WebElement monthly;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[3]/div/form/div[1]/div[3]/fieldset/div/div[1]/li[4]")
	WebElement bimonthly;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[3]/div/form/div[1]/div[3]/fieldset/div/div[1]/li[5]")
	WebElement quarterly;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[3]/div/form/div[2]/div[2]/button")
	WebElement saveButton;
	
	//get elements
	public WebElement getFinanceTab() {
		return financeTab;
	}
	
	public WebElement getTermsTextBox() {
		return termsTextBox;
	}
	
	public WebElement getMinimumAmount() {
		return minimumAmount;
	}
	
	public WebElement getWeekly() {
		return weekly;
	}
	
	public WebElement getFortnightly() {
		return fortnightly;
	}
	
	public WebElement getMonthly() {
		return monthly;
	}
	
	public WebElement getBimonthly() {
		return bimonthly;
	}
	
	public WebElement getQuarterly() {
		return quarterly;
	}
	
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	//constructor
	public FinanceTabFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
