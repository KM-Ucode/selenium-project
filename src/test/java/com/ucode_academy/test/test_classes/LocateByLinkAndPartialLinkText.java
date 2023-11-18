package com.ucode_academy.test.test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkAndPartialLinkText {
    public static void main(String[] args) throws InterruptedException{

        // Locate Web element by Link Text & Partial Link Text

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Locating by link text
        //WebElement linkText = driver.findElement(By.linkText("A/B Testing"));

        //linkText.click();

        //WebElement linkText = driver.findElement(By.linkText("A/B Testing"));
        WebElement partialLinkText = driver.findElement(By.partialLinkText("A/B"));

        partialLinkText.click();

        Thread.sleep(3000);

        driver.quit();

        Thread.sleep(3000);

        driver.quit();
    }
}
