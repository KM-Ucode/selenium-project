package com.ucode_academy.test.test_classes;

import com.ucode_academy.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait2 extends TestBase {

    //titleIs("text"); -> waits until title is equal specified text

    //titleContains("text"); -> waits until title contains specified text

    //urlContains("text"); -> waits until URL contains specified text

    //elementToBeClickable(Web element); -> waits for specified web element to be clickable

    //elementToBeSElected(Web element); -> wait for specified element to be selected(checkbox/
    //                                    radio button)

    //visibilityOf(Web element); -> waits for visibility of element (element that is present,
    // but not visible)
    @Test
    public void titleIsTitleContains(){
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("java"+ Keys.ENTER);

        // titleIs();
        wait.until(ExpectedConditions.titleIs("java - Google Search"));
        System.out.println(driver.getTitle());

        // refresh the page
        driver.navigate().refresh();

        // titleContains();
        wait.until(ExpectedConditions.titleContains("java"));
        System.out.println(driver.getTitle());

        // refresh the page
        driver.navigate().refresh();

        //urlContains
        wait.until(ExpectedConditions.urlContains("java"));
        System.out.println(driver.getCurrentUrl());

    }
}
