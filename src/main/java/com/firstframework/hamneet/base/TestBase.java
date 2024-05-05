

package com.firstframework.hamneet.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;
import com.firstframework.hamneet.Listners.WebDriverEvent;

@SuppressWarnings("deprecation")
public class TestBase {
	public static WebDriver wd;
	FileInputStream fileInputStream;
	Properties prop;
	private WebDriverEvent events;
	private EventFiringWebDriver FDriver;
	public static Logger logger;

	public TestBase() {
		prop = new Properties();
		try {
			fileInputStream = new FileInputStream(
					"C:\\Users\\hamne\\OneDrive\\Desktop\\Java\\hamneet\\src\\main\\java\\com\\firstframework\\hamneet\\Config\\Config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fileInputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@BeforeClass
	public void setUpLogger() {
		logger = Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();
		logger.setLevel(Level.ALL);

	}

	public void intialisation() {
		String browserName = prop.getProperty("browser");
		switch (browserName) {
		case "chrome":
			wd = new ChromeDriver();
			break;
		case "Edge":
			wd = new EdgeDriver();
			break;
		case "Firefox":
			wd= new FirefoxDriver();
			break;

		default:
			System.out.println("Not a valid browser name");
			break;
		}
		FDriver = new EventFiringWebDriver(wd);
		events = new WebDriverEvent();
	    FDriver.register(events);
		wd = FDriver;

		wd.get(prop.getProperty("url"));
		wd.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("IMPLICT_WAIT")), TimeUnit.SECONDS);
		wd.manage().window().maximize();
	}

	public void tearDown() {
		wd.quit();
	}

}
