package com.morningstar.qa.platform;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyTestResultListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("fail");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("success");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("skip");
    }
}
