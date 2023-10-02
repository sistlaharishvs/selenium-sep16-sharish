package week2.day2.assignments;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Leafground_button 
{

	public static void main(String[] args) 
	
	{
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/button.xhtml");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println("Click and Confirm title.");
		
		driver.findElement(By.xpath("(//h5[text()= 'Click and Confirm title.']/following::button)[1]")).click();
		
		driver.navigate().back();
		
		System.out.println("Confirm if the button is disabled:");
		
		boolean enabled = driver.findElement(By.xpath("//span[text()= 'Disabled']")).isEnabled();
		
		if(!enabled) 
			
		{
			
			System.out.println("Disabled");
			
		}
		
		else 
			
		{
			
			System.out.println("Enabled");
			
		}
		
		System.out.println("Find the position of the Submit button");
		
		org.openqa.selenium.Point location = driver.findElement(By.xpath("(//span[text()= 'Submit'])[1]")).getLocation();
		
		System.out.println(location);

		
		System.out.println("Find the Save button color:");
		
		String cssvalue = driver.findElement(By.xpath("//span[text()= 'Save']")).getCssValue("color");
		
		System.out.println(cssvalue);
		
		System.out.println("Find the height and width of this button:");
		
		org.openqa.selenium.Dimension size = driver.findElement(By.xpath("(//span[text()= 'Submit'])[2]")).getSize();
		
		System.out.println(size);
		
		System.out.println("Mouse over and confirm the color changed:");
		
		WebElement success = driver.findElement(By.xpath("(//span[text()= 'Success'])[1]"));
		
		String color1 = success.getCssValue("background-color");
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(success).perform();
		
		String color2 = success.getCssValue("background-color");
		
		if(!color1.equals(color2)) 
		
		{
			System.out.println("Color Changed");
			
		}
		
		else
			
		{
			
			System.out.println("Color Not Changed");
		}
		
		System.out.println("Click Image Button and Click on any hidden button:");
		
		driver.findElement(By.xpath("//span[text()= 'Image']")).click();
		
		driver.findElement(By.xpath("//div[@class='card ui-fluid']")).click();
		
		System.out.println("How many rounded buttons are there?");
		
		WebElement roundedbutton = driver.findElement(By.xpath("//button[contains(@class,'rounded-button ')]"));
		
		org.openqa.selenium.Dimension size2 = roundedbutton.getSize();
		
		System.out.println(size2);
		


	}

}
