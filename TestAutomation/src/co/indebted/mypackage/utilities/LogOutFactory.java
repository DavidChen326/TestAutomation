package co.indebted.mypackage.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogOutFactory {
	
	WebDriver driver;
	
	public void logOut() {
		
	//click name
	driver.findElement(By.cssSelector("#navbarDropdownMenuLink")).click();
	
	//click sign out
	driver.findElement(By.cssSelector("#navbarResponsive > ul.nav.navbar-nav.float-right.mr-0.hidden-sm-down > li.nav-item.dropdown.show > div > a:nth-child(4)")).click();
	}
	
	//constructor
	public LogOutFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
