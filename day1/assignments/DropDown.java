package week2.day1.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
	
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/select.xhtml");
		
		
		WebElement selectui = driver.findElement(By.className("ui-selectonemenu"));
		Select selectuiid = new Select(selectui);
	    selectuiid.selectByVisibleText("Selenium");
	    
	    driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-icon')])[12]")).click();
	    driver.findElement(By.xpath("(//li[text() = 'India'])")).click();
	    
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//label[contains(text(),'Select City')]")).click();

		driver.findElement(By.xpath("//li[@data-label='Bengaluru']")).click();

		// Choose a Course from the dropdown

		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();

		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();

		// Choose a language from the dropdown

		driver.findElement(By.xpath("//label[text()='Select Language']")).click();

		driver.findElement(By.xpath("//li[text()='English']")).click();

		// select 2 irrespective of the language chosen

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//label[text()='Select Values']")).click();

		driver.findElement(By.xpath("//li[text()='Two']")).click();
	    
	    
	    
	        

	}

}
