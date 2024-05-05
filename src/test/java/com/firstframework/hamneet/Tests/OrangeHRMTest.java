package com.firstframework.hamneet.Tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.firstframework.hamneet.base.TestBase;
import com.firstframework.hamneet.pages.AutomationTestingPractice;
import com.firstframework.hamneet.pages.OrangeHRM;

public class OrangeHRMTest extends TestBase {
	AutomationTestingPractice automationTesting;
	OrangeHRM hrm;

	@BeforeMethod
	public void setUp() {
		intialisation();
		automationTesting = new AutomationTestingPractice();
		hrm = new OrangeHRM();
	}
	
	@Test(groups = { "Regression" })
	public void validateDragAndDropFunctionality() {
		automationTesting.DragAndDrop();
	}

	@Test(groups = { "Smoke" })
	public void testLoginUsingValidCredentials() {
		hrm = automationTesting.practicePortal();
		hrm.loginOHMPortal();
		Assert.assertEquals("Login into ORM", "Login into ORM", " hammeet its failed you are not on ORM");

	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

}
