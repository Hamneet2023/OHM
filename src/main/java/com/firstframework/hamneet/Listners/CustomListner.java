package com.firstframework.hamneet.Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.firstframework.hamneet.Utils.Utils;
import com.firstframework.hamneet.base.TestBase;

public class CustomListner extends TestBase implements ITestListener {
	public void onTestStart(ITestResult result) {
		logger.info("Test execution started for " + result.getMethod().getMethodName()+"*****************");
	}

	public void onTestSuccess(ITestResult result) {
		logger.info("Test" + result.getMethod().getMethodName() + "Passed"+"---------------");
	}

	public void onTestFailure(ITestResult result) {
		logger.info("Test execution started for " + result.getMethod().getMethodName() + "failed"+"!!!!!!!!!!!!!!!!!!!");
		Utils.takeScreenShot(result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		logger.info("Test execution started for " + result.getMethod().getMethodName() + "skipped"+"################");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
