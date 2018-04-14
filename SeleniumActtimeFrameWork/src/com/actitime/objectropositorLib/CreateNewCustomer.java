package com.actitime.objectropositorLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer {
  @FindBy(name="name") WebElement CustomerNameEdt;
  @FindBy(name="description") WebElement CustomerDescriptionEdt;
  @FindBy(name="createCustomerSubmit") WebElement createCustomerSubmitEdt;
  
}
