package week5.day1.assigments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;



public class EditLead extends BaseClass

{
	
        @Test
        public void editlead() throws InterruptedException 
        
        {
				
		//7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//8	Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anusha");
		
		//9	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		Thread.sleep(2000);
		
		//* 10 Click on first resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(text);
		
		//* 11 Verify title of the page
		String titel = "View Lead";
		
		String title2 = driver.getTitle();
		
		System.out.println(title2);
		
		if(titel.equalsIgnoreCase(title2)) 
		{
			System.out.println("Titel Matched");
		}
		else
		{
			System.out.println("Titel Not Matched");
		}
		
		//* 12 Click Edit
     	driver.findElement(By.linkText("Edit")).click();
		
		//* 13 Change the company name
		WebElement findelement = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		
		findelement.clear();
		
		findelement.sendKeys("TestLeaf");
	
		//* 14 Click Update
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
		String text2 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(text2);
		
		//15 Confirm the changed name appears
		
		if(text.equals(text2)) 
		{
		
			System.out.println("Company Name Not changed");
			
		}
		else 
		{
			System.out.println("Company Name changed");
		}
			

	}

}
