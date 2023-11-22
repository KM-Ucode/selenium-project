package com.ucode_academy.test.day_10_js_executor_upload_actions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

    @Test
    public void testHardAssert(){
        //Assert.fail(); It will fail the assertion explicitly
        Assert.assertEquals(2,5);
        System.out.println("Hello World");
        System.out.println("Hello Again");
    }
    @Test
    public void testing(){
        System.out.println("Hello World 2");
    }
}
