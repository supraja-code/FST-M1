from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    
    driver.get("https://v1.training-support.net/selenium/tables")

    print(driver.title)

    rows = driver.find_elements(By.XPATH, "//table[@id='sortableTable']/tbody/tr")
    print("Number of rows: ", len(rows))

    columns = driver.find_elements(By.XPATH, "//table[@id='sortableTable']/thead/tr/th")
    print("Number of columns: ", len(columns))

    second_row_second_cell_before_sort = driver.find_element(By.XPATH, "//table[@id='sortableTable']/tbody/tr[2]/td[2]")

    print("Cell value at second row and second column: ", second_row_second_cell_before_sort.text)

    driver.find_element(By.XPATH, "//table[@id='sortableTable']/thead/tr/th[1]").click()

    second_row_second_cell_after_sort = driver.find_element(By.XPATH, "//table[@id='sortableTable']/tbody/tr[2]/td[2]")
   
    print("Cell value at second row and second column: ", second_row_second_cell_after_sort.text)

    driver.close()