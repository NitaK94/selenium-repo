package com.actitime.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
      @BeforeClass
      public void configBC(){
    	//System.setProperty("Webdriver.chrome.driver", "./resource/chromedriver.exe");
    	driver = new  FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	  
      }
      @BeforeMethod
      public void configBM(){
    	  
      }
      @AfterMethod
      public void configAM(){
    	  
      }
      @AfterClass
      public void configAC(){
    	  driver.close();
    	  
      }
}
