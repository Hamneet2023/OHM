package com.firstframework.hamneet.Listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.firstframework.hamneet.base.TestBase;

public class RetryFailedTestcases extends TestBase implements IRetryAnalyzer {
	int maxCounter = 2;
	int cnt = 0;

	@Override
	public boolean retry(ITestResult result) {
		logger.info("Retrying failed test!!!!!" + result.getMethod().getMethodName() + "for" + cnt + "times");
		if (cnt < maxCounter) {
			cnt++;
			return true;
		}
		return false;
	}

}
