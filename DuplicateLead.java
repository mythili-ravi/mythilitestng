package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseTest {
@Test
	public  void duplicatelead() throws InterruptedException {
		// TODO Auto-generated method stub
	// To Click Lead
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();

			driver.findElement(By.xpath("//span[text()='Email']")).click();

			driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("mythilisujir@gmail.com");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
						Thread.sleep(2000);
			String FirstName = driver
					.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")).getText();
			System.out.println("First Name " + FirstName);
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a)[1]")).click();
			driver.findElement(By.linkText("Duplicate Lead")).click();
			if(driver.findElement(By.id("sectionHeaderTitle_leads")).getText().equals("Duplicate Lead"))
			{
				System.out.println("Title Verified");
			}
			else
			{
				System.out.println("Title Incorrect");
			}
			
		String CapturedName = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
			System.out.println("Captured Name  " + CapturedName);
			driver.findElement(By.xpath("//table//tbody//tr/td//input[@class='smallSubmit']")).click();
			String DuplicateName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
			if(DuplicateName.equals(CapturedName))
			{
				System.out.println("Name Verified");
			}
			else
			{
				System.out.println("Name mismatched");
			}
			

	

	}

}
