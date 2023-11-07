package com.ucode_academy.test.day_06_checkbox_radiobtn_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        WebElement optionsDropdown = driver.findElement(By.cssSelector("#dropdown"));

        Select select = new Select(optionsDropdown);

        /*
        selecting dropdowns:
        1- by value (the best option to use)
        2- by visible text
        3- by index
         */


//        select.selectByVisibleText("Option 2");
//        select.selectByIndex(1);
//        select.selectByValue("2");

        //selects the first option from dropdown
        select.getFirstSelectedOption();

        //returns selected options from select dropdown
//        select.getAllSelectedOptions();

        //deselect selected values

        select.deselectAll();

        //selects the first option from dropdown
        select.getFirstSelectedOption();











    }
}
