package week4.day2.assigments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundFrame 

{

	public static void main(String[] args) 
	
	{
		

		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://leafground.com/frame.xhtml");
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
		
		WebElement firstframe = driver.findElement(By.xpath("(//button[text()='Click Me'])[1]"));
		
		firstframe.click();
		
		System.out.println(firstframe.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		
		driver.switchTo().frame("frame2");
		
		WebElement second = driver.findElement(By.xpath("(//button[text()='Click Me'])[1]"));
		
		second.click();
		
		System.out.println(second.getText());
		
		driver.switchTo().defaultContent();
		
		List<WebElement> outer = driver.findElements(By.tagName("iframe"));
		
		int count = outer.size();
		
		System.out.println("Total number of frames on the page are : " + count);
		
		int count1=0;
		
		count1 = count+outer.size();
		
		for(int i=0; i < outer.size() ; i++) 
		{
			driver.switchTo().frame(i);
			
			List<WebElement> inner = driver.findElements(By.tagName("iframe"));
			
			count1 = count + inner.size();
			
			driver.switchTo().defaultContent();
							
		}
		
		System.out.println(count1);
		
		
		

	}

}
