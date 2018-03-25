package com.crm.genricLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.crm.genricLib.BaseClass;

public class WebdriverCommonLib {
	public void waitForElement(WebElement element){
		int wait = 0;
		while(wait<40){
			try{
				element.click();
				break;
			}catch(Throwable t){
				              try {
					Thread.sleep(1000);
					wait++;
				           } catch (InterruptedException e) {}
			}
		}
	}
	
	
	public void waitForPageLoad(){
		BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void mouseMove(WebElement element){
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(element).perform();
	}
	public void selectVisibleText(WebElement element , String text){
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
		
	}
	
	public void handleAlert(){
		Alert alt = BaseClass.driver.switchTo().alert();
		alt.accept();
	}
	public void handleAlertTryCatch(){
		Alert alt1 = BaseClass.driver.switchTo().alert();
		while(true){
			try{
				
				alt1.accept();
				break;
			}
			catch(Exception ex){
				break;
			}
		}
		
	}
	
	public static  String parentID="";
	public void switchTochildWindow(){
		Set<String> set = BaseClass.driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		 parentID = it.next();
		String childID = it.next();
		BaseClass.driver.switchTo().window(childID);
	}
	
	public void switchBackToParentWindow(){
		BaseClass.driver.switchTo().window(parentID);
	}
	public void imageUploadWindow() throws Throwable{
		StringSelection path = new StringSelection("C:\\Users\\Santosh\\Desktop\\Screenshot (819).png");
		 //get the control of desktop
		 Toolkit tool = Toolkit.getDefaultToolkit();
		 //get the control of mouse tool on dest top
		 Clipboard mouse = tool.getSystemClipboard();
		 //copy the data to mouse
		 mouse.setContents(path,null);
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
			 r.keyPress(KeyEvent.VK_V);
			 r.keyRelease(KeyEvent.VK_CONTROL);
			 r.keyRelease(KeyEvent.VK_V); 
			 r.keyPress(KeyEvent.VK_ENTER);
				 r.keyRelease(KeyEvent.VK_ENTER); 
				 r.keyPress(KeyEvent.VK_ENTER);
				 r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
}
