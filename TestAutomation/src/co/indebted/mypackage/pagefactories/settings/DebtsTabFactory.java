package co.indebted.mypackage.pagefactories.settings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DebtsTabFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/li[7]/a")
	WebElement debtsTab;
	
	@FindBy(name = "field")
	WebElement defaultInterestRateTextBox;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[1]/div/form/div[2]/div[2]/button")
	WebElement debtSaveButton;
	
	//debt stage
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div[1]/div[2]/div/button")
	WebElement newDebtStageButton;
	
	@FindBy(name = "name")
	WebElement debtStageName;
	
	@FindBy(name = "description")
	WebElement debtStageDescription;
	
	@FindBy(css = "#app > div > div:nth-child(3) > div:nth-child(2) > div.c0120 > div > div > div.c0126 > div > form > div:nth-child(1) > div:nth-child(3) > fieldset > div")
	WebElement debtStateOfStageDropDown;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div[3]/div/div/div[2]/div/form/div[2]/div[2]/button")
	WebElement debtStageSaveButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[1]")
	WebElement firstDebtStageName;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div[2]/div/div[2]/div[2]/img")
	WebElement firstDebtStageEditButton;
	
	//custom property
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[3]/div[1]/div[2]/div/button")
	WebElement newCustomPropertyButton;
	
	@FindBy(name = "label")
	WebElement customPropertyName;
	
	@FindBy(name = "description")
	WebElement customPropertyDescription;
	
	@FindBy(css = "#app > div > div:nth-child(3) > div:nth-child(3) > div.c0120 > div > div > div.c0126 > div > form > div:nth-child(1) > div:nth-child(3) > fieldset > div")
	WebElement customPropertyTypeDropDown;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[3]/div[3]/div/div/div[2]/div/form/div[2]/div[2]/button")
	WebElement customPropertySaveButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[3]/div[2]/div/div[2]/div[1]/div[1]")
	WebElement firstCustomPropertyName;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[3]/div[2]/div/div[2]/div[2]/img")
	WebElement firstCustomPropertyEditButton;
	
	//get elements
	public WebElement getDebtsTab() {
		return debtsTab;
	}
	
	public WebElement getDefaultInterestRateTextBox() {
		return defaultInterestRateTextBox;
	}
	
	public WebElement getDebtsSaveButton() {
		return debtSaveButton;
	}
	
	//debt stage
	public WebElement getNewDebtStageButton() {
		return newDebtStageButton;
	}
	
	public WebElement getDebtStageName() {
		return debtStageName;
	}
	
	public WebElement getDebtStageDescription() {
		return debtStageDescription;
	}
	
	public WebElement getFirstDebtStageName() {
		return firstDebtStageName;
	}
	
	public WebElement getFirstDebtStageEditButton() {
		return firstDebtStageEditButton;
	}

	public void getHardshipStateOfStageDropDown() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(debtStateOfStageDropDown).build().perform();
		List<WebElement> selectState = driver.findElements(By.className("Select-input"));
		WebElement firstState = selectState.get(0);
		act.click(firstState).build().perform();
	}
	
	public WebElement getDebtStageSaveButton() {
		return debtStageSaveButton;
	}
	
	//custom property
	public WebElement getNewCustomPropertyButton() {
		return newDebtStageButton;
	}
	
	public WebElement getCustomPropertyName() {
		return customPropertyName;
	}
	
	public WebElement getCustomPropertyDescription() {
		return customPropertyDescription;
	}
	
	public WebElement getFirstCustomPropertyName() {
		return firstCustomPropertyName;
	}
	
	public WebElement getFirstCustomPropertyEditButton() {
		return firstCustomPropertyEditButton;
	}

	public void getCustomPropertyTypeDropDown() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(customPropertyTypeDropDown).build().perform();
		List<WebElement> selectState = driver.findElements(By.className("Select-input"));
		WebElement firstState = selectState.get(0);
		act.click(firstState).build().perform();
	}
	
	public WebElement getCustomPropertySaveButton() {
		return customPropertySaveButton;
	}
	
	//constructor
	public DebtsTabFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
