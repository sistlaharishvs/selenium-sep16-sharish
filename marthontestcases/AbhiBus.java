package week2.marthontestcases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AbhiBus 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		// 01) Launch Chrome/Edge/Firefox/Safari browser
				ChromeDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.abhibus.com/"); // 02) Load https://www.abhibus.com/
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//span[text()='Buses']")).click(); 
				
				// 03) Click on Bus
				// 04) Type "Chennai" in the FROM text box
				// 05) Click the first option from the pop up box
				driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Chennai");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//li[text()='Chennai']")).click();
																				

				// 06) Type "Vizag" in the TO text box
				// 07) Click the first option from the pop up box
				driver.findElement(By.xpath("(//div[@class=' col']/input)[2]")).sendKeys("Vizag");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[text()='Vizag']")).click();
				
				// 08) Select tomorrow s date in the Date field----check on how to pick the date
				// from date picker??
				driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
				driver.findElement(By.xpath("//span[text()='22']")).click();
			
				// 09) Click Search Buses & Print the name of the first resulting bus (use.getText())
				// 10) Choose SLEEPER in the left menu from Bus Type
				driver.findElement(By.linkText("Search")).click();
				driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
				
				// 11) Print the first resulting bus seat count(Example:35 Seats Available)(use.getText())
				WebElement firstSearchResult = driver.findElement(By.xpath("(//h5[@class='title'])[1]"));
				String firstBus = firstSearchResult.getText();
				System.out.println("First in the search list is " + firstBus);
				Thread.sleep(2000);

				// 12) Click SelectSeat
				driver.findElement(By.xpath("(//button[@class='btn bus-info-btn filled primary sm inactive button'])[1]"))
						.click();// show seat
				WebElement seatsAvailable = driver.findElement(By.xpath("(//div[@class='text-grey'])[1]"));
				System.out.println(seatsAvailable.getText());
				Thread.sleep(2000);

				// 13) Choose any one Available seat
				WebElement seatSelection = driver.findElement(By.xpath("(//td[@rowspan='1']//span)[34]"));
				seatSelection.click();
				
				// 14) Print Seats Selected ,Total Fare
				String selectedSeat1 = driver.findElement(By.xpath("(//span[@class='text-primary'])[1]")).getText();
				System.out.println("seat selected is " + selectedSeat1);
				String baseFare = driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
				System.out.println("seat selected is " + baseFare);
				
				// 15) Select Boarding Point and Dropping Point (Select class)
				driver.findElement(By.xpath("//input[@placeholder='Search Boarding Point']")).sendKeys("Perungudi");
				driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			    // Select selectBoarding1 = new Select(selectBoarding);
			    //selectBoarding1.selectByVisibleText("");
		       	driver.findElement(By.xpath("//input[@placeholder='Search Dropping Point']"))
						.sendKeys("NAD KOTHA ROAD");
				driver.findElement(By.xpath("(//input[@class='primary  '])[2]")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				// 16) Get the Title of the page(use .getTitle())
				System.out.println(driver.getTitle());
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				// 17) Close the browser (driver.close())
     			//driver.close();

		

	}
}
