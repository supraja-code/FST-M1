from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")

    print(driver.title)

    textField = driver.find_element(By.XPATH, "//div[@id='dynamicText']")

    print("Text field is enabled: ", textField.is_enabled())

    driver.find_element(By.XPATH,"//button[contains(text(),'Enable Input')]").click()

    print("Text field is enabled: ", textField.is_enabled())

    driver.close()

