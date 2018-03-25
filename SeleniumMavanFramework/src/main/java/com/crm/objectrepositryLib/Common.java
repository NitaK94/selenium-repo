package com.crm.objectrepositryLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genricLib.BaseClass;
import com.crm.genricLib.WebdriverCommonLib;

public class Common  extends BaseClass{
   @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") WebElement logoutImg;
   @FindBy(xpath="//a[text()='Sign Out']") WebElement SignOutImg;
  
   public void logout(){
	   WebdriverCommonLib wb =  PageFactory.initElements(driver, WebdriverCommonLib.class);
	   wb.mouseMove(logoutImg);
	   SignOutImg.click();
   }
}
