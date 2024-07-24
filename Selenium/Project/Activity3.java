package jobBoardSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
	}
	
	@Test
	public void getUrlTest() {

		String URL = "https://alchemy.hguy.co/jobs";
		
		driver.get(URL);
		
		String headerImageURL = driver.findElement(By.xpath("//div[@class='post-thumb-img-content post-thumb']//img")).getAttribute("src");
		
		System.out.println(headerImageURL);

	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
