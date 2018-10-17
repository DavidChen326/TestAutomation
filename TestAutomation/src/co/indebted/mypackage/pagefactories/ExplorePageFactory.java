package co.indebted.mypackage.pagefactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplorePageFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"navbarResponsive\"]/ul[1]/li[5]/a")
	WebElement analyseTab;
	
	//steps
	public String getTitle() {
		return driver.getTitle();
	}
	
	//actions
	public void clickAnalyse() {
		analyseTab.click();
	}
	
	//constructor
	public ExplorePageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
