package com.ucode_academy.test.test_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitlyWait {

    //Synchronization helps ensure that the automation script interacts with the web page elements
    // at the right time.
    // implicitWAit waits until given time for webElement to be available before it throws
    // NoSUchElementException, as soon as it locates webElement, it doesn't wait for the
    //remaining time
    // If an element is not immediately  present in the DOM(Document Object Model), the
    //implicit wait will wait for a certain amount of time for the element to be present
    //before throwing an NoSUchElementException.
    // Implicit wait is set only once, and it will be applied for the entire session

    @Test

    public void implicitWait(){
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/dynamic_loading");




    }
}
