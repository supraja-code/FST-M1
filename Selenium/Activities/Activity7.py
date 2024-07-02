from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys

with webdriver.Firefox() as driver:
    
    driver.get("https://v1.training-support.net/selenium/drag-drop")

    actions = webdriver.ActionChains(driver)

    print(driver.title)

    ball = driver.find_element(By.ID, "draggable")
    
    dropzone1 = driver.find_element(By.ID, "droppable")
    dropzone2 = driver.find_element(By.ID, "dropzone2")

    actions.drag_and_drop(ball, dropzone1).perform()
    if(dropzone1.text.find("Dropped!")):
        print("Ball is in dropzone1")

    actions.drag_and_drop(ball, dropzone2).perform()
    if(dropzone2.text.find("Dropped!")):
        print("Ball is in dropzone2")

    driver.close()