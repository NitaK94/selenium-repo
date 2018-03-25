package com.crm.objectrepositryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.genricLib.WebdriverCommonLib;

public class Campaigns {
	WebdriverCommonLib wb = new WebdriverCommonLib();
	 
@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']") 
WebElement CampaignsCreatelnk;
@FindBy(name="campaignname") WebElement campaignnameedt;
@FindBy(xpath="//input[@class='crmbutton small save']") 
WebElement CampaignsaveButton;
public void Campaigns(String CampaignsName){
	CampaignsCreatelnk.click();
	campaignnameedt.sendKeys(CampaignsName);
	CampaignsaveButton.click();
}
}
