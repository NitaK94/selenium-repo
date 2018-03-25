package com.crm.enetoendtest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.genricLib.BaseClass;
import com.crm.genricLib.CommonUtil;
import com.crm.genricLib.WebdriverCommonLib;
import com.crm.objectrepositryLib.Campaigns;
import com.crm.objectrepositryLib.ContactInformation;
import com.crm.objectrepositryLib.Contacts;
import com.crm.objectrepositryLib.HomePage;
import com.crm.objectrepositryLib.Opportunities;
import com.crm.objectrepositryLib.Organizations;
import com.crm.objectrepositryLib.opportunitiesInformattion;

@Listeners(com.crm.genricLib.SampleList.class)
public class EndToEndTest extends BaseClass{
		 @Test(groups ="Smoke Test")
			public static void CreateOtertanity_using_Org_campnign() throws Throwable {
				CommonUtil g = new CommonUtil();
				SoftAssert  s =  new SoftAssert();
				String oppertunitydata = g.getData("Sheet2", 6, 4);
				String orgname = g.getData("Sheet2", 6, 2);
				String campname = g.getData("Sheet2", 6, 3);
				
		          //create campaign name
		          System.out.println("campaign created");
		          HomePage hp = PageFactory.initElements(driver, HomePage.class);
		          hp.navigateToCampaignsPage();
		          Campaigns cmp =PageFactory.initElements(driver, Campaigns.class);
		          cmp.Campaigns(campname);
		          //create organisation
		          hp.navigateToOrganizationsPage();
		          Organizations org = PageFactory.initElements(driver, Organizations.class);
		          org.Organization(orgname);
		          System.out.println("Organizations created");
		          hp.navigateToOpportunitiesPage();
		            //create opportunity with org and camp
		          System.out.println("Opportunities created");
		          Opportunities opr = PageFactory.initElements(driver, Opportunities.class);
		        opr.oppertunitieWithOrganisationOrCompaign(oppertunitydata, orgname, campname);
		          System.out.println("organisation  created");
		          //verify
		          opportunitiesInformattion oprt = PageFactory.initElements(driver, opportunitiesInformattion.class);
		         String orpverify = oprt.getOpportunityNameInfo().getText();
		         Assert.assertEquals(orpverify.trim(), oppertunitydata);
		         String campverify = oprt.getCampaignNameInfo().getText();
		         Assert.assertEquals(campverify.trim(), campname);
		         String organisationVerify = oprt.getorgnisationNameInfo().getText();
		         Assert.assertEquals(organisationVerify.trim(), orgname);
			}
		 @Test(groups ={"Regerssion Test","Smoke Test"})
			public void DeleteOrgWithOrgContainsContacts_OppertunityTest() throws Throwable{
			 WebdriverCommonLib wb = new WebdriverCommonLib();
				CommonUtil g = new CommonUtil();
				SoftAssert  s =  new SoftAssert();
				String orgdata = g.getData("Sheet2", 7, 2);
				String contactdata = g.getData("Sheet2", 7, 5);
				String opprdata = g.getData("Sheet2", 7, 4);
				
		         //create organisation
				HomePage hp = PageFactory.initElements(driver, HomePage.class);
				hp.navigateToOrganizationsPage();
				Organizations org = PageFactory.initElements(driver, Organizations.class);
		          org.Organization(orgdata);
		          System.out.println("Organizations created");
		          //create contact
		          hp.navigateToContactsPage();
		          Contacts cat =  PageFactory.initElements(driver, Contacts.class);
		          cat.ContactWithOrganisation(contactdata, orgdata);
		 		 //create opportunity with  contact
		        System.out.println("Opportunities created");
		        hp.navigateToOpportunitiesPage();
		        Opportunities orp = PageFactory.initElements(driver, Opportunities.class);
		        orp.oppertunitieWithOrganisation(opprdata, orgdata);
		  		//organisation delete
		        hp.navigateToOrganizationsPage();
		        org.OrganizationDeleted(orgdata);
		       
		 }
}