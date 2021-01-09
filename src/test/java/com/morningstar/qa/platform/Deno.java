package com.morningstar.qa.platform;

import org.testng.TestNG;
import org.testng.annotations.Listeners;


public class Deno {
    public static void main(String[] args) {
        TestNG testNG=new TestNG();
        testNG.setTestClasses(new Class[] {SmallBirdApplicationTests.class});
        testNG.run();
    }
}
