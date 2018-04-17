package com.crm.genricLib;

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

import com.crm.objectrepositryLib.Common;
import com.crm.objectrepositryLib.Login;

public class BaseClass {
	public static WebDriver driver;
	  @BeforeClass (groups ={"Regerssion Test","Smoke Test"})
	   public void configBC() throws Throwable{
		  CommonUtil g = new CommonUtil();
		  Properties p = g.getdropdataObj();
		  String pBrowser = p.getProperty("browser");
		  if(pBrowser.equals("FireFox")){
			  driver = new FirefoxDriver();
		  }
		  else if(pBrowser.equals("chrome")){
			  System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
				driver = new ChromeDriver();
		  }
		  else if(pBrowser.equals("ie")){
			  System.setProperty("webDriver.IE.driver",".\\src\\main\\resources\\IEDriverServer.exe");
			  //driver = new internateExplorDriver();
		  }
		  else{
			  driver = new FirefoxDriver();
		  }
		 
		 
		}
			
	@BeforeMethod(groups ={"Regerssion Test","Smoke Test"})
	public void  configBM() throws Throwable{
		System.out.println("login pass");
		CommonUtil g = new CommonUtil();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Properties p = g.getdropdataObj();
		 String url = p.getProperty("urldata");
		 String name = p.getProperty("username");
			String pwd = p.getProperty("password");
			 driver.get(url);
			 System.out.println("login ");
			 Login log = PageFactory.initElements(driver, Login.class);
			 log.login(name, pwd);

	   
	}
	@AfterMethod(groups ={"Regerssion Test","Smoke Test"})
	public void  configAM(){
		Common cm = PageFactory.initElements(driver, Common.class);
		cm.logout();
	}
	@AfterClass(groups ={"Regerssion Test","Smoke Test"})
	public void  configAC(){
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("browser close");
		driver.close();
	}

}
