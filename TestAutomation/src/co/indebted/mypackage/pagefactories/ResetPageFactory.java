package co.indebted.mypackage.pagefactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPageFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"session_email\"]")
	WebElement emailBox;
	
	@FindBy(xpath = "/html/body/form/button/div")
	WebElement resetButton;
	
	//steps
	public void setEmail(String email) {
		emailBox.sendKeys(email);
	}
	
	public void clickResetButton() {
		resetButton.click();
	}
	
	//actions
	public void reset(String email) {
		setEmail(email);
		clickResetButton();
	}
	
	//constructor
	public ResetPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
