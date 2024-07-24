package jobBoardSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
	}
	
	@Test
	public void verifyWebsiteHeadingTest() {
		
		String URL = "https://alchemy.hguy.co/jobs";
		
		driver.get(URL);
		
		String Heading = driver.findElement(By.cssSelector("h1.entry-title")).getText();
		
		Assert.assertEquals(Heading, "Welcome to Alchemy Jobs");
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
