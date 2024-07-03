from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions

with webdriver.Firefox() as driver:

    wait = WebDriverWait(driver, 10)

    driver.get("https://v1.training-support.net/selenium/dynamic-attributes")

    print(driver.title)

    username = driver.find_element(By.XPATH, "//input[contains(@class, '-username')]")
    
    password = driver.find_element(By.XPATH, "//input[contains(@class, '-password')]")
   
    confirm_password = driver.find_element(By.XPATH, "//label[contains(text(), 'Confirm Password')]//following::input")
    
    email = driver.find_element(By.XPATH, "//input[contains(@class, 'email-')]")

    username.send_keys("NewUser")
    password.send_keys("Password")
    confirm_password.send_keys("Password")
    email.send_keys("real_email@xyz.com")
    
    driver.find_element(By.XPATH, "//button[text()='Sign Up']").click()

    wait.until(expected_conditions.visibility_of_element_located((By.ID, "action-confirmation")))
    
    message = driver.find_element(By.ID, "action-confirmation").text
    print("Success message: ", message)

    driver.close()