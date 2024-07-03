package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10 {

	public static void main(String[] args) {

		WebDriver driver =  new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.className("willDisappear"));
		
		System.out.println("check box is displayed: "+checkbox.isDisplayed());
		
		driver.findElement(By.id("toggleCheckbox")).click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("willDisappear")));
		
		System.out.println("check box is displayed: "+checkbox.isDisplayed());
		
		driver.close();

	}

}
