package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/login-form");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//Verifying login 
		String message = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Login message: " + message);
		
		driver.close();
		
	}

}
