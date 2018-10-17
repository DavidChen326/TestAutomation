package co.indebted.mypackage.pagefactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetSuccessfulPageFactory {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"clearance\"]/p")
	WebElement confirmationMessage;
	
	//steps
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getMessage() {
		return confirmationMessage.getText();
	}
	
	//constructor
	public ResetSuccessfulPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
