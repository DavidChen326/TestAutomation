package co.indebted.mypackage.pagefactories.analyse;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnalysePageFactory {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/b")
	WebElement firstCategoryHeader;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[1]/div/div[2]/li")
	List<WebElement> firstCategoryList;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/b")
	WebElement secondCategoryHeader;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div[2]/div/div[2]/li")
	List<WebElement> secondCategoryList;
	
	@FindBy(className = "selected")
	WebElement defaultSelectedReport;
	
	//steps
	public String getTitle() {
		return driver.getTitle();
	}
	
	public String getFirstCategoryHeader() {
		return firstCategoryHeader.getText();
	}
	
	public String getDefaultSelectedReportName() {
		return defaultSelectedReport.getText();
	}
	
	//actions
	public void getAndClickFirstCategoryList() throws InterruptedException {
		try {
			for (WebElement element : firstCategoryList) {
				element.click();
				Thread.sleep(7000);
			}
		}
		catch(Error e){
			System.out.println("Failed to find reports in the first category list");
		}
	}
	
	public String getSecondCategoryHeader() {
		return secondCategoryHeader.getText();
	}
	
	public void getAndClickSecondCategoryList() throws InterruptedException {
		try {
			for (WebElement element : secondCategoryList) {
				element.click();
				Thread.sleep(7000);
			}
		}
		catch(Error e){
			System.out.println("Failed to find reports in the second category list");
		}
	}
	
	//constructor
	public AnalysePageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
