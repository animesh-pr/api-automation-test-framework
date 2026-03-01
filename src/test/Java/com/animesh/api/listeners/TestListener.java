package com.animesh.api.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Allure;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        Allure.addAttachment("Failure Details",
                result.getThrowable().toString());
    }
}