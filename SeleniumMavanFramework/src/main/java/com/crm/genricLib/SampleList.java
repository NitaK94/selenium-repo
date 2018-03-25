package com.crm.genricLib;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleList implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}



	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		String testname = result.getMethod().getMethodName();
		EventFiringWebDriver ed = new EventFiringWebDriver(BaseClass.driver);
		File scrfile = ed.getScreenshotAs(OutputType.FILE);
		File dstfile = new File("./screenshot/"+testname+".png");
		try{
			FileUtils.copyFile(scrfile, dstfile);
		}
		catch(Exception e){
			
		}
		
	}


}

