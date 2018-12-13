package co.indebted.mypackage.pagefactories.settings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssistTabFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/li[6]/a")
	WebElement assistTab;
	
	@FindBy(name = "field")
	WebElement acknowledgementTextField;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[1]/div/form/div[2]/div[2]/button")
	WebElement acknowledgementSaveButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[2]/div[2]/div/button")
	WebElement newHardshipStageButton;
	
	@FindBy(name = "name")
	WebElement hardshipStageName;
	
	@FindBy(name = "description")
	WebElement hardshipStageDescription;
	
	@FindBy(css = "#app > div > div:nth-child(3) > div.c0120 > div > div > div.c0126 > div > form > div:nth-child(1) > div:nth-child(3) > fieldset > div")
	WebElement hardshipStateOfStageDropDown;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/button")
	WebElement hardshipStageSaveButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[3]/div[2]/div[1]/div[1]")
	WebElement firstHardshipStageName;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div[3]/div[2]/div[2]/img")
	WebElement firstHardshipStageEditButton;
	
	//get elements
	public WebElement getAssistTab() {
		return assistTab;
	}
	
	public WebElement getAcknowledgementTextField() {
		return acknowledgementTextField;
	}
	
	public WebElement getAcknowledgementSaveButton() {
		return acknowledgementSaveButton;
	}
	
	public WebElement getNewHardshipStageButton() {
		return newHardshipStageButton;
	}
	
	public WebElement getHardshipStageName() {
		return hardshipStageName;
	}
	
	public WebElement getHardshipStageDescription() {
		return hardshipStageDescription;
	}
	
	public WebElement getFirstHardshipStageName() {
		return firstHardshipStageName;
	}
	
	public WebElement getFirstHardshipStageEditButton() {
		return firstHardshipStageEditButton;
	}

	public void getHardshipStateOfStageDropDown() {
		//select an option from React dropdown compoment
		Actions act = new Actions(driver);
		act.click(hardshipStateOfStageDropDown).build().perform();
		List<WebElement> selectState = driver.findElements(By.className("Select-input"));
		WebElement firstState = selectState.get(0);
		act.click(firstState).build().perform();
	}
	
	public WebElement getHardshipStageSaveButton() {
		return hardshipStageSaveButton;
	}
	
	//constructor
	public AssistTabFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
