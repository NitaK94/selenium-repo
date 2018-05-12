package com.actitime.objectropositorLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
  @FindBy(name="username") WebElement UserEdt;
  @FindBy(name="pwd") WebElement PwdEdt;
  @FindBy(id="loginButton") WebElement LoginEdt;
 
public WebElement getUserEdt() {
	return UserEdt;
}

public WebElement getPwdEdt() {
	return PwdEdt;
}

public WebElement getLoginEdt() {
	return LoginEdt;
}

public void login(String username, String pwd){
	  UserEdt.sendKeys(username);
	  PwdEdt.sendKeys(pwd);
	  LoginEdt.click();
}

public void login(){
	 LoginEdt.click(); 
}

}
