package week5.day2.assigments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ArchitectCertifications extends BaseClassSalesforce

{
    @Test(priority = 2 , enabled = true)
	public void Architect() throws InterruptedException
	
	{
		
			
		//7. Choose Your Role as Salesforce Architect
		
		driver.findElement(By.xpath("//div[text()='Architect']")).click();
		
		//8. Get the Text(Summary) of Salesforce Architect 
		
		String summary = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align--center')]")).getText();
		
		System.out.println("The Text(Summary) of Salesforce Architect is as follows :");
		
		System.out.println(summary);
		
		//9. Get the List of Salesforce Architect Certifications Available
		
		List<WebElement> architect = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		
		System.out.println("The Salesforce Architect Certifications Available are as follows :");
		
		for(WebElement eacharchitect : architect) 
		{
			System.out.println(eacharchitect.getText());
		}
		
		//10.Click on Application Architect 
		
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		
		//11.Get the List of Certifications available
		
		List<WebElement> certifications = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		
		System.out.println("The List of Certifications available for Application Architect are :");
		
		for(WebElement eachcertifications : certifications) 
		{
			System.out.println(eachcertifications.getText());
		}
		
						

	}

}
