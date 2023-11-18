package com.ucode_academy.test.test_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.chrono.ChronoPeriod;

public class GetPageTitleAndUrl {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        /* getTitle() -> this method is one of the WebDriver method that is used to get
        the title of the current page, and return type is String
         */

        String title = driver.getTitle();

        System.out.println(title);
        System.out.println(driver.getTitle());

        System.out.println("=========================================");

        /* getCurrentUrl() -> this method is one of the WebDriver method that is used to get
        current url of the page. Return type is String
         */

        String url = driver.getCurrentUrl();
        System.out.println(url);

    }
}
