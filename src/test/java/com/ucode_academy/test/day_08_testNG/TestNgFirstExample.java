package com.ucode_academy.test.day_08_testNG;

import org.testng.annotations.*;

public class TestNgFirstExample {
    /*
    @Test
    -Makes annotated method a TestNG test
    -This annotation helps us to run the test w/o main method
    -All tests are independent of each other, unless we create dependency
     */

    @Test
    public void test3(){
        System.out.println("test3");
    }

    @Test  (priority = 2)
    public void test1(){
        System.out.println("test1");
    }

    @Test (priority = 1)
    public void test2(){
        System.out.println("test2");
    }
    /*
    @BeforeMethod
    makes the annotated method to run before each @Test methods.
    Usually used  for setting conditions, getting browsers, pages
     */
    @BeforeMethod
    public void setUp(){
        System.out.println("BeforeMethod");
    }

    /*
    @AfterMethod makes the annotated method to run after each @Test method
    Usually used to close things down, such as closing/quitting the browser
     */

    @AfterMethod
    public void tearDown(){
        System.out.println("AfterMethod");
    }

    /*
    @BeforeClass makes annotated method to run once before all the tests in the class
    @BeforeClass annotation even runs before @BeforeMethod
    Usually it used to set up environments, opening browsers

    -If you want to open just one browser and run all of your tests in that browser, you
    can use th @BeforeClass annotation
    -If you need to open a browser for each test, you need to use the @BeforeMethod annotation
     */

    @BeforeClass
    public void envSetup(){
        System.out.println("@BeforeClass annotation");
    }

    /*
    @AfterClass annotation makes the annotated method run after the all tests in the class
     */

    @AfterClass
    public void cleanUp(){
        System.out.println("AfterClass annotation");
    }


}