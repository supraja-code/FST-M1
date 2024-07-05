package activities;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity10 {
	private WebDriver driver;
    private WebDriverWait wait;
 
    @BeforeClass
    public void setup() {
         
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
 
        driver.get("https://v1.training-support.net/selenium/simple-form");
    }
 
    public static List<List<Object>> readExcel(String filePath) {
        List<List<Object>> data = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream(filePath);
 
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            for (Row row: sheet) {
                
                List<Object> rowData = new ArrayList<>();
                
                for(Cell cell: row) {
                    if(cell != null) {
                        switch (cell.getCellType()) {
                            case STRING -> rowData.add(cell.getStringCellValue());break;
                            case NUMERIC -> rowData.add(cell.getNumericCellValue());break;
                            case BOOLEAN -> rowData.add(cell.getBooleanCellValue());break;
                        }
                    }
                }
                data.add(rowData);
            }
            file.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
 
    @DataProvider(name = "Registration")
    public static Object[][] signUpInfo() {
        String filePath = "Activity10.xlsx";
        List<List<Object>> data = readExcel(filePath);
        return new Object[][] {
                { data.get(1) },
                { data.get(2) },
                { data.get(3) },
        };
    }
 
    @Test(dataProvider = "Registration")
    public void registrationTest(List<Object> rows) {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        WebElement lastNameField = driver.findElement(By.id("lastName"));
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement phoneNumberField = driver.findElement(By.id("number"));
 
        firstNameField.clear();
        lastNameField.clear();
        emailField.clear();
        phoneNumberField.clear();
 
        firstNameField.sendKeys(rows.get(1).toString());
        lastNameField.sendKeys(rows.get(2).toString());
        emailField.sendKeys(rows.get(3).toString());
        phoneNumberField.sendKeys(rows.get(4).toString());
 
        driver.findElement(By.cssSelector("input.green")).click();
 
        wait.until(ExpectedConditions.alertIsPresent());
 
        Alert message = driver.switchTo().alert();
        
        System.out.println("Alert Message: " + message.getText());
        Reporter.log("Alert Message: " + message.getText());
        message.accept();
 
        driver.navigate().refresh();
    }
 
    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
