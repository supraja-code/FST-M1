package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity18 {

	public static void main(String[] args) {

		WebDriver driver =  new FirefoxDriver();
		
		driver.get("https://v1.training-support.net/selenium/selects");
		
		System.out.println(driver.getTitle());
		
		WebElement selectElement = driver.findElement(By.id("multi-select"));
        
        Select multiSelect = new Select(selectElement);

        multiSelect.selectByVisibleText("Javascript");
        
        for(int i = 4; i<=6 ; i++) {
            multiSelect.selectByIndex(i);
        }
        
        multiSelect.selectByValue("node");
        
        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for(WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

        multiSelect.deselectByIndex(5);
       
        selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for(WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        
        driver.close();

	}

}
