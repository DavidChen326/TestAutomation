package co.indebted.mypackage.pagefactories.debts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DebtPageFactory {

	WebDriver driver;

	//payment
	@FindBy(id = "PaymentMenu")
	WebElement paymentButton;
	
	//agent portal
		@FindBy(xpath = "/html/body/div[3]/div/div[1]/div[5]/div[9]/div[2]/div/div/a[2]")
		WebElement agentPortalButton;
		
	//agent portal step 1
		@FindBy(name = "email")
		WebElement agentPortalEmail;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > form > div > div.row.center-xs > div > div > button")
		WebElement agentPortalNextStepButton;
		
	//agent portal steps 2 payment methods
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div > div > div:nth-child(2) > div:nth-child(1) > div:nth-child(2)")
		WebElement agentPortalDirectDebitTab;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div > div > div:nth-child(2) > div:nth-child(1) > div:nth-child(3)")
		WebElement agentPortalExistingTab;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div > div > div:nth-child(2) > div:nth-child(1) > div:nth-child(4)")
		WebElement agentPortalWireTransferTab;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div > div > div:nth-child(2) > div:nth-child(1) > div:nth-child(5)")
		WebElement agentPortalBPayTab;
		
	//agent portal steps 2 payment method --> existing methods
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > form > div.container > div > div:nth-child(2) > div:nth-child(1) > div.col-md-2.col-xs-3.c0121")
		WebElement agentPortalExistingCreditCard;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > form > div.container > div > div:nth-child(2) > div:nth-child(1) > div.col-md-2.col-xs-2.c0121")
		WebElement agentPortalExistingBank;
		
	//agent portal step 3
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > form > div > div.row.center-xs > div > div > button")
		WebElement agentPortalReviewDetailsButton1;
				
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > form > div.row.center-xs > div > div > button")
		WebElement agentPortalReviewDetailsButton2;
				
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(3) > div > div:nth-child(11) > div.c0128")
		WebElement agentPortalReviewDetailsReferenceCode1;
				
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(3) > div > div:nth-child(3) > div.c0128")
		WebElement agentPortalReviewDetailsReferenceCode2;
				
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > div.row.center-xs > div > div > button")
		WebElement agentPortalConfirmButton;
				
	//agent portal step 4
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div > div > div.headerMessage")
		WebElement agentPortalSuccessfulHeader;

	//credit card details
		@FindBy(name = "number")
		WebElement agentPortalCreditCardNumber;
		
		@FindBy(name = "first_name")
		WebElement agentPortalFirstName;
		
		@FindBy(name = "expiry")
		WebElement agentPortalExpiryDate;
		
		@FindBy(name = "cvc")
		WebElement agentPortalCVC;
		
		@FindBy(name = "last_name")
		WebElement agentPortalLastName;
		
		@FindBy(name = "amount")
		WebElement agentPortalAmount;	
		
	//bank details
		@FindBy(name = "bank_name")
		WebElement agentPortalBankName;
		
		@FindBy(name = "account_name")
		WebElement agentPortalAccountName;
		
		@FindBy(name = "account_number")
		WebElement agentPortalAccountNumber;
		
		@FindBy(name = "routing_number")
		WebElement agentPortalRoutingNumber;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > form > div > div:nth-child(1) > div > div:nth-child(1) > div:nth-child(2) > div > fieldset > div")
		WebElement agentPortalHolderType;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > form > div > div:nth-child(1) > div > div:nth-child(2) > div:nth-child(2) > div > fieldset > div")
		WebElement agentPortalAccountType;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div:nth-child(2) > div > form > div > div:nth-child(1) > div > div:nth-child(3) > div:nth-child(2) > div > fieldset > div")
		WebElement agentPortalCountry;

	//contact
		@FindBy(css = "body > div:nth-child(7) > div > div.col-xs-12.col-lg-8 > div:nth-child(1) > div > ul > li:nth-child(2) > a")
		WebElement sendEmailTab;
		
		@FindBy(id = "email_contact_to")
		WebElement sendEmailToDropDown;
		
		@FindBy(id = "email_contact_contact_template_id")
		WebElement sendEmailTemplateDropDown;
		
		@FindBy(css = "#new_email_tab > div > form > div.form-group.text.optional.email_contact_message > div > div.note-editing-area > div.note-editable.panel-body > table > tbody > tr > td > div:nth-child(2) > div > div > div > div > div > div > div > div > p > span")
		WebElement debtorPortalLink;
		
		@FindBy(css = "#new_email_tab > div > form > input.btn.btn-primary.btn.primary")
		WebElement sendEmailButton;
		
	//return methods to test classes
	//contacts
		public WebElement getDebtorPortalLink() {
			return debtorPortalLink;
		}		
			
		public WebElement getSendEmailButton() {
			return sendEmailButton;
		}		
		
		public WebElement getSendEmailTemplateDropDown() {
			return sendEmailTemplateDropDown;
		}
		
		public WebElement getSendEmailToDropDown() {
			return sendEmailToDropDown;
		}
			
		public WebElement getSendEmailTab() {
			return sendEmailTab;
		}
	
	//payment
		public WebElement getPaymentButton() {
			return paymentButton;
		}
		
		public WebElement getAgentPortalButton() {
			return agentPortalButton;
		}
	
	//agent portal step 1
		public WebElement getAgentPortalEmail() {
			return agentPortalEmail;
		}
	
		public WebElement getAgentPortalNextStepButton() {
			return agentPortalNextStepButton;
		}
		
	//agent portal step 2
		public WebElement getAgentPortalReviewDetailsButton1() {
			return agentPortalReviewDetailsButton1;
		}
		
		public WebElement getAgentPortalReviewDetailsButton2() {
			return agentPortalReviewDetailsButton2;
		}
		
	//agent portal step 3
		public WebElement waitForReferenceCodeGenerated1() {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement referenceCode1 = wait.until(
			ExpectedConditions.visibilityOf(agentPortalReviewDetailsReferenceCode1));
			return referenceCode1;
		}
		
		public WebElement waitForReferenceCodeGenerated2() {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement referenceCode2 = wait.until(
			ExpectedConditions.visibilityOf(agentPortalReviewDetailsReferenceCode2));
			return referenceCode2;
		}
		
		public WebElement getAgentPortalConfirmButton() {
			return agentPortalConfirmButton;
		}
		
		public WebElement getAgentPortalExistingTab() {
			return 	agentPortalExistingTab;
		}
		
		public WebElement getAgentPortalExistingCreditCard() {
			return 	agentPortalExistingCreditCard;
		}
		
		public WebElement getAgentPortalExistingBank() {
			return 	agentPortalExistingBank;
		}
		
		public WebElement getAgentPortalWireTransferTab() {
			return agentPortalWireTransferTab;
		}
		
		public WebElement getAgentPortalBPayTab() {
			return agentPortalBPayTab;
		}
		
	//agent portal step 4
		public WebElement getAgentPortalSuccessfulHeader() {	
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement successfulHeader = wait.until(
			ExpectedConditions.visibilityOf(agentPortalSuccessfulHeader));
			return successfulHeader;
		}
		
		public WebElement getAgentPortalDirectDebitTab() {
			return agentPortalDirectDebitTab;
		}
		
	//agent portal bank details
		public WebElement getAgentPortalBankName() {
			return agentPortalBankName;
		}
		
		public WebElement getAgentPortalAccountName() {
			return agentPortalAccountName;
		}
		
		public WebElement getAgentPortalAccountNumber() {
			return agentPortalAccountNumber;
		}
		
		public WebElement getAgentPortalRoutingNumber() {
			return agentPortalRoutingNumber;
		}
		
		public void getAgentPortalHolderType() {
			//select an option from React dropdown compoment
			Actions act = new Actions(driver);
			act.click(agentPortalHolderType).build().perform();
			List<WebElement> selectHolderType = driver.findElements(By.className("Select-value"));
			WebElement secondHolderValue = selectHolderType.get(1);
			act.click(secondHolderValue).build().perform();
		}
		
		public void getAgentPortalAccountType() {
			//select an option from React dropdown compoment
			Actions act = new Actions(driver);
			act.click(agentPortalAccountType).build().perform();
			List<WebElement> selectAccountType = driver.findElements(By.className("Select-value"));
			WebElement secondAccountType = selectAccountType.get(1);
			act.click(secondAccountType).build().perform();
		}
		
		public void getAgentPortalCountry() {
			//select an option from React dropdown compoment
			Actions act = new Actions(driver);
			act.click(agentPortalCountry).build().perform();
			List<WebElement> selectCountry = driver.findElements(By.className("Select-value"));
			WebElement firstCountry = selectCountry.get(0);
			act.click(firstCountry).build().perform();
		}
		
	//credit card details
		public WebElement getAgentPortalCreditCardNumber() {
			return agentPortalCreditCardNumber;
		}
		
		public WebElement getAgentPortalFirstName() {
			return agentPortalFirstName;
		}
		
		public WebElement getAgentPortalExpiryDate() {
			return agentPortalExpiryDate;
		}
		
		public WebElement getAgentPortalCVC() {
			return agentPortalCVC;
		}
		
		public WebElement getAgentPortalLastName() {
			return agentPortalLastName;
		}
		
		public WebElement getAgentPortalAmount() {
			return agentPortalAmount;
		}
		
	//constructor
	public DebtPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
