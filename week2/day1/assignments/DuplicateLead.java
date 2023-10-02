package week2.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead 

{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafChennai");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajesh");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Singh");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rajesh");
		
		driver.findElement(By.name("departmentName")).sendKeys("Software");
		
		driver.findElement(By.name("description")).sendKeys("Need to learn Selenium");
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf.2003@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/descendant::a[@class='subMenuButton']")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NewTestLeafChennai");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("RamRajesh");
		
		driver.findElement(By.name("submitButton")).click();
		
		String titles = driver.getTitle();
		
		System.out.println(titles);
		

	}

}
