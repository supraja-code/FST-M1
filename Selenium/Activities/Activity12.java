package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {

	public static void main(String[] args) {

		WebDriver driver =  new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		
		System.out.println(driver.getTitle());
		
		WebElement textField = driver.findElement(By.xpath("//div[@id='dynamicText']"));
		
		System.out.println("text field is enabled: "+textField.isEnabled());
		
		driver.findElement(By.xpath("//button[contains(text(),'Enable Input')]")).click();
		
		System.out.println("text field is enabled: "+textField.isEnabled());
		
		driver.close();

	}

}
