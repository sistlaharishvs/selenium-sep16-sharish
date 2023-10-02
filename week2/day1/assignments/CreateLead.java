package week2.day1.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateLead {

	public static void main(String[] args) 
	
	{
	
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
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
		
		driver.close();
	    
		
		
	}

}
