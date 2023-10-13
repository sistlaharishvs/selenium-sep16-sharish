package week4.day2.assigments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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

public class Myntra 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	
	{
		
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver();
		
		//1) Open https://www.myntra.com/
		
		driver.get("https://www.myntra.com/");
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2) Mouse hover on MeN
		
		Actions build = new Actions(driver);
		
		WebElement findmen = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[text()='Men']"));
		
		build.moveToElement(findmen).perform();
		
		//3) Click Jackets 
		
		driver.findElement(By.xpath("(//ul[@class='desktop-navBlock']/li/a[text()='Jackets'])[1]")).click();
		
		//4) Find the total count of item 
		
		String texttot = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		
		int totalcount1 = Integer.parseInt(texttot.replaceAll("[^0-9]", ""));
		
		System.out.println("Total Count of Items are : " + totalcount1);
		
		List<WebElement> findcat = driver.findElements(By.xpath("//ul[@class='categories-list']//label"));
		
		int cattot = 0;
		
		for(int i = 1 ; i <= findcat.size(); i++ ) 
		{
			
			String textname = driver.findElement(By.xpath("(//ul[@class='categories-list']//label)[\"+i+\"]")).getText();
			
			String textcount = driver.findElement(By.xpath("(//ul[@class='categories-list']//label)[\"+i+\"]/span")).getText();
			
			int tcount = Integer.parseInt(textcount.replaceAll("[^0-9]", ""));
			
			cattot+=tcount;
			
			System.out.println(textname);
			
		}
		
		System.out.println("Sum of Catagires are : " + cattot);
		
		//5) Validate the sum of categories count matches
		
		if(totalcount1==cattot) 
		{
			System.out.println("Both Total Head count and Catagires Count matched");
		}
		
		else 
		{
			System.out.println("Both Total Head count and Catagires did't matched");
		}
		
		
		//6) Check jackets
		
		driver.findElement(By.xpath("(//ul[@class='categories-list']//label)[1]/div")).click();
		
		//7) Click + More option under BRAND
		
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		
		//8) Type Duke and click checkbox
		
		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
		
		driver.findElement(By.xpath("//ul[@class='FilterDirectory-list']/li[2]//div")).click();
		
		//9) Close the pop-up x
		driver.findElement(By.xpath("//span[contains(@class,'FilterDirectory-close')]")).click();
		
		//10) Confirm all the Coats are of brand Duke
		
		List<WebElement> brandname = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h3"));
		
		Set<String> sethead = new LinkedHashSet<String>();
		
		Thread.sleep(1000);
		
		for(int j=1; j <= brandname.size();j++) 
		{
			String texthead = driver.findElement(By.xpath("//div[@class='product-productMetaInfo']/h3[\"+j+\"]")).getText();
			
			sethead.add(texthead);
			
		}
		
		if(sethead.size()==1) 
		{
			System.out.println("All the costs are of Brand Duke only and we have Brand Duke in the filter");
		}
		
		else 
		{
			System.out.println("No there are other brand costs are involved");
		}
		
		
		//11) Sort by Better Discount
		
		driver.findElement(By.xpath("//div[@class='sort-sortBy']/span[2]")).click();
		
		WebElement better = driver.findElement(By.xpath("(//label[@class='sort-label '])[4]"));
		
		build.moveToElement(better).perform();
		
		better.click();
		
		Thread.sleep(2000);
		
	   //12) Find the price of first displayed item
		
		WebElement firstprice = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]"));
		
		build.moveToElement(firstprice).perform();
		
		String fprice = firstprice.getText();
		
		System.out.println("The Price of first Displayed Item is : "+ fprice);
		
		
		//Click on the first product
	
		firstprice.click();
		
		//13) Take a screen shot
		

		Set<String> handels = driver.getWindowHandles();
		
		List<String> uniqHan = new ArrayList<String>(handels);
		
		driver.switchTo().window(uniqHan.get(1));
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./snap/myntra1.png");
		
		FileUtils.copyFile(screenshot, dest);	
		
		//14) Click on WishList Now
		
		driver.findElement(By.xpath("//div[contains(@class,' pdp-add-to-wishlist pdp-button ')]")).click();
		
		//15) Close Browser
		
		driver.quit();
		
		
	}

}
