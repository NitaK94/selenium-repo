package com.actitime.objectropositorLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectsAndCustomers {
  @FindBy(xpath="//input[@value='Create New Customer']") WebElement CreateNewCustomerLnk;
  @FindBy(xpath="//input[@value='Create New Project']") WebElement CreateNewProjectLnk;
}
