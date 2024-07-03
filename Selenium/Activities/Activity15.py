from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Firefox() as driver:

    wait = WebDriverWait(driver, 10)

    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")

    print(driver.title)

    driver.find_element(By.XPATH, "//input[starts-with(@class, 'username-')]").send_keys("admin")

    driver.find_element(By.CSS_SELECTOR, "input[class^='password-']").send_keys("password")

    driver.find_element(By.XPATH, "//button[@type='submit']").click()

    wait.until(expected_conditions.visibility_of_element_located((By.ID, "action-confirmation")))

    print(driver.find_element(By.ID, "action-confirmation").text)

    driver.close()