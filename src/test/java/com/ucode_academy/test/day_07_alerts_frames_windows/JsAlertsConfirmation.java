package com.ucode_academy.test.day_07_alerts_frames_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlertsConfirmation {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();

        WebElement confAlertBtn = driver.findElement(By.xpath("//*[text()='Click for JS Confirm']"));

        confAlertBtn.click();

        Thread.sleep(3000);

        //switching to alert

        Alert alert = driver.switchTo().alert();

        alert.dismiss();

        System.out.println(driver.findElement(By.id("result")).getText());

        Thread.sleep(3000);

        driver.quit();

    }
}
