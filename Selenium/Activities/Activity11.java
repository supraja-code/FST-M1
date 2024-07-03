package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		
		WebDriver driver =  new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@class='willDisappear']"));
		
		System.out.println("check box is selected: "+checkbox.isSelected());
		
		checkbox.click();
		
		wait.until(ExpectedConditions.elementSelectionStateToBe(checkbox,true));
		
		System.out.println("check box is selected: "+checkbox.isSelected());
		
		driver.close();

	}

}
