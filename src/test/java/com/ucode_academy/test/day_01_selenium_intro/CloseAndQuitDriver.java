package com.ucode_academy.test.day_01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitDriver {
    public static void main(String[] args) throws InterruptedException {

        // Create driver instance
        WebDriver driver = new ChromeDriver();

        // Load/open/navigate google.com in chrome browser
        driver.get("https://www.google.com/");

        // Maximize browser/window
        //driver.manage().window().maximize();

        // browser window full screen mode
        driver.manage().window().fullscreen();

        // wait for 4 seconds
        Thread.sleep(4000);

        // close the current browser/tab
        //driver.close();

        // quit all browsers/tabs that was open during the session
        driver.quit();


    }
}
