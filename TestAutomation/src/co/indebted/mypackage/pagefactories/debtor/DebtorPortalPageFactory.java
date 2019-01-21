package co.indebted.mypackage.pagefactories.debtor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DebtorPortalPageFactory {

	WebDriver driver;
	
	//step 1
		@FindBy(css = "#assemblyForm > div > div > div.c015 > div.c019 > div:nth-child(1) > div.c018 > div")
		WebElement greetingsHeader;
		
		@FindBy(css = "#assemblyForm > div > div > div.c015 > div.c019 > div.c0112 > div.c0114 > button")
		WebElement startButton;
		
		@FindBy(id = "declaration")
		WebElement declarationCheckbox;
		
		@FindBy(css = "#assemblyForm > div > div > div.c015 > div > div:nth-child(2) > div > form > div:nth-child(2) > div:nth-child(2) > div.c0114 > button")
		WebElement nextButton;
	
	//step 2 payment methods	
		@FindBy(css = "#assemblyForm > div > div > div.c015 > div > div:nth-child(2) > div > div:nth-child(2) > div.c0134 > div.c0137 > li:nth-child(2) > img")
		WebElement directDebitTab;
		
		@FindBy(css = "#assemblyForm > div > div > div.c015 > div > div:nth-child(2) > div > div:nth-child(2) > div.c0134 > div.c0137 > li:nth-child(3) > img")
		WebElement BPayTab;
		
		@FindBy(css = "#assemblyForm > div > div > div.c015 > div > div:nth-child(2) > div > div:nth-child(2) > div.c0134 > div.c0137 > li:nth-child(4) > img")
		WebElement payIDTab;
		
		@FindBy(css = "#assemblyForm > div > div > div.c015 > div > div:nth-child(2) > div > div:nth-child(2) > div.c0114 > button")
		WebElement step2NextButton;
		
	//step 3
		@FindBy(css = "#assemblyForm > div > div > div.c015 > div > div:nth-child(2) > div > div:nth-child(2) > div.c0114 > button")
		WebElement confirmButton;
				
		@FindBy(css = "#assemblyForm > div > div > div.c015 > div > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div > div:nth-child(1) > div > div.c0145")
		WebElement payIDcode;
				
		@FindBy(css = "#assemblyForm > div > div > div.c015 > div > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div > div:nth-child(1) > div > div.c0145")
		WebElement billerCode;
				
	//agent portal step 4
		@FindBy(css = "#assemblyForm > div > div > div.c015 > div > div > div > div.headerMessage")
		WebElement successfulHeader;
	
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
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div:nth-child(2) > form > div > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > fieldset > div")
		WebElement holderType;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div:nth-child(2) > form > div > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > fieldset > div")
		WebElement accountType;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div:nth-child(2) > form > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > fieldset > div")
		WebElement country;
	
	//return methods to test classes
	//step 1
		public WebElement getGreetingsHeader() {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement e = wait.until(
			ExpectedConditions.visibilityOf(greetingsHeader));
			return e;
		}
		
		public WebElement getStartButton() {
			return startButton;
		}

		public WebElement getDeclarationCheckbox() {
			return declarationCheckbox;
		}
		
		public WebElement getNextButton() {
			return nextButton;
		}
		
	//step 2
		public WebElement getStep2NextButton() {
			return step2NextButton;
		}
		
	//step 3
		public WebElement waitForReferenceCodeGenerated1() {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement payIDCode = wait.until(
			ExpectedConditions.visibilityOf(payIDcode));
			return payIDCode;
		}
		
		public WebElement waitForReferenceCodeGenerated2() {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement BPayCode = wait.until(
			ExpectedConditions.visibilityOf(billerCode));
			return BPayCode;
		}
		
		public WebElement getConfirmButton() {
			return confirmButton;
		}
		
		public WebElement getWireTransferTab() {
			return payIDTab;
		}
		
		public WebElement getBPayTab() {
			return BPayTab;
		}
		
	//step 4
		public WebElement getSuccessfulHeader() {	
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement sHeader = wait.until(
			ExpectedConditions.visibilityOf(successfulHeader));
			return sHeader;
		}
		
		public WebElement getDirectDebitTab() {
			return directDebitTab;
		}
		
	//agent portal bank details
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
			public WebElement getCreditCardNumber() {
				return creditCardNumber;
			}
			
			public WebElement getFirstName() {
				return firstName;
			}
			
			public WebElement getLastName() {
				return lastName;
			}
			
			public WebElement getExpiryDate() {
				return expiryDate;
			}
			
			public WebElement getCVC() {
				return CVC;
			}
			
			public WebElement getAmount() {
				return amount;
			}
			
	//constructor
	public DebtorPortalPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
