from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    
    driver.get("https://v1.training-support.net/")

    print(driver.title)

    driver.find_element(By.ID, "about-link").click()

    print("About page title is: ", driver.title)

    driver.close()