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
		
	//Hardship
		@FindBy(css = "#promise_76693ee8-69d7-44c4-97e6-00a7ab987550 > div.col-md-2 > a > i")
		WebElement applyHardshipButton;
	
	//agent portal
		@FindBy(xpath = "/html/body/div[3]/div/div[1]/div[5]/div[9]/div[2]/div/div/a[2]")
		WebElement agentPortalButton;
		
	//agent portal step 1
		@FindBy(name = "email")
		WebElement agentPortalEmail;
		
		@FindBy(id = "declaration")
		WebElement agentPortalDeclarationCheckbox;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > form > div > div:nth-child(2) > div.c0125 > button")
		WebElement agentPortalNextStepButton;
		
		//agent portal steps 2 payment methods
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div.c0128 > div.c0131 > li:nth-child(2) > img")
		WebElement agentPortalCreditCardTab;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div.c0128 > div.c0131 > li:nth-child(3) > img")
		WebElement agentPortalDirectDebitTab;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div.c0128 > div.c0131 > li:nth-child(4) > img")
		WebElement agentPortalBPayTab;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div.c0128 > div.c0131 > li:nth-child(5) > img")
		WebElement agentPortalPayIDTab;
		
	//agent portal steps 2 payment method --> existing methods
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div:nth-child(2) > form > div > div:nth-child(1) > div > div.c0128 > div.c0131 > li:nth-child(1) > img")
		WebElement agentPortalExistingCreditCard;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div:nth-child(2) > form > div > div:nth-child(1) > div > div.c0128 > div.c0131 > li:nth-child(2) > img")
		WebElement agentPortalExistingBank;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div:nth-child(2) > form > div > div:nth-child(2) > div.c0125 > button")
		WebElement agentPortalReviewNextButton;
		
	//agent portal step 3						
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div > div:nth-child(1) > div > div.c0133")
		WebElement agentPortalReviewDetailsPayID;
				
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div > div:nth-child(1) > div > div.c0133")
		WebElement agentPortalReviewDetailsBillerCode;
				
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div:nth-child(2) > div.c0125 > button")
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
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div:nth-child(2) > form > div > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > fieldset > div")
		WebElement agentPortalHolderType;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div:nth-child(2) > form > div > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > fieldset > div")
		WebElement agentPortalAccountType;
		
		@FindBy(css = "#assemblyForm > div > div > div.c014 > div > div:nth-child(2) > div > div:nth-child(2) > form > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > fieldset > div")
		WebElement agentPortalCountry;

	//contacts
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
		
		//adjustment
		@FindBy(css = "body > div:nth-child(7) > div > div.col-xs-12.col-lg-8 > div:nth-child(1) > div > ul > li:nth-child(6) > a")
		WebElement adjustmentsTab;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(2) > div > form > div > div:nth-child(1) > fieldset:nth-child(1) > div.c216 > div > li:nth-child(1)")
		WebElement splitPrincipalButtonInitial;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(3) > div > form > div > div:nth-child(1) > fieldset:nth-child(1) > div.c216 > div > li:nth-child(2)")
		WebElement splitFeeButtonSecond;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(3) > div > form > div > div:nth-child(1) > fieldset:nth-child(1) > div.c216 > div > li:nth-child(3)")
		WebElement splitInterestButtonSecond;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(2) > div > form > div > div:nth-child(1) > fieldset:nth-child(2) > div.c216 > div > li:nth-child(1)")
		WebElement splitIncreaseButtonInitial;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(3) > div > form > div > div:nth-child(1) > fieldset:nth-child(2) > div.c216 > div > li:nth-child(1)")
		WebElement splitIncreaseButtonSecond;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(2) > div > form > div > div:nth-child(1) > fieldset:nth-child(2) > div.c216 > div > li:nth-child(2)")
		WebElement splitDecreaseButtonInitial;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(3) > div > form > div > div:nth-child(1) > fieldset:nth-child(2) > div.c216 > div > li:nth-child(2)")
		WebElement splitDecreaseButtonSecond;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(2) > div > form > div > div:nth-child(1) > div:nth-child(3) > fieldset > div > input")
		WebElement splitAmountTextBoxInitial;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(3) > div > form > div > div:nth-child(1) > div:nth-child(3) > fieldset > div > input")
		WebElement splitAmountTextBoxSecond;
		
		@FindBy(name = "description")
		WebElement splitReasonTextBoxInitial;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(3) > div > form > div > div:nth-child(1) > div:nth-child(4) > fieldset > textarea")
		WebElement splitReasonTextBoxSecond;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(2) > div > form > div > div:nth-child(2) > img")
		WebElement addSplitButtonInitial;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(3) > div > form > div > div:nth-child(2) > img")
		WebElement addSplitButtonSecond;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(2) > div > form > div:nth-child(1) > fieldset > div > input")
		WebElement adjustmentDescriptionTextBox;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(2) > div > form > div.c2126 > li:nth-child(2) > div > div:nth-child(2) > img")
		WebElement deleteFirstSplitButton;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(2) > div > form > div.c2126 > li:nth-child(3) > div > div:nth-child(2) > img")
		WebElement deleteSecondSplitButton;
		
		@FindBy(css = "#adjustments > div > div > div:nth-child(2) > div > form > div.c2126 > div:nth-child(5) > div > button")
		WebElement saveAdjustmentButton;
		
	//return methods to test classes
		//hardship
		public WebElement getApplyHardshipButton() {
			return applyHardshipButton;
		}
		
		//adjustments
		public WebElement getAdjustmentDescriptionTextBox() {
			return adjustmentDescriptionTextBox;
		}
		
		public WebElement getDeleteSecondSplitButton() {
			return deleteSecondSplitButton;
		}
		
		public WebElement getDeleteFirstSplitButton() {
			return deleteFirstSplitButton;
		}
		
		public WebElement getAddSplitButtonSecond() {
			return addSplitButtonSecond;
		}
		
		public WebElement getAddSplitButtonInitial() {
			return addSplitButtonInitial;
		}
		
		public WebElement getSplitReasonTextBoxSecond() {
			return splitReasonTextBoxSecond;
		}
		
		public WebElement getSplitReasonTextBoxInitial() {
			return splitReasonTextBoxInitial;
		}
		
		public WebElement getSplitAmountTextBoxSecond() {
			return splitAmountTextBoxSecond;
		}
		
		public WebElement getSplitAmountTextBoxInitial() {
			return splitAmountTextBoxInitial;
		}
		
		public WebElement getSplitDecreaseButtonSecond() {
			return splitDecreaseButtonSecond;
		}
		
		public WebElement getSplitIncreaseButtonSecond() {
			return splitIncreaseButtonSecond;
		}
		
		public WebElement getSplitDecreaseButtonInitial() {
			return splitDecreaseButtonInitial;
		}
		
		public WebElement getSplitIncreaseButtonInitial() {
			return splitIncreaseButtonInitial;
		}
		
		public WebElement getSplitInterestButtonSecond() {
			return splitInterestButtonSecond;
		}
		
		public WebElement getSplitFeeButtonSecond() {
			return splitFeeButtonSecond;
		}
		
		public WebElement getSplitPrincipalButtonInitial() {
			return splitPrincipalButtonInitial;
		}
		
		public WebElement getSaveAdjustmentButton() {
			return saveAdjustmentButton;
		}
		
		//contacts
		public WebElement getAdjustmentsTab() {
			return adjustmentsTab;
		}	
		
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
		
		public WebElement getAgentPortalDeclarationCheckbox() {
			return agentPortalDeclarationCheckbox;
		}
	
		public WebElement getAgentPortalNextStepButton() {
			return agentPortalNextStepButton;
		}
		
	//agent portal step 2
		public WebElement getAgentPortalNextButton() {
			return agentPortalReviewNextButton;
		}

		
	//agent portal step 3
		public WebElement waitForReferenceCodeGenerated1() {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement payID = wait.until(
			ExpectedConditions.visibilityOf(agentPortalReviewDetailsPayID));
			return payID;
		}
		
		public WebElement waitForReferenceCodeGenerated2() {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement billerCode = wait.until(
			ExpectedConditions.visibilityOf(agentPortalReviewDetailsBillerCode));
			return billerCode;
		}
		
		public WebElement getAgentPortalConfirmButton() {
			return agentPortalConfirmButton;
		}
		
		public WebElement getAgentPortalCreditCardTab() {
			return 	agentPortalCreditCardTab;
		}
		
		public WebElement getAgentPortalExistingCreditCard() {
			return 	agentPortalExistingCreditCard;
		}
		
		public WebElement getAgentPortalExistingBank() {
			return 	agentPortalExistingBank;
		}
		
		public WebElement getAgentPortalWireTransferTab() {
			return agentPortalPayIDTab;
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
