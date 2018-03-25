package com.crm.objectrepositryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
  @FindBy(name="user_name") WebElement UserNameEdt;
  @FindBy(name="user_password") WebElement passwordEtd;
  @FindBy(id="submitButton") WebElement loginButton;
  public void login(String UserName , String password){
	  UserNameEdt.sendKeys(UserName);
	  passwordEtd.sendKeys(password);
	  loginButton.click();
	  
  }
}
