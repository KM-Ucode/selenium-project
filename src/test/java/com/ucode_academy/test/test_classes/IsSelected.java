package com.ucode_academy.test.test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
    public static void main(String[] args) throws InterruptedException {

        // isSelected() -> To check if checkbox/Radio button is selected.
        // Return type is boolean,if checked/selected returns true else returns false.
        // First we need to locate checkbox/radio button

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        Thread.sleep(3000);

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        if (!checkbox1.isSelected()){
            checkbox1.click();
           // System.out.println(checkbox1.isSelected());
           // System.out.println("Checkbox 1 is selected");
        }else{
            System.out.println("Checkbox1 is already selected");
            //System.out.println(checkbox1.isSelected());
           // System.out.println("Checkbox 1 is not selected");
            }
        if(!checkbox2.isSelected()){
            checkbox2.click();
            System.out.println("Checked Checkbox 2");
            //System.out.println(checkbox2.isSelected());
            //System.out.println("Checkbox 2 is selected");
        }else{
            System.out.println("Checkbox2 is already selected");
            //System.out.println(checkbox2.isSelected());
           // System.out.println("Checkbox 2 is not selected");
        }
        Thread.sleep(5000);

        driver.quit();

    }
}
