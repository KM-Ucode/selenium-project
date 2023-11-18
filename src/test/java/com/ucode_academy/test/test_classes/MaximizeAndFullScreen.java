package com.ucode_academy.test.test_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeAndFullScreen {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        //maximize() -> this method is used to maximize your window/browser window to the standard window frame


        Thread.sleep(2000);
        driver.manage().window().maximize();

        // fullscreen() this method is used to full screen your browser window

        //driver.manage().window().fullscreen();
    }
}
