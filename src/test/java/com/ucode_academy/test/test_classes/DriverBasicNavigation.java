package com.ucode_academy.test.test_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverBasicNavigation {
    public static void main(String[] args) throws Exception {


    WebDriver driver = new ChromeDriver(); //chrome driver instance

    // get() opens given URL in browser and waits for the page to load
    driver.get("https://www.google.com/"); // To open given URL
    Thread.sleep(3000);

        // navigate().to() opens given URL in browser, but it does not wait for page to load
        driver.navigate().to("https://www.amazon.com/"); // navigate to given URL
        Thread.sleep(3000);

        // navigate().back() navigates back to previous window
        driver.navigate().back();
        Thread.sleep(3000);

        // navigate().forward() navigates forward to the window that you have been before
        driver.navigate().forward();
        Thread.sleep(3000);

        // this method is used to  refresh the page you are in
        driver.navigate().refresh();
    }
}
