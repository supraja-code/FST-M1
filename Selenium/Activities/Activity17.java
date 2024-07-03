package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {

		WebDriver driver =  new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/selects");
		
		System.out.println(driver.getTitle());
		
		WebElement dropdown = driver.findElement(By.id("single-select"));

        Select singleSelect = new Select(dropdown);

        singleSelect.selectByVisibleText("Option 2");

        System.out.println("Second option: " + singleSelect.getFirstSelectedOption().getText());

        singleSelect.selectByIndex(3);
       
        System.out.println("Third option: " + singleSelect.getFirstSelectedOption().getText());

        singleSelect.selectByValue("4");
        
        System.out.println("Fourth option: " + singleSelect.getFirstSelectedOption().getText());

        List<WebElement> allOptions = singleSelect.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }

        driver.close();
	}

}
