package co.indebted.mypackage.pagefactories.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersTabFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/li[4]/a")
	WebElement usersTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[1]/div/div/fieldset/input")
	WebElement usersSearchBox;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/li[1]/div[1]")
	WebElement firstUserName;
	
	//get elements
	public WebElement getUsersTab() {
		return usersTab;
	}
	
	public WebElement getUsersSearchBox() {
		return usersSearchBox;
	}
	
	public WebElement getFirstUserName() {
		return firstUserName;
	}
	
	//constructor
	public UsersTabFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
