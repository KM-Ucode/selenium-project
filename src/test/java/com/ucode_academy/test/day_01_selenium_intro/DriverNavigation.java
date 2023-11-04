package com.ucode_academy.test.day_01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigation {
    public static void main(String[] args) throws InterruptedException {

        //Creating driver instance
        WebDriver driver = new ChromeDriver();

        //Navigating to url/open google.com in Chrome Browser
        driver.get("https://www.google.com/");

        //Maximize browser Window
        driver.manage().window().maximize();

        //wait for 3 seconds
        Thread.sleep(3000);

        //navigate to given url in the same browser tab
        driver.navigate().to("https://www.amazon.com/");

        //wait for 4 seconds
        Thread.sleep(4000);

        //navigate back to previous page(google.com)
        driver.navigate().back();

        //wait for 3 seconds
        Thread.sleep(3000);

        //navigate forward
        driver.navigate().forward();

        //wait for 3 seconds
        Thread.sleep(3000);

        //refresh the page
        driver.navigate().refresh();

        //close the current browser/tab
        driver.close();



    }
}
