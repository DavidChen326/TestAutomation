package co.indebted.mypackage.pagefactories.general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"session_email\"]")
	WebElement usernameBox;
	
	@FindBy(xpath = "//*[@id=\"session_password\"]")
	WebElement passwordBox;
	
	@FindBy(xpath = "/html/body/form/button")
	WebElement loginButton;
	
	@FindBy(xpath = "/html/body/form/small/a")
	WebElement resetButton;
	
	//steps
	public void setUserName(String username) {
		usernameBox.sendKeys(username);
	}
	
	public void setPassword(String password) {
		passwordBox.sendKeys(password);
	}
	
	public void clickSubmit() {
		loginButton.click();
	}
	
	public void clickReset() {
		resetButton.click();
	}
	
	//actions
	public void logIn(String username, String password) {
		setUserName (username);
		setPassword(password);
		clickSubmit();
	}
	
	//constructor
	public LoginPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
