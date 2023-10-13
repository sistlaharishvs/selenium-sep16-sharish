package week4.day2.assigments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PrintValuesInTheTable 
{

	public static void main(String[] args) 
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/tags/table/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
		
		List<WebElement> cols = rows.get(1).findElements(By.xpath("//div[@class='render']/table/thead/tr/th"));
		
		System.out.println("The number of Rows in the tabel are : " + rows.size());
		
		System.out.println("The number of columns in the tabel are : "+cols.size());
		
		
		System.out.println("*******************************************************");
		System.out.println("The tabel heder Values");
		System.out.println("*******************************************************");
		
		for(int j=0;j<cols.size()-3;++j) 
		{
			WebElement rowData=driver.findElement(By.xpath("//*[@id=\"post-315\"]/div/div[2]/table/thead/tr"));
			System.out.println(rowData.getText());
		
		}
		
		System.out.println("*******************************************************");
		System.out.println("From First Row all Column Values");
		System.out.println("*******************************************************");
		
		
		
		for(int i=1;i<cols.size()-2;i++) 
		{
			WebElement rowData1=driver.findElement(By.xpath("//*[@id=\"post-315\"]/div/div[2]/table/tbody/tr[1]"));
			System.out.println(rowData1.getText());
		}
		
		System.out.println("*******************************************************");
		System.out.println("From Second Row all Column Values");
		System.out.println("*******************************************************");
		
		
		for(int k=2;k<cols.size()-1;k++) 
		{
			WebElement rowData2=driver.findElement(By.xpath("//*[@id=\"post-315\"]/div/div[2]/table/tbody/tr[2]"));
			System.out.println(rowData2.getText());
		
		}
		
	
	
	}

}
