package week4.day2.assigments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal 

{

	public static void main(String[] args) throws InterruptedException, IOException 
	
	{
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver();
		
		//1. Launch https://www.snapdeal.com/
		
		driver.get("https://www.snapdeal.com/");
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//2. Go to Mens Fashion
		
		Actions build = new Actions(driver);
		
		WebElement mensfashion = driver.findElement(By.xpath("(//Span[@class='catText'])[1]"));
		
		build.moveToElement(mensfashion).perform();
		
		//3. Go to Sports Shoes
		WebElement sportshoes = driver.findElement(By.xpath("(//Span[@class='linkTest'])[1]"));
		
		build.moveToElement(sportshoes).perform();
		
		sportshoes.click();
		
		//4. Get the count of the sports shoes
		
		String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		
		System.out.println("The Count of the Sports Shoes is : " + count);
		
		//5. Click Training shoes
		
		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		
		//6. Sort by Low to High
		
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div/div[3]/div[2]/ul/li[2]")).click();
		
		//7. Check if the items displayed are sorted correctly
		
		Thread.sleep(1000);
		
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]"));
		
		build.dragAndDropBy(slider, 58, 0).release().perform();
		
		
		
		WebElement slider2 = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]"));
		
		Thread.sleep(2000);
		build.dragAndDropBy(slider2, -55, 0).release().perform();
		
		
		//8.Select the price range (900-1200)
		
		WebElement range1 = driver.findElement(By.xpath("(//input[@class='input-filter'])[1]"));
		
		Thread.sleep(1000);
		
		range1.clear();
		
		range1.sendKeys("900");
		
		WebElement range2 = driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
		
		Thread.sleep(1000);
		
		range2.clear();
		
		range2.sendKeys("1200");
		
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		//9.Filter with color Navy 
		
		//Navy color items are not available 
		
		//10 verify the all applied filters 
		
		String filter = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[2]/div/div[7]/div[1]/div/a")).getText();
		
		System.out.println("The applied filters are : " + filter);
		
		//11. Mouse Hover on first resulting Training shoes
		
		WebElement first = driver.findElement(By.xpath("//*[@id=\"663022142457\"]/div[2]/a/picture/img"));
		
		build.moveToElement(first).perform();
		

		//12. click QuickView button
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();
		
		//13. Print the cost and the discount percentage
		Thread.sleep(1000);
		String cost = driver.findElement(By.xpath("//span[@class='strikee ']")).getText();
		
		System.out.println("The cost of the Shoes are :" + cost);
		
		Thread.sleep(1000);
		String discount = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		
		System.out.println("The discounted price of the Shoes are : " + discount);
		
		
		//14. Take the snapshot of the shoes.
		Thread.sleep(1000);

		driver.switchTo().frame(0);
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./snap/SnapDeal.png");
		
		FileUtils.copyFile(screenshot, dest);
		
		//15. Close the current window
		driver.close();
		
		//16. Close the main window
		driver.quit();
		
		
		
		
		


	}

}
