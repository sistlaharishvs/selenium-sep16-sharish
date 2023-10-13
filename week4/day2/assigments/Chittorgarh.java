package week4.day2.assigments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh 
{

	public static void main(String[] args)
	
	{		

		ChromeDriver driver = new ChromeDriver();
		
		//1. Launch the URL https://www.chittorgarh.com/
		
		driver.get("https://www.chittorgarh.com/");
		
		driver.manage().window().maximize();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Click on stock market
		
		driver.findElement(By.xpath("(//a[@class='ch-bar-item ch-button'])[4]")).click();
		
		//3. Click on NSE bulk Deals
		
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
		
		//4. Get all the Security names
		
		//5. Ensure whether there are duplicate Security names
		
		List<WebElement> secquirty = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']"));
		
		List<String> list = new ArrayList<String>();
		
		for(int i=0; i < secquirty.size(); i++ ) 
		{
			
			list.add(secquirty.get(i).getText());
			
		}
		
		Set<String> set = new HashSet<String>(list);
		
		if(list.size() != set.size()) 
		{
			System.out.println("The Table data contains duplicate vales");
		}
		
		else
		{
			System.out.println("The Table data dose not contains duplicate vales");
		}

	}

}
