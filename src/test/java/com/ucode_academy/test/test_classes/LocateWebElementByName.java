package com.ucode_academy.test.test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementByName {

    public static void main(String[] args) throws InterruptedException {

        // Locate Web Element by name

        WebDriver driver = new ChromeDriver();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        // this way we can locate web element and click on it without storing it
        //driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        // this way, we locate and store it first
        WebElement loginButton = driver.findElement(By.name("ctl00$MainContent$login_button"));
        loginButton.click();

        Thread.sleep(4000);

        driver.quit();
    }
}
