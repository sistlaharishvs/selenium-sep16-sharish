package week5.day1.assigments;



import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class DeleteLead extends BaseClass {
	
	

	@Test
	public  void deletelead() throws InterruptedException
	
	{
		
		//7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//8	Click on Phone
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		
		//9	Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		
		//10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		//11	Capture lead ID of First Resulting lead
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		
		System.out.println(leadID);
		
		//12	Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		
		//13	Click Delete
		driver.findElement(By.linkText("Delete")).click();
		
		
		//14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//15	Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		
		//16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		
		String text = driver.findElement(By.className("x-paging-info")).getText();
		
		System.out.println(text);
		
		if(text.contains("No records to display")) 
		{
			System.out.println("Text Matched");
			
		}
		
		else
		{
			System.out.println("Text did not Matched");
		}
		
				
	}

}
