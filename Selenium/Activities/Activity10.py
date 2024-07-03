from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Firefox() as driver:
    
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")

    print(driver.title)

    wait = WebDriverWait(driver, 10)

    checkbox = driver.find_element(By.CLASS_NAME, "willDisappear")

    print("Checkbox is displayed: ", checkbox.is_displayed())

    driver.find_element(By.ID,"toggleCheckbox").click()

    wait.until(expected_conditions.invisibility_of_element_located(checkbox))

    print("Checkbox is displayed: ", checkbox.is_displayed())

    driver.close()

