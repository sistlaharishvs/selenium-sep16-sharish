package week5.day2.assigments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AdministratorCertifications extends BaseClassSalesforce

{
    @Test(priority = 1 , enabled = true)
	public void Administrator() throws InterruptedException 
	{

				
		//8. Click on first resulting Ceritificate
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Administrator']")).click();
		
		Thread.sleep(2000);
		//9. verify - Administrator Overview page
		
		String admin = driver.findElement(By.xpath("//div[contains(@class,'certification-banner_title slds-container')]")).getText();
		
		if(admin.equals("Administrator")) 
		{
		
			System.out.println("Verified the page is of Administrator");
			
		}
		
		else
		
		{
			
			System.out.println("Varification Failed");
		}
		
		//10.Print the Certifications available for Administrator Certifications (List)
		
		List<WebElement> Certifications = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		
		System.out.println("Certifications available for Administrator Certifications are :");
		
		for(WebElement eachCertifications:Certifications) 
		{
			System.out.println(eachCertifications.getText());
		}
		
		
		
	}

}
