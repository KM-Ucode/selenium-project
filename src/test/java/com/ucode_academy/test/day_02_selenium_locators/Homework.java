package com.ucode_academy.test.day_02_selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.navigate().to("https://www.etsy.com/");

        Thread.sleep(3000);

        WebElement searchButton = driver.findElement(By.id("global-enhancements-search-query"));
        searchButton.sendKeys("Java");
        searchButton.click();

        Thread.sleep(3000);

        String actualTitle = driver.getTitle();

        System.out.println("Title of the page: " + actualTitle);

        driver.quit();




    }
}
