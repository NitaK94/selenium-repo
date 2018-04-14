package com.actitime.genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class SamplerListner  implements ITestListener{
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		String TestName = result.getMethod().getMethodName();
		EventFiringWebDriver ed = new EventFiringWebDriver(BaseClass.driver);
		File src =  ed.getScreenshotAs(OutputType.FILE);
		File dst = new File("./ScreentShot/"+TestName+".png");
		try {
			FileUtils.copyFile(src, dst);
		   } catch (IOException e) {
			
		    }
	}
	
	
	
	
	

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
 
}
