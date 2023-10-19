package week5.day1.assigments;



import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass

{
    @Test
	public void  DuplcateLead() 
	{
		
    	System.out.println(Thread.currentThread().getId());
    	
    	
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafChennai");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajesh");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Singh");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rajesh");
		
		driver.findElement(By.name("departmentName")).sendKeys("Software");
		
		driver.findElement(By.name("description")).sendKeys("Need to learn Selenium");
		
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
