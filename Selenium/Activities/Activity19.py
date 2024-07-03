from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:

    driver.get("https://v1.training-support.net/selenium/javascript-alerts")

    print(driver.title)

    driver.find_element(By.ID, "confirm").click()
   
    confirm_alert = driver.switch_to.alert

    print(confirm_alert.text)

    confirm_alert.accept()
    
    #confirm_alert.dismiss()

    driver.close()