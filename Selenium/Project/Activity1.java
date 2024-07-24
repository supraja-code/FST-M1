package jobBoardSystem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
	}

	@Test
	public void verifyWebsiteTitleTest() {
		
		String URL = "https://alchemy.hguy.co/jobs";
		
		driver.get(URL);
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Alchemy Jobs – Job Board Application");			
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}

