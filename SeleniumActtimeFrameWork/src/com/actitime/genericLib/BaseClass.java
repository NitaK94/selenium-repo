package com.actitime.genericLib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectropositorLib.Common;
import com.actitime.objectropositorLib.Login;

public class BaseClass {
	public static WebDriver driver;
	CommonUtility cp = new CommonUtility();
      @BeforeClass
      public void configBC() throws Throwable{
    	  
    	//System.setProperty("Webdriver.chromeDriver.exe", "./resource/chromedriver.exe");
    	driver = new  FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	Properties pro = cp.getpropertiesData();
  	  String urldata = pro.getProperty("urldata");
  	  driver.get(urldata);
    	
    	  
      }
      @BeforeMethod
      public  void configBM() throws Throwable{
    	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 Properties pro = cp.getpropertiesData();
    	  String username = pro.getProperty("username"); 
    	  String password = pro.getProperty("password");
    	  Login cm = PageFactory.initElements(driver,Login.class);
    	  cm.login(username, password);
    	  
      }
      @AfterMethod
      public void configAM(){
    	  Common cm = PageFactory.initElements(driver,Common.class);
    	  cm.common();
    	  
      }
      @AfterClass
      public void configAC(){
    	  driver.close();
    	  
      }
}
