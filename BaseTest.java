package week5.day1;



import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	
  
  ChromeDriver driver;
 @BeforeMethod
  public void login() {
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  driver.get("http://leaftaps.com/opentaps");
	  driver.manage().window().maximize();
	  // Create userName
	  driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	  //Create password
	  driver.findElement(By.id("password")).sendKeys("crmsfa");
	  //login
	  driver.findElement(By.className("decorativeSubmit")).click();
	  //Get the name of header and print the valuue
	  String text =driver.findElement(By.tagName("h2")).getText();
	  System.out.println(text);
	  //click the link
	  driver.findElement(By.linkText("CRM/SFA")).click();
  }

  @AfterMethod
  public void exit() {
	  driver.close();
  }

}
