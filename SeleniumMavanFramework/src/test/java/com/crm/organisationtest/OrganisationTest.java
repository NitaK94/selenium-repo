package com.crm.organisationtest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.genricLib.BaseClass;
import com.crm.genricLib.CommonUtil;
import com.crm.objectrepositryLib.HomePage;
import com.crm.objectrepositryLib.Organizations;
import com.crm.objectrepositryLib.organisationInformation;

@Listeners(com.crm.genricLib.SampleList.class)
public class OrganisationTest extends BaseClass {
	 @Test(groups ="Smoke Test")
		public static void CreateOraganisationWithAllDEtailTest() throws Throwable {
			CommonUtil g = new CommonUtil();
			String orgname = g.getData("Sheet4", 1, 2);
			String Website = g.getData("Sheet4", 1, 3);
			//String Employees = g.getData("Sheet4", 1, 4);
			String OtherEmail = g.getData("Sheet4", 1, 5);
			String Industry = g.getData("Sheet4", 1, 6);
			String  Type = g.getData("Sheet4", 1, 7);
			String  BillingAddress = g.getData("Sheet4", 1, 8);
			String  BillingPOBox  = g.getData("Sheet4", 1, 9);
			String  BillingCity  = g.getData("Sheet4", 1, 10);
			String  BillingState  = g.getData("Sheet4", 1, 11);
			String  BillingPostalCode   = g.getData("Sheet4", 1, 12);
			String  BillingCountry    = g.getData("Sheet4", 1, 13);  
			String  Phone    = g.getData("Sheet4", 1, 14);
			String  Fax   = g.getData("Sheet4", 1, 15);
			String  OtherPhone    = g.getData("Sheet4", 1, 16);  
			String  Email    = g.getData("Sheet4", 1, 17);
			String  Ownership   = g.getData("Sheet4", 1, 18);
			String Rating    = g.getData("Sheet4", 1, 19);  
			String  SICCode    = g.getData("Sheet4", 1, 20);
			String  AnnualRevenue = g.getData("Sheet4", 1, 21);
			//go to organisation
			HomePage hp = PageFactory.initElements(driver, HomePage.class);
			hp.navigateToOrganizationsPage();
		   //go to organisation
			Organizations org = PageFactory.initElements(driver, Organizations.class);
			org.OrganisationWithAllDetail(orgname, Type, Website, OtherEmail, Industry, Phone,
					Fax, OtherPhone, Email, Ownership, Rating, SICCode,  BillingAddress, 
					BillingPOBox, BillingCity, BillingState, BillingPostalCode, BillingCountry);
	         //verify organisation
			organisationInformation orgf = PageFactory.initElements(driver, organisationInformation.class);
	       String Organisationname =  orgf.getOrganisationNameInfo().getText();
	       Assert.assertEquals(Organisationname.trim(), orgname);
	       String Organisationtype  =    orgf.getOrganisationTypeInfo().getText();
	       Assert.assertEquals(Organisationtype.trim(), Type); 
		}
	 @Test(groups ="Smoke Test")
		public static void CreateOraganisationWithEditTest() throws Throwable {
			CommonUtil g = new CommonUtil();
			String orgname = g.getData("Sheet4", 2, 2);
			String Website = g.getData("Sheet4", 2, 3);
			String  Type = g.getData("Sheet4", 2, 7);
			String orgSearchName = g.getData("Sheet4", 2, 23);
			System.out.println(orgSearchName);
			HomePage hp = PageFactory.initElements(driver, HomePage.class);
			hp.navigateToOrganizationsPage();
			Organizations org = PageFactory.initElements(driver, Organizations.class);
			org.Organisation(orgname, Website);
			hp.navigateToOrganizationsPage();
			org.OrganisationWithEditData(Type, orgname, orgSearchName);
			//verification
			organisationInformation orgf = PageFactory.initElements(driver, organisationInformation.class);
		       String Organisationname =  orgf.getOrganisationNameInfo().getText();
		       Assert.assertEquals(Organisationname.trim(), orgname);
		       String Organisationtype  =    orgf.getOrganisationTypeInfo().getText();
		       Assert.assertEquals(Organisationtype.trim(), Type); 
	 }
	 @Test(groups ="Smoke Test")
		public static void CreateOraganisationTest() throws Throwable {
			CommonUtil g = new CommonUtil();
			String orgdata = g.getData("Sheet2", 1, 2);
			//go to organisation
			HomePage hp = PageFactory.initElements(driver, HomePage.class);
			hp.navigateToOrganizationsPage();
		   //create organisation
			Organizations org = PageFactory.initElements(driver, Organizations.class);
			org.Organization(orgdata);
	         //verify organisation
			organisationInformation orgf = PageFactory.initElements(driver, organisationInformation.class);
	       String Organisationname =  orgf.getOrganisationNameInfo().getText();
	       Assert.assertEquals(Organisationname.trim(), orgdata);
		}
@Test (groups ={"Regerssion Test","Smoke Test"})
		public static void CreateOraganisationWithType() throws Throwable {
			CommonUtil g = new CommonUtil();
			String orgdata = g.getData("Sheet2", 2, 2);
			String orgtype = g.getData("Sheet2", 2, 6);
			//go to organisation
			HomePage hp = PageFactory.initElements(driver, HomePage.class);
			hp.navigateToOrganizationsPage();
		   //create organisation
			Organizations org = PageFactory.initElements(driver, Organizations.class);
			org.OrganizationWithType(orgdata, orgtype);
	         //verify organisation
			organisationInformation orgf = PageFactory.initElements(driver, organisationInformation.class);
	       String Organisationname =  orgf.getOrganisationNameInfo().getText();
	       Assert.assertEquals(Organisationname.trim(), orgdata);
	       String Organisationtype  =    orgf.getOrganisationTypeInfo().getText();
	       Assert.assertEquals(Organisationtype.trim(), orgtype); 
}	 
}