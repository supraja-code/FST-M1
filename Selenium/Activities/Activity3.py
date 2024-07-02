from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    
    driver.get("https://v1.training-support.net/")

    print(driver.title)

    driver.find_element(By.XPATH, "//a[@id='about-link']").click()

    print("About page title is: ", driver.title)

    #driver.close()

    driver.get("https://v1.training-support.net/selenium/login-form")

    print(driver.title)

    driver.find_element(By.XPATH, "//input[@id='username']").send_keys("admin")
    driver.find_element(By.XPATH, "//input[@id='password']").send_keys("password")
    driver.find_element(By.XPATH,"//button[text()='Log in']").click()

    #Verifying login
    message = driver.find_element(By.XPATH,"//div[@id='action-confirmation']")
    print("Login message: ",message.text)

    driver.close()