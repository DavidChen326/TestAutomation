package co.indebted.mypackage.pagefactories;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HardshipPageFactory {

	WebDriver driver;

	//step 1
	@FindBy(css = "#hardship_form > div > div.paperHeader")
	WebElement hardshipFormTitle;
	
	@FindBy(name = "occupation")
	WebElement occupationTextBox;
	
	@FindBy(name = "number_of_dependent")
	WebElement numberOfDependentTextBox;
	
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(3) > div:nth-child(2) > button")
	WebElement nextStep2Button;
	
	//step 2 incomes
	@FindBy(name = "incomes[0].empolyment_income.0.cost_cents")
	WebElement employmentIncomeTextBox;
	
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(4) > div > fieldset > div")
	WebElement employmentIncomeFrequencyDropDown;
	
	@FindBy(name = "incomes[6].other.0.display_name")
	WebElement otherIncomeTextBox;
	
	@FindBy(name = "incomes[6].other.0.cost_cents")
	WebElement otherIncomeAmountTextBox;
	
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(1) > div:nth-child(2) > div:nth-child(8) > div > div:nth-child(4) > div > fieldset > div")
	WebElement otherIncomeFrequencyDropDown;
	
	//step 2 assets
	@FindBy(name = "assets[0].house.0.cost_cents")
	WebElement houseValueTextBox;

	@FindBy(name = "assets[1].motor_vehicle.0.cost_cents")
	WebElement vehicleValueTextBox;
	
	@FindBy(name = "assets[5].superannuation.0.cost_cents")
	WebElement superValueTextBox;
	
	//step 2 expenses
	@FindBy(name = "expenses[0].accommodation.0.cost_cents")
	WebElement accommodationCostTextBox;
	
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(4) > div > fieldset > div")
	WebElement accommodationFrequencyDropDown;
	
	@FindBy(name = "expenses[2].transport.0.cost_cents")
	WebElement firstTransportCostTextBox;
	
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(3) > div:nth-child(2) > div:nth-child(4) > div > div:nth-child(4) > div > fieldset > div")
	WebElement firstTransportFrequencyDropDown;
	
	@FindBy(name = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(3) > div:nth-child(2) > div:nth-child(4) > div > img")
	WebElement transportAddButton;
	
	@FindBy(name = "expenses[2].transport.1.cost_cents")
	WebElement secondTransportCostTextBox;
	
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(3) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > div:nth-child(4) > div > fieldset > div")
	WebElement secondTransportFrequencyDropDown;
	
	//step 2 liabities
	@FindBy(name = "liabilities[0].credit_card.0.institution")
	WebElement creditCardInstitution;
	
	@FindBy(name = "liabilities[0].credit_card.0.balance_owing_cents")
	WebElement creditCardBalanceOwing;
	
	@FindBy(name = "liabilities[0].credit_card.0.cost_cents")
	WebElement creditCardCost;
	
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(6) > div > fieldset > div.Select.c0111.has-value.is-clearable.is-searchable.Select--single")
	WebElement creditCardFrequencyDropDown;
	
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(5) > div:nth-child(2) > button")
	WebElement nextStep3Button;
	
	//step 3
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(1) > div:nth-child(2) > div > div:nth-child(1) > fieldset > div")
	WebElement reasonDropDown;
	
	@FindBy(name = "reasonDescription")
	WebElement reasonDescription;
	
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(1) > fieldset > div")
	WebElement planDropDown;
	
	@FindBy(name = "estimatedDate")
	WebElement estimatedDate;
	
	@FindBy(name = "hardshipInfo")
	WebElement hardshipInfo;
	
	@FindBy(name = "helpInfo")
	WebElement helpInfo;
	
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(4) > div:nth-child(2) > div > div:nth-child(1) > fieldset > div.dropzone-container > div > input[type=\"file\"]")
	WebElement fileUploadBox;
	
	@FindBy(name = "relevantInfo")
	WebElement relevantInfo;
	
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > form > div:nth-child(5) > div:nth-child(2) > button")
	WebElement nextStep4Button;
	
	//step 4
	@FindBy(id = "declaration")
	WebElement declarationCheckBox;
	
	@FindBy(css = "#hardship_form > div > div.paperBody > div > div:nth-child(2) > div > div:nth-child(5) > div:nth-child(2) > button")
	WebElement submitButton;
	
	//successful
	@FindBy(css = "#hardship_form > div > div:nth-child(2) > h1")
	WebElement successfulHeader;
	
	//get elements
	//step 1
	public WebElement getHardshipFormTitle() {
		return hardshipFormTitle;
	}
	
	public WebElement getOccupationTextBox() {
		return occupationTextBox;
	}
	
	public WebElement getNumberOfDependentTextBox() {
		return numberOfDependentTextBox;
	}
	
	public WebElement getNextStepButton() {
		return nextStep2Button;
	}
	
	public WebElement getHardshipForTitle() {
		return hardshipFormTitle;
	}
	
	//step 2 incomes
	public WebElement getEmploymentIncomeTextBox() {
		return employmentIncomeTextBox;
	}
	
	public void getEmploymentIncomeFrequencyDropDown() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(employmentIncomeFrequencyDropDown).build().perform();
		List<WebElement> selectFrequency = driver.findElements(By.className("Select-value"));
		WebElement secondFrequency = selectFrequency.get(1);
		act.click(secondFrequency).build().perform();
	}
	
	public WebElement getOtherIncomeTextBox() {
		return otherIncomeTextBox;
	}
	
	public WebElement getOtherIncomeAmountTextBox() {
		return otherIncomeAmountTextBox;
	}
	
	public void getOtherIncomeFrequencyDropDown() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(otherIncomeFrequencyDropDown).build().perform();
		List<WebElement> selectFrequency = driver.findElements(By.className("Select-value"));
		WebElement thirdFrequency = selectFrequency.get(2);
		act.click(thirdFrequency).build().perform();
	}
	
	//step 2 assets
	public WebElement getHouseValueTextBox() {
		return houseValueTextBox;
	}
	
	public WebElement getVehicleValueTextBox() {
		return vehicleValueTextBox;
	}
	
	public WebElement getSuperValueTextBox() {
		return superValueTextBox;
	}
	
	//step 2 expenses
	public WebElement getAccommodationCostTextBox() {
		return accommodationCostTextBox;
	}
	
	public void getAccommodationFrequencyDropDown() {
		//scroll into view
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accommodationFrequencyDropDown);
		
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(accommodationFrequencyDropDown).build().perform();
		List<WebElement> selectFrequency = driver.findElements(By.className("Select-value"));
		WebElement thirdFrequency = selectFrequency.get(2);
		act.click(thirdFrequency).build().perform();
	}
	
	public WebElement getFirstTransportCostTextBox() {
		return firstTransportCostTextBox;
	}
	
	public void getFirstTransportFrequencyDropDown() {		
		//scroll into view
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstTransportFrequencyDropDown);
				
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(firstTransportFrequencyDropDown).build().perform();
		List<WebElement> selectFrequency = driver.findElements(By.className("Select-value"));
		WebElement thirdFrequency = selectFrequency.get(2);
		act.click(thirdFrequency).build().perform();
	}
	
	public WebElement getTransportAddButton() {
		return transportAddButton;
	}
	
	public WebElement getSecondTransportCostTextBox() {
		return secondTransportCostTextBox;
	}
	
	public void getSecondTransportFrequencyDropDown() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(secondTransportFrequencyDropDown).build().perform();
		List<WebElement> selectFrequency = driver.findElements(By.className("Select-value"));
		WebElement firstFrequency = selectFrequency.get(0);
		act.click(firstFrequency).build().perform();
	}
	
	//step 2 liabities
	public WebElement getCreditCardInstitution() {
		return creditCardInstitution;
	}
	
	public WebElement getCreditCardBalanceOwing() {
		return creditCardBalanceOwing;
	}
	
	public WebElement getCreditCardCost() {
		return creditCardCost;
	}
	
	public void getCreditCardFrequencyDropDown() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(creditCardFrequencyDropDown).build().perform();
		List<WebElement> selectFrequency = driver.findElements(By.className("Select-value"));
		WebElement forthFrequency = selectFrequency.get(3);
		act.click(forthFrequency).build().perform();
	}
	
	public WebElement getNextStep3Button() {
		return nextStep3Button;
	}
	
	//step 3
	public void getReasonDropDown() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(reasonDropDown).build().perform();
		List<WebElement> selectFrequency = driver.findElements(By.className("Select-value"));
		WebElement firstFrequency = selectFrequency.get(0);
		act.click(firstFrequency).build().perform();
	}
	
	public WebElement getReasonDescription() {
		return reasonDescription;
	}
	
	public void getPlanDropDown() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(planDropDown).build().perform();
		List<WebElement> selectFrequency = driver.findElements(By.className("Select-value"));
		WebElement forthFrequency = selectFrequency.get(3);
		act.click(forthFrequency).build().perform();
	}
	
	public WebElement getEstimatedDate() {
		return estimatedDate;
	}
	
	public WebElement getHardshipInfo() {
		return hardshipInfo;
	}
	
	public WebElement getHelpInfo() {
		return helpInfo;
	}
	
	public WebElement getFileUploadBox() {
		return fileUploadBox;
	}
	public WebElement getRelevantInfo() {
		return relevantInfo;
	}
	
	public WebElement getNextStep4Button() {
		return nextStep4Button;
	}
	
	//step 4
	public WebElement getDeclarationCheckBox() {
		return declarationCheckBox;
	}
	
	public WebElement getSubmitButton() {
		return submitButton;
	}
	
	//successful
	public WebElement getSuccessfulHeader() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement sHeader = wait.until(
		ExpectedConditions.visibilityOf(successfulHeader));
		return sHeader;
	}
	
	//constructor
	public HardshipPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
