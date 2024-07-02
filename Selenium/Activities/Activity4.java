package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		
		WebDriver driver =  new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/target-practice");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//h3[@id='third-header']")).getText());
		
		System.out.println(driver.findElement(By.xpath("//h5[contains(text(),'Fifth header')]")).getCssValue("color"));
		
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class"));
		
		System.out.println(driver.findElement(By.xpath("//button[@class='ui grey button']")).getText());
		
		driver.close();

	}

}
