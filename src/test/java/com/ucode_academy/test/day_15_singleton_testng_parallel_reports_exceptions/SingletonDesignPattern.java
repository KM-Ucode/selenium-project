package com.ucode_academy.test.day_15_singleton_testng_parallel_reports_exceptions;

import com.ucode_academy.utility.ConfigReader;
import com.ucode_academy.utility.Driver;
import com.ucode_academy.utility.Waits;
import org.testng.annotations.Test;

public class SingletonDesignPattern {
    @Test
    public void singleDesignPattern(){

        Driver.getDriver().get(ConfigReader.getProperty("amazon"));
        Waits.wait(3);

        Driver.quitDriver();
    }
}
