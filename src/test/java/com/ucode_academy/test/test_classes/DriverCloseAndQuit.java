package com.ucode_academy.test.test_classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        // this window is used to open a new tab
        ((JavascriptExecutor)driver).executeScript("window.open('', '_blank');");
        Thread.sleep(3000);

        //driver.close();
        driver.quit();


        /*
        driver.close() vs driver.quit()
        driver.close() -> closes the current window/tab where the driver is in, but it doesn't
        end the session
        driver.quit() -> closes all windows/tabs and ends the driver session
         */
    }
}
