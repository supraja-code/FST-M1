package jobBoardSystem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Test
	public void createNewJobListingTest() {
		
		String jobTitle = "TestTitle";
		
		String URL = "https://alchemy.hguy.co/jobs";
		
		driver.get(URL);
		
		//Click on post a Job
		driver.findElement(By.linkText("Post a Job")).click();
		
		//Fill in the details
		driver.findElement(By.xpath("//input[@id='create_account_email']")).sendKeys("demo@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys(jobTitle);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='job_description_ifr']"));
				
		driver.switchTo().frame(iframe);
				
		driver.findElement(By.xpath("//body[@data-id='job_description']")).sendKeys("TestDescription");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@id='application']")).sendKeys("applicaiton@app.com");
		
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("DemoName");
		
		//Click on Preview
		driver.findElement(By.xpath("//input[@value='Preview']")).click();
		
		//Click on submit listing
		driver.findElement(By.xpath("//input[@value='Submit Listing']")).click();
		
		//Click on Jobs
		driver.findElement(By.linkText("Jobs")).click();
		
		//Verify Job is listed
		driver.findElement(By.id("search_keywords")).sendKeys(jobTitle);
		
		driver.findElement(By.xpath("//div[@class='search_submit']/input")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//ul[@class='job_listings']//h3")).getText(), jobTitle);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
