package com.dkatlisLab.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dkatlisLab.Reports.Reports;
import com.dkatlisLab.Reports.WebEventListener;

public class BaseClass extends Reports{
	
	public static WebDriver driver;
	//public static Properties prop;
	public static WebDriverWait wait;
	public static final int TIMEOUT=40;
	public static long PAGE_LOAD_TIMEOUT = 60;
	public static long IMPLICIT_WAIT = 60;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	public static Properties prop;
	
	public BaseClass()
	{

		try 
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/com/dkatlisLab/config/config.properties");
			prop.load(ip);
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	 public  WebDriver initialization() {
		 

			String filePathchrome = System.getProperty("user.dir") + "//src//Driver//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", filePathchrome );
			driver = new ChromeDriver(); 

			e_driver = new EventFiringWebDriver(driver);

			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			eventListener = new WebEventListener();
			e_driver.register(eventListener);
			driver = e_driver;

			wait = new WebDriverWait(driver, TIMEOUT);
			System.out.println("Before maximize");
			driver.manage().window().maximize();
			System.out.println("After maximize");
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
			//driver.get(prop.getProperty("url"));
		 
		 return driver;
		 



	}


}
