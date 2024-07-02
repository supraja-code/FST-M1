from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    
    driver.get("https://v1.training-support.net/selenium/target-practice")

    print(driver.title)

    print(driver.find_element(By.XPATH, "//h3[@id='third-header']").text)

    print(driver.find_element(By.XPATH, "//h5[contains(text(),'Fifth header')]").value_of_css_property("color"))

    print(driver.find_element(By.XPATH, "//button[contains(text(),'Violet')]").get_attribute("class"))

    print(driver.find_element(By.XPATH, "//button[@class='ui grey button']").text)

    driver.close()