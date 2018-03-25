package com.crm.objectrepositryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.genricLib.WebdriverCommonLib;

public class Opportunities {
	WebdriverCommonLib wb = new WebdriverCommonLib();

	  @FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']") WebElement OpportunitiesCreatelnk;
	  @FindBy(name="potentialname") WebElement OpportunitiesNameedt;
	  @FindBy(xpath="//input[@class='crmbutton small save']") WebElement OpportunitiessaveButton;
	 //organisation
	  @FindBy(xpath="//input[@id='related_to_display']/following-sibling::img") WebElement orgSelectlnk;
	  @FindBy(name="search_text") WebElement orgtextedt;
	  @FindBy(name="search") WebElement orgsearchclick;
	  @FindBy(xpath="//a[@class='listFormHeaderLinks']/../../../tr[2]/td[1]/a") WebElement orgnisationclick;
	  //campaign
	  @FindBy(xpath="//input[@name='campaignid']/following-sibling::img") WebElement campSelectlnk;
	  @FindBy(name="search_text") WebElement campsearchclick;
	  @FindBy(name="search") WebElement camptextedt;
	  @FindBy(xpath="//a[@class='listFormHeaderLinks']/../../../tr[2]/td[1]/a") WebElement campaignclick;
	 public void OpportunitiesName( String OpportunitiesName){
		 wb.waitForElement(OpportunitiesCreatelnk);
		 OpportunitiesCreatelnk.click();
		 OpportunitiesNameedt.sendKeys(OpportunitiesName);
		 OpportunitiessaveButton.click();
	 }
	 public void oppertunitieWithOrganisationOrCompaign(String oppertiesName ,String organisationName,String campaignName) throws Throwable{
		 wb.waitForElement(OpportunitiesCreatelnk);
		 OpportunitiesCreatelnk.click();
		 OpportunitiesNameedt.sendKeys(oppertiesName);
		 //organisation select
		 orgSelectlnk.click();
		 wb.switchTochildWindow();
		 orgtextedt.sendKeys(organisationName);
		 orgsearchclick.click();
		 Thread.sleep(2000);
		 orgnisationclick.click();
		 wb.switchBackToParentWindow();
		 //campign select
		 campSelectlnk.click();
		 wb.switchTochildWindow();
		 campsearchclick.sendKeys(campaignName);
		 camptextedt.click();
		 Thread.sleep(2000);
		 wb.waitForPageLoad();
		 campaignclick.click();
		 wb.switchBackToParentWindow();
		 OpportunitiessaveButton.click();
	 }
	 public void oppertunitieWithOrganisation(String oppertiesName ,String organisationName) throws Throwable{
		 wb.waitForElement(OpportunitiesCreatelnk);
		 OpportunitiesCreatelnk.click();
		 OpportunitiesNameedt.sendKeys(oppertiesName);
		 //organisation select
		 orgSelectlnk.click();
		 wb.switchTochildWindow();
		 orgtextedt.sendKeys(organisationName);
		 orgsearchclick.click();
		 Thread.sleep(3000);
		 orgnisationclick.click();
		 wb.switchBackToParentWindow();
		 
		 OpportunitiessaveButton.click();
	 }

}
