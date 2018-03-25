package com.crm.objectrepositryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.genricLib.WebdriverCommonLib;

public class HomePage{
	WebdriverCommonLib wb = new WebdriverCommonLib();
	 
	@FindBy(xpath="themes/softed/images/Home.PNG") WebElement HomeclickLnk;
	@FindBy(xpath="//a[@href='index.php?module=Accounts&action=index']") WebElement Organizationslnk;
	 @FindBy(xpath="//a[@href='index.php?module=Potentials&action=index']") WebElement Opportunitieslnk;
	 @FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']") WebElement Contactslnk;
	 @FindBy(xpath="//img[@src='themes/softed/images/menuDnArrow.gif']") WebElement morelnk;
	 @FindBy(linkText="Campaigns") WebElement Campaignslnk;
   public void navigateToOrganizationsPage(){
	  
	   wb.waitForElement(Organizationslnk);
	 Organizationslnk.click();
}
   public void navigateToOpportunitiesPage(){
	   
	   wb.waitForElement(Opportunitieslnk);
	   Opportunitieslnk.click();
	}
   public void navigateToContactsPage(){
	  
	   wb.waitForElement(Contactslnk);
	   Contactslnk.click();
	}
   public void navigateToCampaignsPage(){
	  
	   morelnk.click();
	   wb.waitForElement(Campaignslnk);
		Campaignslnk.click();
	}
}

