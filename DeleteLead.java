package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteLead extends BaseTest {
@Test(enabled=false)
	public  void deletelead() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.className("inputBox")).clear();
		driver.findElement(By.className("inputBox")).sendKeys();
		driver.findElement(By.className("smallSubmit")).click();

		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text2);

		

	}

}
