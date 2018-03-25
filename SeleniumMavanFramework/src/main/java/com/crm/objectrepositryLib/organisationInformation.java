package com.crm.objectrepositryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class organisationInformation {
  @FindBy(id = "dtlview_Organization Name") WebElement OrganisationInformation;
  @FindBy(xpath = "//span[@id='dtlview_Type']/font") WebElement OrganisationTypeInformation;
  public WebElement getOrganisationTypeInfo(){
	  return OrganisationTypeInformation;
 }
  public WebElement getOrganisationNameInfo(){
	    return OrganisationInformation;
		 
	 }
 
}
