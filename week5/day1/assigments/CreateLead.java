package week5.day1.assigments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass {

	
	@Test  // mandatory annotation to run the test case
	public  void runCreate() 
	
	{
		System.out.println(Thread.currentThread().getId());
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harish");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sistla");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourcedd = new Select(source);
	    sourcedd.selectByVisibleText("Employee");
	    
	    WebElement marketingCampaignId = driver.findElement(By.name("marketingCampaignId"));
	    Select marketcampid = new Select(marketingCampaignId);
	    marketcampid.selectByVisibleText("Pay Per Click Advertising");
	    
	    WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
	    Select ownershipid = new Select(ownership);
	    ownershipid.selectByIndex(5);
	    
	    
	    WebElement country = driver.findElement(By.name("generalCountryGeoId"));
	    Select countryid = new Select(country);
	    countryid.selectByVisibleText("India");
	    
	    driver.findElement(By.name("submitButton")).click();
	    
	    
	    String title = driver.getTitle();
		System.out.println(title);
				
		
	}

}
