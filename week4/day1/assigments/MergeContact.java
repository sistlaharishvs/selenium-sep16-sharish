package week4.day1.assigments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact 
{

	public static void main(String[] args) 
	
	{
ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		//2. Enter UserName and Password Using Id Locator
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		//3. Click on Login Button using Class Locator
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		//4. Click on CRM/SFA Link
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		//5. Click on contacts Button
		
		driver.findElement(By.xpath("(//li[@class='sectionTabButtonUnselected'])[2]")).click();
		
		
		//6. Click on Merge Contacts using Xpath Locator
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		
		// 7. Click on Widget of From Contact
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
				
		// 8. Click on First Resulting Contact
		
		Set<String> windohan = driver.getWindowHandles();
		
		List<String> winlist = new ArrayList<String>(windohan);
		
		driver.switchTo().window(winlist.get(1));
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));	
		
		
		driver.switchTo().window(winlist.get(0));
		
		//* 9. Click on Widget of To Contact
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		//* 10. Click on Second Resulting Contact
		
		Set<String> windohand = driver.getWindowHandles();
		
		List<String> winlist1 = new ArrayList<String>(windohand);
		
		driver.switchTo().window(winlist1.get(1));
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		
		driver.switchTo().window(winlist1.get(0));
		
		
		//* 11. Click on Merge button using Xpath Locator
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		
		//* 12. Accept the Alert
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		
		//* 13. Verify the title of the page
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		
		

	}

}
