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

public class Activity9 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Test
	public void createJobListingUsingBackendTest() {
		
		String URL = "https://alchemy.hguy.co/jobs/wp-admin";
		
		driver.get(URL);
		
		//Enter user name and password
		
		driver.findElement(By.id("user_login")).sendKeys("root");
		
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		
		driver.findElement(By.id("wp-submit")).click();
		
		//Verify Login
		Assert.assertTrue(driver.findElement(By.linkText("Alchemy Jobs")).isDisplayed(), "User is not logged in");
		
		//Click on Job listings
		driver.findElement(By.xpath("//div[contains(text(),'Job Listings')]")).click();
		
		//Click on Add New
		driver.findElement(By.linkText("Add New")).click();
		
		//Closing the pop up
		if(driver.findElement(By.xpath("//div[@class='edit-post-welcome-guide__page']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@aria-label='Close dialog']")).click();
		}
		
		//Fill in the necessary details
		driver.findElement(By.xpath("//textarea[@id='post-title-0']")).sendKeys("Job Title Test");
		
		//Click on Publish
		driver.findElement(By.xpath("//button[contains(text(),'Publish')][1]")).click();
		
		//Click on View Posts
		driver.findElement(By.xpath("//a[@aria-label='View Posts']")).click();
		
		//Assert
		Assert.assertEquals(driver.findElement(By.xpath("//a[@class='tips job_title'][1]")).getText(), "Job Title Test");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
