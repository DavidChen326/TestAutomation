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
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div.c018.container > div:nth-child(1) > div > h1")
		WebElement greetingsHeader;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div.c018.container > div:nth-child(4) > div > div > button")
		WebElement startButton;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > form > div > div.row.center-xs > div > div > button")
		WebElement nextStepButton;
	
	//step 2 payment methods
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div > div > div:nth-child(2) > div:nth-child(1) > div:nth-child(2)")
		WebElement directDebitTab;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div > div > div:nth-child(2) > div:nth-child(1) > div:nth-child(3)")
		WebElement existingTab;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div > div > div:nth-child(2) > div:nth-child(1) > div:nth-child(4)")
		WebElement wireTransferTab;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div > div > div:nth-child(2) > div:nth-child(1) > div:nth-child(5)")
		WebElement BPayTab;
		
	//agent portal steps 2 payment method --> existing methods
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > form > div.container > div > div:nth-child(2) > div:nth-child(1) > div.col-md-2.col-xs-3.c0126")
		WebElement existingCreditCard;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > form > div.container > div > div:nth-child(2) > div:nth-child(1) > div.col-md-2.col-xs-2.c0126")
		WebElement existingBank;
		
	//step 3
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > form > div > div.row.center-xs > div > div > button")
		WebElement reviewDetailsButton1;
				
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > form > div.row.center-xs > div > div > button")
		WebElement reviewDetailsButton2;
				
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(3) > div > div:nth-child(11) > div.c0131")
		WebElement reviewDetailsReferenceCode1;
				
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(3) > div > div:nth-child(3) > div.c0131")
		WebElement reviewDetailsReferenceCode2;
				
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div.row.center-xs > div > div > button")
		WebElement confirmButton;
				
	//agent portal step 4
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div > div > div.headerMessage")
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
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > form > div > div:nth-child(1) > div > div:nth-child(1) > div:nth-child(2) > div > fieldset > div")
		WebElement holderType;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > form > div > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div > fieldset > div")
		WebElement accountType;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > form > div > div:nth-child(1) > div > div:nth-child(3) > div:nth-child(2) > div > fieldset > div")
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

		public WebElement getNextStepButton() {
			return nextStepButton;
		}
		
	//step 2
		public WebElement getReviewDetailsButton1() {
			return reviewDetailsButton1;
		}
		
		public WebElement getReviewDetailsButton2() {
			return reviewDetailsButton2;
		}
		
	//step 3
		public WebElement waitForReferenceCodeGenerated1() {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement referenceCode1 = wait.until(
			ExpectedConditions.visibilityOf(reviewDetailsReferenceCode1));
			return referenceCode1;
		}
		
		public WebElement waitForReferenceCodeGenerated2() {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement referenceCode2 = wait.until(
			ExpectedConditions.visibilityOf(reviewDetailsReferenceCode2));
			return referenceCode2;
		}
		
		public WebElement getConfirmButton() {
			return confirmButton;
		}
		
		public WebElement getExistingTab() {
			return 	existingTab;
		}
		
		public WebElement getExistingCreditCard() {
			return 	existingCreditCard;
		}
		
		public WebElement getExistingBank() {
			return 	existingBank;
		}
		
		public WebElement getWireTransferTab() {
			return wireTransferTab;
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
