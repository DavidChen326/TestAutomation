package co.indebted.mypackage.pagefactories.debts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPlanPageFactory {

	WebDriver driver;

	//step 1
	@FindBy(name = "email")
	WebElement emailTextBox;
	
	@FindBy(name = "phone")
	WebElement phoneTextBox;
	
	@FindBy(id = "terms_accepted")
	WebElement termsCheckBox;
	
	@FindBy(css = "#appPaymentPlan > div > div > div > div:nth-child(2) > div > form > div:nth-child(2) > div:nth-child(2) > div.c0125")
	WebElement nextButtonStep1;
	
	//step 2
	@FindBy(xpath = "//*[@id=\"appPaymentPlan\"]/div/div/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div/fieldset/div[1]/div/div/div[2]/div[1]/div[2]")
	WebElement nextMonthButton;
	
	@FindBy(xpath = "//*[@id=\"appPaymentPlan\"]/div/div/div/div[2]/div/div/form/div[2]/div[1]/div[1]/div/fieldset/div[1]/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[4]")
	WebElement dateButton;
	
	@FindBy(name = "payment_amount")
	WebElement instalmentAmountTextBox;
	
	@FindBy(css = "#appPaymentPlan > div > div > div > div:nth-child(2) > div > div > form > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div > div:nth-child(2) > fieldset > div")
	WebElement frequencyDropDown;
	
	@FindBy(css = "#appPaymentPlan > div > div > div > div:nth-child(2) > div > div > form > div:nth-child(2) > div:nth-child(2) > div.c0125 > button")
	WebElement nextButtonStep2;
	
	//step 3
	@FindBy(css = "#appPaymentPlan > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div.c0139 > div.c0142 > li:nth-child(1) > img")
	WebElement creditCardTab;
	
	@FindBy(css = "#appPaymentPlan > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div.c0139 > div.c0142 > li:nth-child(2) > img")
	WebElement directDebitTab;
	
	//credit card details
	@FindBy(name = "number")
	WebElement creditCardNumber;
	
	@FindBy(name = "first_name")
	WebElement firstName;
	
	@FindBy(name = "expiry")
	WebElement expiryDate;
	
	@FindBy(name = "cvc")
	WebElement CVC;
	
	@FindBy(name = "last_name")
	WebElement lastName;
	
	@FindBy(name = "amount")
	WebElement amount;	
	
	//bank details
	@FindBy(name = "bank_name")
	WebElement bankName;
	
	@FindBy(name = "account_name")
	WebElement accountName;
	
	@FindBy(name = "account_number")
	WebElement accountNumber;
	
	@FindBy(name = "routing_number")
	WebElement routingNumber;
	
	@FindBy(css = "#appPaymentPlan > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2) > form > div > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > fieldset > div")
	WebElement holderType;
	
	@FindBy(css = "#appPaymentPlan > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2) > form > div > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > fieldset > div")
	WebElement accountType;
	
	@FindBy(css = "#appPaymentPlan > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2) > form > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > fieldset > div")
	WebElement country;
	
	@FindBy(css = "#appPaymentPlan > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div:nth-child(2) > form > div > div:nth-child(2) > div.c0125 > button")
	WebElement nextButtonStep3;
	
	//step 4
	@FindBy(css = "#appPaymentPlan > div > div > div > div:nth-child(2) > div > div:nth-child(2) > div.c0125 > button")
	WebElement confirmButton;
	
	//step 4
	@FindBy(css = "#appPaymentPlan > div > div > div > div > div.headerMessage")
	WebElement successfulMsg;
	
	//get elements
	//step 1
	public String getPaymentPlanPageTitle() {
		return driver.getTitle();
	}
	
	public WebElement getEmailTextBox() {
		return emailTextBox;
	}
	
	public WebElement getPhoneTextBox() {
		return phoneTextBox;
	}
	
	public WebElement getTermsCheckBox() {
		return termsCheckBox;
	}
	
	public WebElement getNextButton() {
		return nextButtonStep1;
	}
	
	//step 2
	public WebElement getNextMonthButton() {
		return nextMonthButton;
	}
	
	public WebElement getDateButton() {
		return dateButton;
	}
	
	public WebElement getInstalmentAmountTextBox() {
		return instalmentAmountTextBox;
	}
	
	public WebElement getNextButtonStep2() {
		return nextButtonStep2;
	}
	
	public void getFrequency() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(frequencyDropDown).build().perform();
		List<WebElement> selectFrequencyDropDown = driver.findElements(By.className("Select-value"));
		WebElement secondFrequency = selectFrequencyDropDown.get(1);
		act.click(secondFrequency).build().perform();
	}
	
	//step 3
	
	//agent portal bank details
	public WebElement getCreditCardTab() {
		return creditCardTab;
	}
	
	public WebElement getDirectDebitTab() {
		return directDebitTab;
	}
	
	public WebElement getBankName() {
		return bankName;
	}
	
	public WebElement getAccountName() {
		return accountName;
	}
	
	public WebElement getAccountNumber() {
		return accountNumber;
	}
	
	public WebElement getRoutingNumber() {
		return routingNumber;
	}
	
	public void getHolderType() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(holderType).build().perform();
		List<WebElement> selectHolderType = driver.findElements(By.className("Select-value"));
		WebElement secondHolderValue = selectHolderType.get(1);
		act.click(secondHolderValue).build().perform();
	}
	
	public void getAccountType() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(accountType).build().perform();
		List<WebElement> selectAccountType = driver.findElements(By.className("Select-value"));
		WebElement secondAccountType = selectAccountType.get(1);
		act.click(secondAccountType).build().perform();
	}
	
	public void getCountry() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(country).build().perform();
		List<WebElement> selectCountry = driver.findElements(By.className("Select-value"));
		WebElement firstCountry = selectCountry.get(0);
		act.click(firstCountry).build().perform();
	}
	
//credit card details
	public WebElement getcreditCardNumber() {
		return creditCardNumber;
	}
	
	public WebElement getFirstName() {
		return firstName;
	}
	
	public WebElement getExpiryDate() {
		return expiryDate;
	}
	
	public WebElement getCVC() {
		return CVC;
	}
	
	public WebElement getLastName() {
		return lastName;
	}
	
	public WebElement getAmount() {
		return amount;
	}
	
	public WebElement getNextButtonStep3() {
		return nextButtonStep3;
	}
	
	//step 4
	public WebElement getConfirmButton() {
		return confirmButton;
	}
	
	public WebElement getSuccessfulMsg() {
		return successfulMsg;
	}
	
	//constructor
	public PaymentPlanPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
