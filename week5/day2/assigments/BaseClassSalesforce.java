package week5.day2.assigments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassSalesforce 

{
	
	
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeMethod
	public void preCondition() throws InterruptedException 
	
	{
		
		//1. Launch Salesforce application https://login.salesforce.com/
		
				driver.get("https://login.salesforce.com/");
				
				driver.manage().window().maximize();
						
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//2. Login with username as "hari.radhakrishnan@qeagle.com" and password as "Leaf$1234"
				
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
				
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf$1234");
				
				driver.findElement(By.xpath("//input[@id='Login']")).click();
				
				//3. Click on Learn More link in Mobile Publisher
				
				driver.findElement(By.xpath("(//button[@class='slds-button slds-button--neutral navButton newWindow uiButton'])[1]")).click();
				
				//4. Click confirm on Confirm redirect

				Thread.sleep(2000);
				
				Set<String> handels = driver.getWindowHandles();
				
				List<String> uniqHan = new ArrayList<String>(handels);
				
				driver.switchTo().window(uniqHan.get(1));
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
				
				//5. Click Learning 
				WebElement element = (WebElement) driver.findElement(By.xpath("//hgf-c360nav")).getShadowRoot().findElement(By.cssSelector("#main-menu-0 > ul > li:nth-child(4) > h3 > hgf-button"));
				
				element.click();
				
				//6. And mouse hover on Learning On Trailhead
				WebElement element1 = (WebElement) driver.findElement(By.xpath("//hgf-c360nav")).getShadowRoot().findElement(By.cssSelector("#l1-3-0 > div.c360-nav__nav-items.c360-nav__nav-items--l2 > div.l2-container > ul > li:nth-child(1) > div.l2-hybrid-container > hgf-button.l2-button.l2-hybrid-label"));
				
				Actions builder = new Actions(driver);
				
				Thread.sleep(3000);
				
				builder.moveToElement(element1).perform();
				
				//7. Clilck on Salesforce Certifications
				WebElement element2 = (WebElement) driver.findElement(By.xpath("//hgf-c360nav")).getShadowRoot().findElement(By.cssSelector("#l1-3-l2-0-0 > div > hgf-c360panellinkedlist")).getShadowRoot().findElement(By.cssSelector("div > ul > li:nth-child(3)"));
				Thread.sleep(1000);
				builder.scrollToElement(element2).perform();
				element2.click();
			
	}



	@AfterMethod
	public void PostCondition()
	
	{
		Set<String> handels = driver.getWindowHandles();
		
		List<String> uniqHan = new ArrayList<String>(handels);
		
		driver.close();
		
		driver.switchTo().window(uniqHan.get(0));
		
		driver.close();
		
		
	}

}
