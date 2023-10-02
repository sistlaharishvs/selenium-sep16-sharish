package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground_Radio
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/radio.xhtml");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println("Your most favorite browser");
		
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		System.out.println("UnSelectable");
		
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		
		System.out.println("Find the default select radio button");
		
		String text = driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::input[@checked='checked']/following::label")).getText();
		
		System.out.println(text);
		
		boolean selected = driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::span")).isSelected();
		
		if (!selected) 
		
		{
           
		    driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::span")).click();
			
		}

	}

}
