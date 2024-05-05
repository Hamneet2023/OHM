package com.firstframework.hamneet.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.firstframework.hamneet.base.TestBase;

public class Utils extends TestBase {
	public static void takeScreenShot(String testName) {
		//Time Stemp
		String timeStamp = new SimpleDateFormat("dd.MM.YYYY.HH.mm.ss").format(new Date());
		System.out.println(timeStamp);
		
		//Take a Screenshot
		File screenshotFile=((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		
		//Save ScreenShot
		try {
			FileHandler.copy(screenshotFile,new File("./FailedTestsScreenshot\\"+ testName+"_" +timeStamp+".jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	}
