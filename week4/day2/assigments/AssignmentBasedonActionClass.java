package week4.day2.assigments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentBasedonActionClass 
{

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		
		//Switch to Frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		//Draggable WebElement(source)
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		//Dropble WebElement (Target)
		
		WebElement drop = driver.findElement(By.id("droppable"));
		
		//Drag and Drop
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag, drop).perform();
		

	}

}
