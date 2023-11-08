package com.ucode_academy.test.day_07_alerts_frames_windows;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlertsWarning {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement simpleAlert = driver.findElement(By.xpath("//*[text()='Click for JS Alert']"));
        // clicking the alert button to invoke the pop-up
        simpleAlert.click();

        Thread.sleep(3000);
        // creating the alert instance and switching to it
        Alert alert = driver.switchTo().alert();

        // asking selenium to accept the alert
        alert.accept();

        WebElement result = driver.findElement(By.id("result"));

        System.out.println(result.getText());

        driver.quit();


    }
}
