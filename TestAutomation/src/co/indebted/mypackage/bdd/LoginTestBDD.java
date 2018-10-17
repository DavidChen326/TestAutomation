package co.indebted.mypackage.bdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestBDD {

	WebDriver driver;
	
	@Given ("^user is on the login page$")
	public void user_is_on_the_login_page(){
		String browserType = "firefox";
		driver = co.indebted.mypackage.utilities.DriverFactory.open(browserType);
		driver.get("https://app.indebted-staging.co/");
	}
	
	@When ("^user enters email (.*)$")
	public void user_enters_email(String email){
		driver.findElement(By.xpath("//*[@id=\"session_email\"]")).sendKeys(email);
	}
	
	@And ("^user enters password (.*)$")
	public void user_enters_password(String password){
		driver.findElement(By.xpath("//*[@id=\"session_password\"]")).sendKeys(password);
	}
	
	@And ("^user clicks login button$")
	public void user_clicks_login_button(){
		driver.findElement(By.xpath("/html/body/form/button")).click();
	}
	
	@Then ("^user logged in to the platform$")
	public void user_logged_in_to_the_platform(){
		String title = driver.getTitle();
		try {
			Assert.assertEquals(title, "Explore • InDebted");
		}
		catch(AssertionError ex){
			System.out.println("Error: Explore • InDebted does not matched");
		    throw ex;
		}
	}
	
	@After
	public void closeDown() {
		driver.close();
	}
}
