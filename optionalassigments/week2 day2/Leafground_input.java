package week2.day2.assignments;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Leafground_input 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		

		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://leafground.com/input.xhtml");
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		System.out.println("Type your name");
		
		driver.findElement(By.xpath("//h5[text()='Type your name']/following::input[1]"));
		
		System.out.println("Append Country to this City.");
		
		WebElement append = driver.findElement(By.xpath("//h5[text()='Append Country to this City.']/following::input[1]"));
	
		String attribute = append.getAttribute("value");
		
		append.sendKeys(attribute + "Vizag");
		
		System.out.println("Verify if text box is disabled");
		
		boolean selected = driver.findElement(By.xpath("//h5[text()='Verify if text box is disabled']/following::input[1]")).isSelected();
		
		if(!selected) 
		
		{
		
			System.out.println("Disabled");
		
		}
		
		else 
		
		{
		
			System.out.println("Enabled");
		
		}
		
		System.out.println("Clear the typed text.");
		
		driver.findElement(By.xpath("//h5[text()='Clear the typed text.']/following::input[1]")).clear();
		
		System.out.println("Retrieve the typed text.");
		
		String typedtext = driver.findElement(By.xpath("//h5[text()='Retrieve the typed text.']/following::input[1]")).getAttribute("value");
		
		System.out.println(typedtext);
		
		System.out.println("Type email and Tab. Confirm control moved to next element.");
		
		driver.findElement(By.xpath("//h5[text()='Type email and Tab. Confirm control moved to next element.']/following::input[1]")).sendKeys("testleaf@gmail.com",Keys.TAB);
		
		WebElement activeelement = driver.switchTo().activeElement();
		
		String text = activeelement.getText();
		
		if(text.contains("About yourself")) 
			
		{
			
			System.out.println("Control Moved");
			
		}
		
		else 
			
		{
			
			System.out.println("Control did't moved");
			
		}
		
		System.out.println("Type about yourself");
		
		activeelement.sendKeys("I am a Software Tester");
		
		System.out.println("Text Editor");
		
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Test Leaf");
		
		System.out.println("Just Press Enter and confirm error message*");
		
		driver.findElement(By.xpath("//h5[text()='Just Press Enter and confirm error message*']/following::input[2]")).sendKeys(Keys.ENTER);
		
		String error = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		
		if(error.contains("Age is mandatory")) 
		{
			System.out.println("conformed error Message");
			
		}
		
		else
			
		{
			
			System.out.println("Not conformed error Message ");
			
		}
		
		System.out.println("Click and Confirm Label Position Changes");
		
		WebElement label = driver.findElement(By.xpath("//h5[text()='Click and Confirm Label Position Changes']/following::input[1]"));
		
		org.openqa.selenium.Point location = label.getLocation();
		
		label.click();
		
		org.openqa.selenium.Point Location2 = label.getLocation();
		
		if(!location.equals(Location2))
			
		{
			
			System.out.println("Position Changed");
			
		}
		
		else 
		
		{
			
			System.out.println("Position Not Changed");
			
		}
		
		
		System.out.println("Type your name and choose the third option");
		
		WebElement type = driver.findElement(By.xpath("//h5[text()='Type your name and choose the third option']/following::input[1]"));
		
		type.sendKeys("testleaf");
		
		Thread.sleep(1000);
		
		WebElement findElement = driver.findElement(By.xpath("(//span[@class='ui-autocomplete-query'])[1]"));
				
		Actions builder = new Actions(driver);
		
		builder.moveToElement(findElement).perform();
		
		Thread.sleep(1000);
		
		for(int i=0;i<3;i++) 
		{
			type.sendKeys(Keys.DOWN);
		}
		
		type.sendKeys(Keys.ENTER);
		
		
		System.out.println("Type your DOB (mm/dd/yyyy) and confirm date chosen");

		driver.findElement(By.xpath("//h5[contains(text(),'Type your DOB')]/following::input[1]")).sendKeys("05.10.1990");
		
		
		System.out.println("Type number and spin to confirm value changed");
		
		WebElement spin = driver.findElement(By.xpath("//h5[contains(text(),'Type number')]/following::input[1]"));
		
		spin.sendKeys("5");
		
		String attribute2 = spin.getAttribute("value");
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']")).click();
		
		String attribute3 = spin.getAttribute("value");
		
		if(!attribute2.equals(attribute3)) 
		
		{
			
			System.out.println("Confirmed Value Changed");
			
		}
		
		else 
		
		{
			
			System.out.println("Confirmed Value Not Changed");
			
		}
		
		
		System.out.println("Type random number (1-100) and confirm slider moves correctly");
		
		org.openqa.selenium.Point location3 = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui')]")).getLocation();
		
		driver.findElement(By.xpath("//h5[contains(text(),'Type random number')]/following::input[1]")).sendKeys("60");
		
		org.openqa.selenium.Point location4 = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle ui')]")).getLocation();
		
		if(!location3.equals(location4)) 
		
		{
			
			System.out.println("Sliders moved correctly");
			
		}
		
		else 
		
		{
			
			System.out.println("Sliders did not moved correctly");
			
		}
		
		System.out.println("Click and Confirm Keyboard appears");
		
		driver.findElement(By.xpath("//h5[contains(text(),'Click and Confirm Keyboard appears')]/following::input[1]")).click();
		
		boolean displayed = driver.findElement(By.xpath("//div[contains(@class,'ui-widget ui-widget-content ui-corner-all ui-shadow keypad')]")).isDisplayed();
		
		if(displayed) 
		
		{
			
			System.out.println("Keyboard Displayed");
			
		}
		
		else 
		
		{
			
			System.out.println("Keyboard did not Displayed");
			
		}
		
		
		System.out.println("Custom Toolbar");
		
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("TestLeaf");
		
		
		
			
		
		
		
		
		
		
		
		
		
			
		

	}

}
