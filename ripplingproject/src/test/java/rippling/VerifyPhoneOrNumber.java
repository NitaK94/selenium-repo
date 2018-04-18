package rippling;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genricLib.BaseClass;
import com.genricLib.CommonUtil;

import objectrepositoryLib.VanillaMasker;

public class VerifyPhoneOrNumber extends BaseClass {
	CommonUtil com = new CommonUtil();
	@Test
	public void verifyPhoneNumberWithValidData() throws Throwable{
		int phoneNumber = com.getData("Sheet1", 1, 1);
		System.out.println(phoneNumber);
		Reporter.log("execute  =========> verifyPhoneNumberWithValidData",true);
		VanillaMasker vm = PageFactory.initElements(driver, VanillaMasker.class);
		vm.getPhoneEdt().sendKeys(String.valueOf(phoneNumber));
		
	}
	@Test
    public void verifyPhoneNumberWithInValidData(){
		Reporter.log("execute  =========> verifyPhoneNumberWithInValidData",true);
	}
	@Test
    public void verifyNewNumberWithInValidData(){
		Reporter.log("execute  =========> verifyNewNumberWithInValidData",true);
	}
	
	@Test
    public void verifyNewNumberWithValidData(){
		Reporter.log("execute  =========> verifyNewNumberWithValidData",true);
	}


}
