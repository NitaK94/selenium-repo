package com.crm.contacttest;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genricLib.BaseClass;
import com.crm.genricLib.CommonUtil;
import com.crm.objectrepositryLib.ContactInformation;
import com.crm.objectrepositryLib.Contacts;
import com.crm.objectrepositryLib.HomePage;
import com.crm.objectrepositryLib.Organizations;
@Listeners(com.crm.genricLib.SampleList.class)
public class ContactTest extends BaseClass {
	
	@Test 
	public void createcontactTest() throws Throwable{
		CommonUtil g = new CommonUtil();
		String contactdata = g.getData("Sheet2", 3, 5); 
		System.out.println(contactdata);
		//click on contact link
		System.out.println("go to contact");
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.navigateToContactsPage();
		
		//click on create contact link
		Contacts cat = PageFactory.initElements(driver, Contacts.class);
		cat.Contacts(contactdata);
		
		System.out.println("contact created ");
		ContactInformation ci = PageFactory.initElements(driver, ContactInformation.class);
		
		//verification
		String actconatctLastNAme = ci.getLastNameContactInfo().getText();
		System.out.println(actconatctLastNAme);
		Assert.assertEquals(actconatctLastNAme.trim(), contactdata);
		}
	@Test 
	public void createcontactwithorganizationTest() throws Throwable{
		CommonUtil g = new CommonUtil();
		String contactdata = g.getData("Sheet2", 5, 5); 
		String organisationdata = g.getData("Sheet2", 5, 2); 
		//go to organisation
		System.out.println("go to organisation");
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		hp.navigateToOrganizationsPage();
		//click on organisation create
		Organizations org = PageFactory.initElements(driver, Organizations.class);
		org.Organization(organisationdata);
		System.out.println("organisation created");
		//click on contact link
		System.out.println("go to contact");
		hp.navigateToContactsPage();
		//click on create contact link
		Contacts cat = PageFactory.initElements(driver, Contacts.class);
		cat.ContactWithOrganisation(contactdata, organisationdata);
		System.out.println("contact created ");
		//vrify contact with org
		ContactInformation ci = PageFactory.initElements(driver, ContactInformation.class);
		String actconatctLastNAme = ci.getLastNameContactInfo().getText();
		String actorgNAme = ci.getLastNameOrgInfo().getText();
		Assert.assertEquals(actconatctLastNAme.trim(), contactdata);
		System.out.println(actconatctLastNAme);
		Assert.assertEquals(actorgNAme.trim(), organisationdata);
		System.out.println(organisationdata);
	}
	 @Test(groups ={"Regerssion Test","Smoke Test"}) 
		public static void CreateContactWithImageTest() throws Throwable {
		 CommonUtil g = new CommonUtil();
			String contactdata = g.getData("Sheet2", 4, 5); 
			System.out.println(contactdata);
			//click on contact link
			System.out.println("go to contact");
			HomePage hp = PageFactory.initElements(driver, HomePage.class);
			hp.navigateToContactsPage();
			//click on create contact link
			Contacts cat = PageFactory.initElements(driver, Contacts.class);
			cat.ContactImageUpload(contactdata);
			System.out.println("contact created ");
			ContactInformation ci = PageFactory.initElements(driver, ContactInformation.class);
			//verification
			String actconatctLastNAme = ci.getLastNameContactInfo().getText();
			boolean status =ci.getLastNameImageInfo().isDisplayed();
					System.out.println("img verify");
					Assert.assertTrue(status);
			System.out.println(actconatctLastNAme);
			Assert.assertEquals(actconatctLastNAme.trim(), contactdata);
	 }
}
