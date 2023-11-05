package com.ucode_academy.test.day_02_selenium_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

    }
}
