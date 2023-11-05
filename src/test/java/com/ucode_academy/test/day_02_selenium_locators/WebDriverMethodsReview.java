package com.ucode_academy.test.day_02_selenium_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsReview {
    public static void main(String[] args) throws InterruptedException {

        // Create driver instance/object

        WebDriver driver = new ChromeDriver();

        // load/navigate/open given url in chrome browser

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //maximize the browser window

        driver.manage().window().maximize();
        Thread.sleep(2000);

        // get title of the page as a String
        // getTitle() -> this method returns the title of current page as a String. Return type String
        String pageTitle = driver.getTitle();

        System.out.println("Title of the page: "+ pageTitle);

        // get the current page's URL
        // getCurrentUrl() -> this method returns the URL of the current page. Return type String
        String pageUrl = driver.getCurrentUrl();

        System.out.println("Page URL: "+ pageUrl);

        // get page source
        // getPageSource() -> tis methods returns the source page as a String. Return type String
        String pageSource = driver.getPageSource();

        System.out.println("Page source: "+ pageSource);

        //click on web element(button, link etc...)
        // click() -> this method is used to click on web element(button, link etc..) like clicking mouse

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        // enter/type/put text in input/field
        // sendKeys() -> this method is used to type/enter text in input/text area

        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Hello World");

        Thread.sleep(3000);

        driver.quit();
    }

}
