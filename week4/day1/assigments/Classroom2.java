package week4.day1.assigments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom2 

{

	public static void main(String[] args) 
	
	{

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement source = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		
		source.clear();
		
		source.sendKeys("Mgr Chennai Ctr",Keys.ENTER);
		
		WebElement destination = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		
		destination.clear();
		
		destination.sendKeys("Madurai Jn",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		
		WebElement table = driver.findElement(By.xpath("(//div[@id='divTrainsList']/table/tbody)[1]"));
		

		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		System.out.println("Total Number of Rows are : " + rows.size());
		
		List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));
		System.out.println("Total Number of Columns are : " + cols.size());
		
		
		for(int i=0 ; i <= rows.size();i++) 
		{
			WebElement trainname = driver.findElement(By.xpath("//div[@id='divTrainsList']/table/tbody/tr[\"+i+\"]/td[2]"));
			
			System.out.println(trainname.getText());
		
		
		}
		
		driver.close();
		
		

	}

}
