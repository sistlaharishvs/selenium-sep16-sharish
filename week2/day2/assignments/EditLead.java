package week2.day2.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class EditLead 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//1	Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//2	Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
		//7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//8	Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Kanchana");
		
		//9	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		
		//* 10 Click on first resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		
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
			

		
		//16 Close the browser (Do not log out)
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
