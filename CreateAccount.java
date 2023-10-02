package week2.day1.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CreateAccount 
{

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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("KameswariNarayanaAssosities");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("10lakhs");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
	    Select industryid = new Select(industry);
	    industryid.selectByIndex(3);
	    
	    WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
	    Select ownershipid = new Select(ownership);
	    ownershipid.selectByVisibleText("S-Corporation");
	    
	    WebElement source = driver.findElement(By.name("dataSourceId"));
	    Select sourceid = new Select(source);
	    sourceid.selectByValue("LEAD_EMPLOYEE");
	    
	    WebElement marketingcamp = driver.findElement(By.name("marketingCampaignId"));
	    Select marketingcampid = new Select(marketingcamp);
	    marketingcampid.selectByIndex(6);
	    
	    WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
	    Select stateid = new Select(state);
	    stateid.selectByValue("TX");
	    
	    driver.findElement(By.xpath("//input[@value='Create Account']")).click();
	    
	    
	    driver.close();

	}

}
