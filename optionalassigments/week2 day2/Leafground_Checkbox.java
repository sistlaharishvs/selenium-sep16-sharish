package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class Leafground_Checkbox 
{

	public static void main(String[] args) throws InterruptedException 

	{
	   
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/checkbox.xhtml");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//input[@id='j_idt87:ajaxTriState_input']"));
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		boolean enabled = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled();
		
		if(enabled) 
		{
		
			System.out.println("checkbox is not disabled ");
			
		}
		else
		{
			System.out.println("checkbox is disabled");
		}
		
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
		
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
			
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']"));

	}

}
