package com.actitime.testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseClass;
import com.actitime.objectropositorLib.Login;
@Listeners(com.actitime.genericLib.SamplerListner.class)
public class CreateCustomer extends BaseClass{
   @Test
   public void CreatTest(){
	   System.out.println("passs=====================");
	   Assert.assertEquals("fgh", "dfg");
	   Login lg = PageFactory.initElements(driver, Login.class);
	  lg.getLoginEdt().click();
   }
	

}
