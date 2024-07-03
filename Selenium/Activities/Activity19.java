package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {

	public static void main(String[] args) {
		
		WebDriver driver =  new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("confirm")).click();

        Alert confirmAlert = driver.switchTo().alert();

        String alertText = confirmAlert.getText();
        System.out.println("Text in alert: " + alertText);

        confirmAlert.accept();
        
        //confirmAlert.dismiss();

        driver.close();
	}

}
