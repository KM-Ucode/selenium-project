package com.ucode_academy.test.day_10_js_executor_upload_actions;

import org.testng.annotations.Test;

public class InvocationCount {
    // If you want to run your test or tests for a number of times without any loop,
    //you can use @Test (invocationCount = 10), and give the number how many times you want to run it.


    @Test(invocationCount = 10)
    public void testMethod(){
        System.out.println("Hello World");
    }
}
