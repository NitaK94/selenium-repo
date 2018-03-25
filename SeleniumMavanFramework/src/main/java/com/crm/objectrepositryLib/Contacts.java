package com.crm.objectrepositryLib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genricLib.WebdriverCommonLib;

public class Contacts {
	 WebdriverCommonLib wb = new WebdriverCommonLib();
	 
	@FindBy(xpath="//input[@name='account_id']/following-sibling::img") WebElement ContactsWithOrglnk;
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']") WebElement ContactsCreatelnk;
	 @FindBy(name="lastname") WebElement ContactLastNameedt;
	  @FindBy(xpath="//input[@class='crmButton small save']") WebElement ContactSaveButton;
	  @FindBy(id="search_txt") WebElement orgnisationsearchedt;
	  @FindBy(name="search") WebElement orgnisationsearchButtonlnk;
	  @FindBy(xpath="//a[@class='listFormHeaderLinks']/../../../tr[2]/td[1]/a")  WebElement organisationSelectlnk;
	  @FindBy(name="imagename") WebElement contactImage;
	  public void Contacts(String ContactName){
		  ContactsCreatelnk.click();
		  ContactLastNameedt.sendKeys(ContactName);
		  ContactSaveButton.click();	  
	  }
	  public void ContactWithOrganisation(String ContactName , String organisationName) throws Throwable{
		   ContactsCreatelnk.click();
		  ContactLastNameedt.sendKeys(ContactName);
		  ContactsWithOrglnk.click();
		  wb.switchTochildWindow();
		  orgnisationsearchedt.sendKeys(organisationName);
		  orgnisationsearchButtonlnk.click();
		  wb.waitForPageLoad();
		  Thread.sleep(3000);
		  organisationSelectlnk.click();
		  wb.switchBackToParentWindow();
		  ContactSaveButton.click(); }
	  public void ContactImageUpload(String ContactName) throws Throwable{
		  ContactsCreatelnk.click();
		  ContactLastNameedt.sendKeys(ContactName);
		  contactImage.click();
		  wb.imageUploadWindow();
		  ContactSaveButton.click();
		}
	}
