package com.ucode_academy.test.day_02_selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {

        //Header verification
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        //3. Verify header text
        //Expected: "Log in to ZeroBank"

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.navigate().to("http://zero.webappsecurity.com/login.html");
        WebElement hText = driver.findElement(By.className("page-header"));
        System.out.println(hText.getText());

        Thread.sleep(3000);

        // how to verify header text?

        driver.quit();

    }
}
