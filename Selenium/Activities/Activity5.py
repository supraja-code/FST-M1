from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    
    driver.get("https://v1.training-support.net/selenium/input-events")

    actions = webdriver.ActionChains(driver)

    print(driver.title)

    actions.click().perform()

    print(driver.find_element(By.CLASS_NAME,"active").text)

    actions.double_click().perform()

    print(driver.find_element(By.CLASS_NAME,"active").text)
    
    actions.context_click().perform()

    print(driver.find_element(By.CLASS_NAME,"active").text)

    driver.close()
