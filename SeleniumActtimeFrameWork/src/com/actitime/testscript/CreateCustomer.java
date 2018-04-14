package com.actitime.testscript;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseClass;
@Listeners(com.actitime.genericLib.SamplerListner.class)
public class CreateCustomer extends BaseClass{
   @Test
   public void CreatTest(){
	   System.out.println("passs=====================");
	   Assert.assertEquals("fgh", "dfg");
   }
	

}
