package co.indebted.mypackage.pagefactories.settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildTabFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/li[9]/a")
	WebElement buildTab;
	
	
	//get elements
	public WebElement getBuildTab() {
		return buildTab;
	}
	
	//constructor
	public BuildTabFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
