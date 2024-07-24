package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Example1 {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@Before
	public void setup() {
		
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Given("User is on DuckDuckGo website")
	public void user_is_on_DuckDuckGo_website() {
		
		driver.get("https://duckduckgo.com/");
		Assert.assertEquals("",driver.getTitle());
		
	}
	
	@When("User searches for cheese")
	public void user_searches_for_cheese() {
		
		driver.findElement(By.id("searchbox-input")).sendKeys("Cheese");
		driver.findElement(By.cssSelector("button.iconButton_button__6x_9C.searchbox_searchButton__F5Bwq")).click();
	}
	
	@Then("User should see search results")
	public void user_should_see_search_results() {
		System.out.println("Results");
	}
	
}
