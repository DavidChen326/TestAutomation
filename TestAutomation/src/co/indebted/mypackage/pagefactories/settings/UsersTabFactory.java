package co.indebted.mypackage.pagefactories.settings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersTabFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[2]/li[5]/a")
	WebElement usersTab;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[1]/div[2]/div/button")
	WebElement newUserButton;
	
	@FindBy(name = "first_name")
	WebElement userFirstName;
	
	@FindBy(name = "last_name")
	WebElement userLastName;
	
	@FindBy(name = "email")
	WebElement userEmail;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[3]/div/div/div[2]/div/form/div[1]/div[4]/fieldset/div[1]")
	WebElement userRole;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[3]/div/div/div[2]/div/form/div[1]/div[5]/fieldset/div[1]")
	WebElement userTeam;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[3]/div/div/div[2]/div/form/div[2]/div[2]/button")
	WebElement saveUserButton;
	
	@FindBy(css = "#app > div > div:nth-child(3) > div.c0120 > div > div > div.c0126 > div > div:nth-child(1) > div > div.c0142")
	WebElement newUserName;
	
	@FindBy(css = "#app > div > div:nth-child(3) > div.c0120 > div > div > div.c0126 > div > div:nth-child(2) > div > div.c0142")
	WebElement newUserPassword;
	
	@FindBy(css = "#app > div > div:nth-child(3) > div.c0120 > div > div > div.c0126 > div > div:nth-child(5) > div > button")
	WebElement doneButton;
	
	@FindBy(css = "#app > div > div:nth-child(3) > div.c0114 > div:nth-child(2) > div.c0117 > div.c0118.first_name")
	WebElement firstUserFirstName;
	
	@FindBy(css = "#app > div > div:nth-child(3) > div.c0114 > div:nth-child(2) > div.c0119 > img")
	WebElement firstUserEditButton;
	
	//get elements
	public WebElement getUsersTab() {
		return usersTab;
	}
	
	public WebElement getNewUserButton() {
		return newUserButton;
	}
	
	public WebElement getUserFirstName() {
		return userFirstName;
	}
	
	public WebElement getUserLastName() {
		return userLastName;
	}
	
	public WebElement getUserEmail() {
		return userEmail;
	}
	
	public WebElement getSaveUserButton() {
		return saveUserButton;
	}
	
	public WebElement getNewUserName() {
		return newUserName;
	}
	
	public WebElement getNewUserPassword() {
		return newUserPassword;
	}
	
	public WebElement getDoneButton() {
		return doneButton;
	}
	
	public WebElement getFirstUserFirstName() {
		return firstUserFirstName;
	}
	
	public WebElement getFirstUserEditButton() {
		return firstUserEditButton;
	}
	
	public void getUserRole() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(userRole).build().perform();
		List<WebElement> selectUserRole = driver.findElements(By.className("Select-input"));
		WebElement secondRole = selectUserRole.get(1);
		act.click(secondRole).build().perform();
	}
	
	public void getUserTeam() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(userTeam).build().perform();
		List<WebElement> selectUserTeam = driver.findElements(By.className("Select-input"));
		WebElement secondTeam = selectUserTeam.get(1);
		act.click(secondTeam).build().perform();
	}
	
	//constructor
	public UsersTabFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
