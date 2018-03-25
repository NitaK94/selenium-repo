package com.crm.objectrepositryLib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.crm.genricLib.WebdriverCommonLib;

public class Organizations {
	 WebdriverCommonLib wb = new WebdriverCommonLib();

	  @FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']") WebElement Organizationsreatelnk;
	  @FindBy(name="accountname") WebElement OrganizationName;
	  @FindBy(name="search_text") WebElement orgSendEDT;
	  @FindBy(id="bas_searchfield") WebElement orgatypeSelectOpt;
	  @FindBy(name="submit") WebElement orgSearchClick;
	 @FindBy(name="selected_id") WebElement selectOrglnk;
	 @FindBy(xpath="//input[@value='Delete']") WebElement orgDelete;
	  @FindBy(xpath="//input[@class='crmbutton small save']") WebElement OrganizationsaveButton;
	  @FindBy(name="accounttype") WebElement Orgtypedrop; //drop down
	  @FindBy(name="website")  WebElement orgWebsiteedt;
	  @FindBy(id="employees")  WebElement orgEmployeesedt;
	  @FindBy(id="email2")  WebElement orgOtherEmailedt;
	  @FindBy(name="industry")  WebElement orgIndustryDrop; //drop down
	  @FindBy(id="phone")  WebElement orgPhoneedt;
	  @FindBy(id="fax")  WebElement orgFaxedt; 
	  @FindBy(id="otherphone")  WebElement orgOtherPhoneedt;
	  @FindBy(id="email1")  WebElement orgEmailedt;
	  @FindBy(id="ownership")  WebElement orgOwnershipedt;
	  @FindBy(name="rating")  WebElement orgRatingdrop; //dropdown
	  @FindBy(id="siccode")  WebElement orgSICCodeedt; 
	  @FindBy(name="annual_revenue")  WebElement orgAnnualRevenueedt; 
	  @FindBy(name="bill_street")  WebElement orgBillingAddressedt;
	  @FindBy(id="bill_pobox")  WebElement orgBillingPOBoxedt;
	  @FindBy(id="bill_city")  WebElement orgBillingCityedt; 
	  @FindBy(id="bill_state")  WebElement orgBillingStateedt;
	  @FindBy(id="bill_code")  WebElement orgBillingPostalCodeedt; 
	  @FindBy(id="bill_country")  WebElement orgBillingcountryCode;
	  @FindBy(xpath="//b[contains(text(),'Billing')]/preceding-sibling::input")  WebElement orgCopyBillingaddressedt;
	  //
	  @FindBy(id="bas_searchfield")  WebElement orgNameSelect;
	  @FindBy(name="search_text")  WebElement orgnamePaste;
	  @FindBy(name="submit")  WebElement orgNameSearch;
	  @FindBy(xpath="//a[text()='edit']")  WebElement orgeditlnk;
	  @FindBy(xpath="//a[@title='Organizations']") WebElement orgNameclicklnk;
	  public void Organisation(String Organizationsname , String orgWebsite){
		  Organizationsreatelnk.click();
	      OrganizationName.sendKeys(Organizationsname);
	     orgWebsiteedt.sendKeys(orgWebsite);
	     OrganizationsaveButton.click();
	  }
	  public void OrganisationWithEditData(String type, String Organizationsname , String OrganizationSearchName) throws Throwable{
		  orgnamePaste.sendKeys(Organizationsname);
		  wb.selectVisibleText(orgNameSelect, OrganizationSearchName);
		  orgNameSearch.click();
		  Thread.sleep(5000);
		  orgeditlnk.click();
		 wb.waitForPageLoad();
		 wb.selectVisibleText(Orgtypedrop, type);
		 OrganizationsaveButton.click();
		 orgNameclicklnk.click();
		  
	  }
	  public void OrganisationWithAllDetail(String Organizationsname, String Orgtype,String orgWebsite, String orgOtherEmail , String orgIndustry,String orgPhone ,
			  String orgFax , String orgOtherPhone , String  orgEmail , String orgOwnership, String  orgRating ,String orgSICCode , String orgBillingAddress,
			  String orgBillingPOBox,String orgBillingCity,String orgBillingState,String orgBillingPostalCode ,String orgBillingCountrye ) throws Throwable{
		      Organizationsreatelnk.click();
		      OrganizationName.sendKeys(Organizationsname);
		     orgWebsiteedt.sendKeys(orgWebsite);
		    // orgEmployeesedt.sendKeys(orgEmployees);
		     orgOtherEmailedt.sendKeys(orgOtherEmail);
		     wb.selectVisibleText(Orgtypedrop, Orgtype);
		     wb.selectVisibleText(orgIndustryDrop, orgIndustry);
		     orgPhoneedt.sendKeys(orgPhone);
		     orgFaxedt.sendKeys(orgFax);
		     orgOtherPhoneedt.sendKeys(orgOtherPhone);
		     orgEmailedt.sendKeys(orgEmail);
		     orgOwnershipedt.sendKeys(orgOwnership);
		     wb.selectVisibleText(orgRatingdrop, orgRating);
		     orgSICCodeedt.sendKeys(orgSICCode);
		    // orgAnnualRevenueedt.sendKeys(orgAnnualRevenue);
		     orgBillingAddressedt.sendKeys(orgBillingAddress);
		     orgBillingPOBoxedt.sendKeys(orgBillingPOBox);
		     orgBillingCityedt.sendKeys(orgBillingCity);
		     orgBillingStateedt.sendKeys(orgBillingState);
		     orgBillingPostalCodeedt.sendKeys(orgBillingPostalCode);
		     orgBillingcountryCode.sendKeys(orgBillingCountrye);
		     orgCopyBillingaddressedt.click();
		     Thread.sleep(2000);
		
		     OrganizationsaveButton.click();
		
	  }
	  ///////////////////////////////////////////////////////////////////
	  public void OrganizationWithType(String organizationsname , String OrganizationsType ){
		  Organizationsreatelnk.click();
		  OrganizationName.sendKeys(organizationsname);
		 wb.selectVisibleText(Orgtypedrop, OrganizationsType);
	      OrganizationsaveButton.click();
	  }
	  public void Organization(String Organizationsname){
		  Organizationsreatelnk.click();
		  OrganizationName.sendKeys(Organizationsname);
		  OrganizationsaveButton.click();
  }
	  public void OrganizationDeleted(String Organizationsname) throws Throwable{
		  orgSendEDT.sendKeys(Organizationsname); 
		  wb.selectVisibleText(orgatypeSelectOpt, "Organization Name");
		  orgSearchClick.click();
		  wb.waitForPageLoad();
		  Thread.sleep(3000);
		  selectOrglnk.click();
		  orgDelete.click();
		  Thread.sleep(3000);
		  wb.handleAlertTryCatch();
	  }
}
