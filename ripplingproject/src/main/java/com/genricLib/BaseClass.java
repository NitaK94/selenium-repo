package com.genricLib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public  WebDriver driver;
	
	  @BeforeClass
	    public void configBC() throws Throwable
	      {
		    CommonUtil g = new CommonUtil();
		    /* take browser from properties file*/
		     Properties p = g.getdropdataObj();
		     String pBrowser = p.getProperty("browser");
		     
		  if(pBrowser.equals("FireFox"))
		      {
			    driver = new FirefoxDriver();
		      }
		  
		  else if(pBrowser.equals("chrome"))
		     {
			    System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
				driver = new ChromeDriver();
		     }
		  
		  else if(pBrowser.equals("ie"))
		   {
			  System.setProperty("webDriver.IE.driver","./src/main/resources/IEDriverServer.exe");
			}
		  
		  else
		    {
			  driver = new FirefoxDriver();
		    }
		  Reporter.log("Browser lounch",true);
		 
		}
			
	@BeforeMethod
	   public void  configBM() throws Throwable{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/* take url from properties file*/
		CommonUtil g = new CommonUtil();
		 Properties p = g.getdropdataObj();
		 String url = p.getProperty("urldata");
		 Reporter.log("navigate to Link",true);
		   driver.get(url);
			 
		}
	
	 @AfterMethod
	    public void  configAM()
	     {
		
	     }
	 
	@AfterClass
	 public void  configAC(){
		
		System.out.println("browser close");
		driver.close();
	 }

}
