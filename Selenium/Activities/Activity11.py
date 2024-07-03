from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Firefox() as driver:
    
    driver.get("https://v1.training-support.net/selenium/dynamic-controls")

    print(driver.title)

    wait = WebDriverWait(driver, 10)

    checkbox = driver.find_element(By.XPATH, "//input[@class='willDisappear']")

    print("Checkbox is selected: ", checkbox.is_selected())

    checkbox.click()

    wait.until(expected_conditions.element_selection_state_to_be(checkbox,True))

    print("Checkbox is selected: ", checkbox.is_selected())

    driver.close()

