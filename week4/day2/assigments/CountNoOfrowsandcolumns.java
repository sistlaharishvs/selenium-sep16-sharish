package week4.day2.assigments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfrowsandcolumns
{

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/tags/table/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
		
		List<WebElement> cols = driver.findElements(By.xpath("//div[@class='render']/table/thead/tr/th"));
		
		System.out.println("Number of Rows in the Table are : " + rows.size());
		
		System.out.println("Number of Columns in the Table are : " + cols.size());
		
		
		
		

	}

}
