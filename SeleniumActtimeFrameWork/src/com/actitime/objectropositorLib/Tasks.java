package com.actitime.objectropositorLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tasks {
  @FindBy(xpath="//a[text()='Completed Tasks']") WebElement CompletedTaskslnk;
  @FindBy(xpath="//a[text()='Projects & Customers']") WebElement ProjectsAndCustomerslnk;
  @FindBy(xpath="//a[text()='Archives']") WebElement Archiveslnk;
}
