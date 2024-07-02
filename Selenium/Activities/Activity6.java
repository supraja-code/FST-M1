package activities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {

	public static void main(String[] args) {
		
		WebDriver driver =  new FirefoxDriver();
		
		Actions builder = new Actions(driver);
		
		driver.get("https://v1.training-support.net/selenium/input-events");
		
		System.out.println(driver.getTitle());
		
		builder.sendKeys("S").build().perform();
		
		builder
		.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.sendKeys("c")
		.keyUp(Keys.CONTROL)
		.build()
		.perform();
		
		driver.close();

	}

}
