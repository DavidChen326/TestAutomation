package co.indebted.mypackage.ddt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(value = Parameterized.class)

public class CheckStatues {

	WebDriver driver;
	String assembly_id;
	
	@Before
	public void setUp () {
		String browserType = "chrome";
		driver = co.indebted.mypackage.utilities.DriverFactory.open(browserType);
	}
	
	@Test
	public void CheckTest() throws InterruptedException, IOException {
		
		driver.get("https://management.promisepay.com/#/login");
		driver.findElement(By.id("login")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"promisepay-page\"]/div/div[2]/form/div[3]/div/div[1]/div[1]/input")).click();
		
		Thread.sleep(5000);
		
		driver.get("https://management.promisepay.com/#/items/" + assembly_id);
		
		Thread.sleep(5000);
		
		String status = driver.findElement(By.xpath("//*[@id=\"card-content-area\"]/form/div/div[1]/div[5]/input")).getAttribute("value").toString();;
		
		String ins = driver.findElement(By.xpath("//*[@id=\"card-content-area\"]/form/div/div[1]/div[6]/input")).getAttribute("value").toString();
		
		
		//write in .txt file
		File file = new File ("PN.txt");
			try {
				PrintWriter outputStream = new PrintWriter(new FileWriter (file, true));
				
				outputStream.println(status + "," + ins);
				outputStream.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
		
	}
	
	@After
	public void closeDown () {
		driver.close();
	}
	
	//pass parameters into test method via constructor
	@Parameters
	public static List<String[]> getData(){
		return co.indebted.mypackage.utilities.CSV.get(".csv");
	}
	
	//constructor
	public CheckStatues(String assembly_id) {
		this.assembly_id = assembly_id;
	}
}
