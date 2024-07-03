package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {

	public static void main(String[] args) {

		WebDriver driver =  new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("input[class^='password-']")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.id("action-confirmation")).getText());
		
		driver.close();

	}

}
