package rippling;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genricLib.BaseClass;

public class VerifyPhoneOrNumber extends BaseClass {
	
	@Test
	public void verifyPhoneNumberWithValidData(){
		Reporter.log("execute  =========> verifyPhoneNumberWithValidData",true);
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
