package com.smallbird.backend.platform;

import org.testng.TestNG;


public class Deno {
    public static void main(String[] args) {
        TestNG testNG=new TestNG();
        testNG.setTestClasses(new Class[] {SmallBirdApplicationTests.class});
        testNG.run();
    }
}
