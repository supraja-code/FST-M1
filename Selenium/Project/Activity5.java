package jobBoardSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {

	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
	}
	
	@Test
	public void navigateToAnotherPageTest() {
		String URL = "https://alchemy.hguy.co/jobs";
		
		driver.get(URL);
		
		driver.findElement(By.linkText("Jobs")).click();
		
		Assert.assertEquals(driver.getTitle(), "Jobs – Alchemy Jobs");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
