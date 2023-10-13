package week4.day1.assigments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LeafgroundWindowhandles 
{

	public static void main(String[] args) throws InterruptedException 
	{

		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> windowhandels = driver.getWindowHandles();
		
		List<String> winlist = new ArrayList<String>(windowhandels);
		
		driver.switchTo().window(winlist.get(1));
		
		String titel = driver.getTitle();
		
		if(titel.contains("Dashboard")) 
		{
			
			System.out.println("Dashboard window has been opened");
			
		}
		
		else 
		{
			
			System.out.println("Dashboard window did't been opened");
		}
		
		Thread.sleep(4000);
		
		driver.switchTo().window(winlist.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowhandels2 = driver.getWindowHandles();
		
		List<String> winlist2 = new ArrayList<String>(windowhandels2);
		
		System.out.println("The number of windows opened are :"+ " "+winlist2.size());
		
		driver.switchTo().window(winlist2.get(0));
		
		
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		
		for(int i=0; i < winlist2.size();i++) 
		{
			if(i != 0) 
			{
				driver.switchTo().window(winlist2.get(i));
				driver.close();
			}
			
		}
		
		Thread.sleep(4000);
		
		driver.switchTo().window(winlist2.get(0));
		
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(6));
		
	
		

	}

}
