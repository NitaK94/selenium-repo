package objectrepositoryLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VanillaMasker {
  @FindBy(id="numbers") WebElement onlyNumberEdt;
  @FindBy(id="phone") WebElement phoneEdt;
  
  public void vanilla(int onlynumber , int phonenumber){
	  onlyNumberEdt.sendKeys("onlynumber");
	  phoneEdt.sendKeys("phonenumber");
  }

public WebElement getOnlyNumberEdt() {
	return onlyNumberEdt;
}

public WebElement getPhoneEdt() {
	return phoneEdt;
}
}
