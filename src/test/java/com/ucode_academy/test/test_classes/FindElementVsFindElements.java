package com.ucode_academy.test.test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementVsFindElements {
    public static void main(String[] args) throws InterruptedException {

    // find element() -> This method is used to locate/find a single web element
    // If it doesn't find/locate the web element, it will throw NoSuchElementException
    // Return type WebElement

    // findElements() -> This method is used to locate/find list of WebElement
    // If it doesn't find/locate web elements, it will not throw any Exception, it just returns empty list
    // Return type List of WebElements

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();

    driver.get("https://the-internet.herokuapp.com/");

    Thread.sleep(2000);

    WebElement singleElement = driver.findElement(By.xpath("//li/a[text()='Checkboxes']"));

    singleElement.click();
    Thread.sleep(2000);

    driver.navigate().back();

    Thread.sleep(2000);

    List<WebElement> allElements = driver.findElements(By.xpath("//li/a"));

        System.out.println(allElements.size());

        for(WebElement eachElement : allElements){
            System.out.println(eachElement.getText());

            if (eachElement.getText().equals("Typos")){
                eachElement.click();
                break;
            }
        }
        Thread.sleep(3000);

        driver.quit();

    }
}