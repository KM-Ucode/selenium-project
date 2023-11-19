package com.ucode_academy.test.test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected2 {
    public static void main(String[] args) throws InterruptedException {

        // isSelected() -> To check if Radio button is selected.
        // Return type is boolean,if checked/selected returns true else returns false.
        // First we need to locate radio button

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/radio.html");

        Thread.sleep(3000);

        WebElement option1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));

        // should return false
        System.out.println(option1.isSelected());

        Thread.sleep(2000);

        //select radio button option 1
        option1.click();

        //after clicking on it, should return true
        System.out.println(option1.isSelected());

        Thread.sleep(3000);

        driver.quit();




    }
}
