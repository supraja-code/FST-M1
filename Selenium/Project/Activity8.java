package jobBoardSystem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Test
	public void loginToBackendTest() {
		
		String URL = "https://alchemy.hguy.co/jobs/wp-admin";
		
		driver.get(URL);
		
		//Enter user name and password
		
		driver.findElement(By.id("user_login")).sendKeys("root");
		
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		
		driver.findElement(By.id("wp-submit")).click();
		
		//Verify Login
		Assert.assertTrue(driver.findElement(By.linkText("Alchemy Jobs")).isDisplayed(), "User is not logged in");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
