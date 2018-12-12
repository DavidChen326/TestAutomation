package co.indebted.mypackage.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import co.indebted.mypackage.pagefactories.general.LoginPageFactory;

public class LoginFactory {
	
	WebDriver driver;
	
	public void login() {
	driver.get("https://app.indebted-staging.co/");
	String username = "david@indebted.io";
	String password = "NtL25pQGzwr8";
	 
	LoginPageFactory loginPage = new LoginPageFactory(driver);
	loginPage.logIn(username, password);
	}
	
	//constructor
	public LoginFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
