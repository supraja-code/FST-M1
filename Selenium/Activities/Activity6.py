from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

with webdriver.Firefox() as driver:
    
    driver.get("https://v1.training-support.net/selenium/input-events")

    actions = webdriver.ActionChains(driver)

    print(driver.title)

    actions.send_keys("S")

    actions.key_down(Keys.CONTROL)

    actions.send_keys("a")

    actions.send_keys("c")

    actions.key_up(Keys.CONTROL)

    actions.perform

    driver.close()