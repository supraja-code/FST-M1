package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {

	public static void main(String[] args) {
		
		WebDriver driver =  new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		WebElement toggleButton = driver.findElement(By.id("toggleCheckbox"));
        toggleButton.click();
        
        WebElement dynamicBox = driver.findElement(By.id("dynamicCheckbox"));
        wait.until(ExpectedConditions.invisibilityOf(dynamicBox));
        System.out.println(dynamicBox.isDisplayed());
        
        toggleButton.click();
        
        wait.until(ExpectedConditions.visibilityOf(dynamicBox));
        System.out.println(dynamicBox.isDisplayed());

        driver.close();
		
	}

}
