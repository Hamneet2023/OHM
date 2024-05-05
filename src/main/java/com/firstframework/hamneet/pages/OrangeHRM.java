package com.firstframework.hamneet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

import com.firstframework.hamneet.base.TestBase;

public class OrangeHRM extends TestBase {
	public OrangeHRM() {
		PageFactory.initElements(wd, this);
	}
	@BeforeMethod
	public void setUp() {
		intialisation();	
	}
	@FindBy(css="input[name=\"username\"]")
	private WebElement userName;
	
	@FindBy(css="input[name=\"password\"]")
	private WebElement password;
	
	@FindBy(css="button[type=\"submit\"]")
	private WebElement submitBtn;
	
	@FindBy(css="span[class=\"oxd-topbar-header-breadcrumb\"]>h6")
	private WebElement successText;
	
	private void enterUserName() {
		userName.sendKeys("Admin");
	}
	
	private void enterPassword() {
		password.sendKeys("admin123");
	}

	private OrangeHRM clickSubmitBtn() {
		submitBtn.click();
		return new OrangeHRM();
	}
	
	public String accountHasBeenCreatedGetText() {
		return successText.getText();
	}
	
	public void loginOHMPortal() {
		enterUserName();
		enterPassword();
		clickSubmitBtn();
		accountHasBeenCreatedGetText();
	}
}
