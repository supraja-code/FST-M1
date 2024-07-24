package jobBoardSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
	}
	
	@Test
	public void verifyWebsiteSecondHeadingTest() {
		
		String URL = "https://alchemy.hguy.co/jobs";
		
		driver.get(URL);
		
		String secondHeading = driver.findElement(By.xpath("//div[@class='entry-content clear']//h2")).getText();
		
		Assert.assertEquals(secondHeading, "Quia quis non");		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
