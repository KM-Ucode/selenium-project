package com.ucode_academy.test.test_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElementByXpathXpathTypes {
    public static void main(String[] args) throws  InterruptedException {

        /*
        Locate elements by Xpath
        There are two type of XPath: Absolute XPath & Relative Xpath

	1. Absolute xpath starts with single slash (/) and has the complete path beginning from
	   the root(beginning of HTML) to the element which we want to locate.
	   Ex:  /html/body/div[2]/div/ul/li[1]/a
	   Absolute xpath IS NOT reliable or efficient because any change in html structure it will fail

	2. Relative xpath starts with double slash(//), it can search elements anywhere on the webpage,
	   no need to write a long path, and you can start from the middle of HTML DOM structure.
	   Relative xpath is always preferred as it is not a complete path from the root element.
	   Ex: //a[@href='/abtest']
                          */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        Thread.sleep(3000);

        // Locating web element with absolute xpath
        //WebElement absoluteXpath = driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[1]/a"));

        //absoluteXpath.click();

        WebElement relativeXpath = driver.findElement(By.xpath("//a[@href='/abtest']"));

        Thread.sleep(3000);

        driver.quit();


    }
}