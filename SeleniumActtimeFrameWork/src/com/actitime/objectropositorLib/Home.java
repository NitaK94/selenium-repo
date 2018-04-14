package com.actitime.objectropositorLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
  @FindBy(xpath="//a[@class='content tasks']/img") WebElement TaskLnk;
  @FindBy(xpath="//a[@class='content reports']/img") WebElement ReportsLnk;
  @FindBy(xpath="//a[@class='content users']/img") WebElement UsersLnk;
  @FindBy(xpath="//a[@class='content calendar']/img") WebElement WorkSheduleLnk;
}
