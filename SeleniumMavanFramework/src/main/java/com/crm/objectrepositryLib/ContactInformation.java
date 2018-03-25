package com.crm.objectrepositryLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.genricLib.WebdriverCommonLib;

public class ContactInformation {
	WebdriverCommonLib wb = new WebdriverCommonLib();
	@FindBy(id="dtlview_Last Name") WebElement ContactInfo;
	@FindBy(xpath="//td[@id='mouseArea_Organization Name']/a") WebElement organisationInfo;
	@FindBy(xpath="//img[@title='Contact Image']") WebElement imageInfo;
	
   public WebElement getLastNameContactInfo(){
	    return ContactInfo;
		 
	 }
   public WebElement getLastNameOrgInfo(){
	  return organisationInfo;
   }
   public WebElement getLastNameImageInfo(){
		  return imageInfo;
	   }
   
}
