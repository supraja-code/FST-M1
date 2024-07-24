package jobBoardSystem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity6 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Test
	public void applyJobTest() {
		
		String URL = "https://alchemy.hguy.co/jobs";
		
		driver.get(URL);
		
		//Navigate to Jobs
		driver.findElement(By.linkText("Jobs")).click();
		
		Assert.assertEquals(driver.getTitle(), "Jobs – Alchemy Jobs");
		
		driver.findElement(By.id("search_keywords")).sendKeys("Banking");
		
		driver.findElement(By.xpath("//div[@class='search_submit']/input")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Search completed.')]")));
		
		//Select any job
		driver.findElement(By.xpath("//ul[@class='job_listings']//li[1]")).click();
		
		//Click on apply job
		driver.findElement(By.xpath("//input[@value='Apply for job']")).click();
		
		//Print the email
		System.out.println(driver.findElement(By.xpath("//a[@class='job_application_email']")).getText());
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
