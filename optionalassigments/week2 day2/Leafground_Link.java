package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground_Link 

{

	public static void main(String[] args) 
	
	{
	
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/link.xhtml");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();
		
		String titel = driver.getTitle();
		
		if (titel.contains("Dashboard")) 
		{
			System.out.println("Dashboard Confirmed");
		}
		else
		{
			System.out.println("Dashboard not Confirmed");
		}
		
		driver.navigate().back();
		
		String attribute = driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']")).getAttribute("a");
		
		System.out.println(attribute);
		
		driver.findElement(By.xpath("//a[text()='Broken?']")).click();
		
		String titel2 = driver.getTitle();
		
		if (titel2.contains("404")) 
		{
			System.out.println("Broken");
		}
		else
		{
			System.out.println("Not Broken");
		}
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[2]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='How many links in this page?']")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='How many links in this layout?']")).click();
		
		driver.navigate().back();
		
		
		
		
		
		
		
		


	}

}
