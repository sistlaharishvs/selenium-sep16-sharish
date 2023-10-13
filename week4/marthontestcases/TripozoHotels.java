package week4.marthontestcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;

public class TripozoHotels 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		
		
		//1. Load the url as https://www.tripozo.com/
		
		driver.get("https://www.tripozo.com/");
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Click on the 'Hotels' tab.
		
		driver.findElement(By.xpath("(//li[@class='ant-menu-item ant-menu-item-only-child md-hide'])[1]")).click();
		
		//3. Enter 'Goa' from the select city and choose 'Goa, India'.
		
		driver.findElement(By.xpath("(//input[@id='CityData'])[1]")).sendKeys("Goa");
		
		driver.findElement(By.xpath("//span[text()='Goa']")).click();
		
		
		//4. Choose 'Tommorow date' from the Check-In and 'Day after tommorow date' from the Check-Out.
		
		driver.findElement(By.xpath("//input[@id='checkin_checkout']")).click();
		
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[2]/td[6]/div")).click();
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[3]/div/div/form/div/div[2]/div/div/div[2]/div/div/div/div[3]/input")).click();
		
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div[2]/div/div[1]/div/div[2]/table/tbody/tr[2]/td[7]")).click();
		
		//5. Click on the 'Search button'
		
		driver.findElement(By.xpath("//button[contains(@class,'ant-btn ant-btn')]")).click();
		

		Thread.sleep(1000);
		
			
		//6. Choose 'Air Conditioning' , 'Laundry Facility' , 'parking' , 'Restaurant' from the 'Amenities' filter.
		
		//choosing 'Air Conditioning'
		
		driver.findElement(By.xpath("//span[text()='Air Conditioning']")).click();
		
		//choosing 'Laundry Facility'
		
		driver.findElement(By.xpath("//span[text()='Laundry Facility']")).click();
		
		//choosing 'parking'
		
		driver.findElement(By.xpath("//span[text()='Parking']")).click();
		
		//choosing 'Restaurant'
		
		driver.findElement(By.xpath("//span[text()='Restaurant']")).click();
		
		//7. Choose '5 Star rating' from the 'Star Rating' filter.
		
		driver.findElement(By.xpath("(//ul[@class='ant-rate ant-rate-disabled starRating'])[5]")).click();
		
		//8. Click 'Choose' button from the first resulting Hotels.
		
		driver.findElement(By.xpath("(//span[text()='Choose'])[1]")).click();
		
		//9. Verify the check-In date from the 'Searched Criteria'.
		
		String checkindate = driver.findElement(By.xpath("(//p[@class='pl-2'])[1]")).getText();
		
		System.out.println(checkindate);
		
		//10. Click on the 'View Rooms' near to the 'Searched Criteria'.
		
		driver.findElement(By.xpath("//button[@class='blocklink nowrap blnk-small blnkB fs12 pdl5 rnd5']")).click();
		
		//11. Click on the first resulting 'Choose Room' button.
		
		driver.findElement(By.xpath("(//span[text()='Choose Room '])[1]")).click();
		
		//12. Click on the 'Room Amenities & Details' and take a snap of the pop-up window and close.
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='blocklink blnk-small blnkB rnd5 pdlr5 pointer'])[2]")).click();
		

		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./snap/TripozoHotels.png");
		
		FileUtils.copyFile(screenshot, dest);	
		
		driver.findElement(By.xpath("//span[@class='anticon anticon-close ant-modal-close-icon']")).click();
		
		driver.close();
		
		
		

	}

}
