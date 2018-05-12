package javaname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class patternProgram {
	WebDriver driver;
   @Test
 public void amazonOpenTest() throws Throwable{
	// System.setProperty("webdriver.chrome.driver", "./resource/chromedriver.exe");
	 //driver = new ChromeDriver();
	   driver = new FirefoxDriver();
	 driver.get("https://www.amazon.in/");
	 Thread.sleep(5000);
	 driver.findElement(By.name("field-keywords")).sendKeys("Apple phone");
	 driver.findElement(By.xpath("//span[text()='Go']/following-sibling::input")).click();
	 String data =driver.findElement(By.xpath("//span[contains(@id , 's-result-count')]")).getText();
	 System.out.print(data);
	 driver.close();
 }
}
