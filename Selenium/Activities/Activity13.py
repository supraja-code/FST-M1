from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    
    driver.get("https://v1.training-support.net/selenium/tables")

    print(driver.title)

    rows = driver.find_elements(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr")
    print("Number of rows: ", len(rows))

    columns = driver.find_elements(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr[1]/td")
    print("Number of columns: ", len(columns))
    

    third_row = driver.find_elements(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr[3]/td")
   
    print("Cell values of third row:")
    for row in third_row:
        print("Cell value: ", row.text)

    second_row_second_cell = driver.find_element(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]")

    print("Cell value at second row and second column: ", second_row_second_cell.text)

    driver.close()