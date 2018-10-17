package co.indebted.mypackage.pagefactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnalysePageFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/b")
	WebElement firstCategory;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/b")
	WebElement secondCategory;
	
	//steps
	public String getTitle() {
		return driver.getTitle();
	}
	
	//actions
	public String getFirstCategory() {
		return firstCategory.getText();
	}
	
	public String getSecondCategory() {
		return secondCategory.getText();
	}
	
	//constructor
	public AnalysePageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
