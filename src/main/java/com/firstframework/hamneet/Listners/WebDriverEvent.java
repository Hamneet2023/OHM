package com.firstframework.hamneet.Listners;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.firstframework.hamneet.base.TestBase;

public class WebDriverEvent extends TestBase implements WebDriverEventListener {

	@Override
	public void beforeAlertAccept(WebDriver driver) {
         logger.info("beforeAlert Accepted");
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		logger.info("afterAlert Accepted");
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		logger.info("afterDismissing Alert");
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		logger.info("beforeDismissing Alert");
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		logger.info("before Navigating to URL: " + url);
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		logger.info("after Navigating to URL: " + url);
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
         logger.info("beforeNavigateBack:");
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		logger.info("afterNavigateBack");
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		logger.info("Navigating from  " + driver.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		logger.info("Navigating from  " + driver.getCurrentUrl());
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		logger.info("beforeNavigateRefresh" + driver.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		logger.info("afterNavigatingRefresh" + driver.getCurrentUrl());
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		logger.info("Finding Element: " + by);
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		logger.info("Finding Element: " + by);
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		logger.info("beforeClicked ON: " + element);
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		logger.info("afterClicked ON: " + element);
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		logger.info("beforeScript: " + script);
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		logger.info("afterScript: " + script);
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		logger.info("beforeSwitchedToWindow: " + windowName);
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		logger.info("afterSwitchedTOWindow: " + windowName);
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		logger.info("beforeGetScreenshotAS!!!! Taking screen taken");
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		logger.info("afterGetScreenshotAS!!!! Taking screen taken");
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		logger.info("beforeGetText: " + element.getText());
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		logger.info("afterGetText: " + element.getText());
		
	}
	

}
