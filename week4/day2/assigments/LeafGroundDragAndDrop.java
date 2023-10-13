package week4.day2.assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundDragAndDrop 

{

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDropBy(drag, 100, 100).perform();
		
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		
		WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		builder.dragAndDrop(source, target).perform();
		
		WebElement col1 = driver.findElement(By.xpath("//span[text()='Category']"));
		
		WebElement col2 = driver.findElement(By.xpath("//Span[text()='Quantity']"));
		
		builder.dragAndDrop(col1, col2).perform();
		
		WebElement row1 = driver.findElement(By.xpath("(//td[text()='Bamboo Watch'])[2]"));
		
		WebElement row2 = driver.findElement(By.xpath("(//td[text()='Black Watch'])[2]"));
		
		builder.dragAndDrop(row1, row2).perform();
		
		String titel = driver.getTitle();
		
		System.out.println(titel);

	}

}
