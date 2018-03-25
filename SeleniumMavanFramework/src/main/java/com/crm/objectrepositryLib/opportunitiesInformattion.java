package com.crm.objectrepositryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class opportunitiesInformattion {
    @FindBy(xpath="//span[@id='dtlview_Opportunity Name']") WebElement opportunityName;
    @FindBy(xpath="//a[@title='Organizations']") WebElement orgnisationName;
    @FindBy(xpath="//input[@id='hdtxt_IsAdmin']/../../../tr[6]/td[2]") WebElement campname;
    
    public WebElement getOpportunityNameInfo(){
	    return opportunityName;
		 
	 }
    public WebElement getCampaignNameInfo(){
	    return campname;
		 
	 }
    public WebElement getorgnisationNameInfo(){
	    return orgnisationName;
		 
	 }
}
