package week4.day2.assigments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import java.util.Set;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAssignment 
{

	public static void main(String[] args) 
	
	{
		//1.Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//2.Load the url as " https://login.salesforce.com/ 
		
		driver.get("https://login.salesforce.com/");
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//3.Enter the username as "hari.radhakrishnan@qeagle.com"
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		
		//4. Enter the password as " Testleaf$321 
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password$123");
		
		
		//5.click on the login button
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//6.click on the learn more option in the Mobile publisher
		
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		//7.Switch to the next window using Windowhandles.
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		List<String> winlist = new ArrayList<String>(windowhandles);
		
		driver.switchTo().window(winlist.get(1));
		
		//8.click on the confirm button in the redirecting page
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		
		driver.quit();
		
		
		
		

	
	}

}
