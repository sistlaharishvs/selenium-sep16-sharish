package week4.day2.assigments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa 
{

	public static void main(String[] args) throws InterruptedException
	
	{

		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver();
		
		
		//1) Go to  https://www.nykaa.com/
		
		driver.get("https://www.nykaa.com");
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//2) Mouseover on Brands and Search L'Oreal Paris
		
		Actions build = new Actions(driver);
		
		WebElement findbrands = driver.findElement(By.xpath("//a[text()='brands']"));
		
		build.moveToElement(findbrands).perform();
		
		
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oréal Paris");
		
		Thread.sleep(3000);
		//3) Click L'Oreal Paris
		driver.findElement(By.xpath("//a[contains(text(),'Oréal Paris')]")).click();
		
		
		//4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		
		String titel = driver.getTitle();
		
		if(titel.contains("L'Oréal Paris")) 
		{
			
			System.out.println("The Page titel contains L'Oréal Paris ");
					
		}
		
		else 
		{
			
			System.out.println("The Page titel dose not contains L'Oréal Paris ");
			
		}
		
		//5) Click sort By and select customer top rated
		
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		
		driver.findElement(By.xpath("(//label[@class='control control-radio'])[4]")).click();
		
		//6) Click Category and click Hair->Click haircare->Shampoo
		
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		
		
		//7) Click->Concern->Color Protection
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		
		driver.findElement(By.xpath("//span[text()='Colour Protection']")).click();
		
		//8)check whether the Filter is applied with Shampoo
		
		String filter = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
		
		if(filter.equals("Shampoo")) 
		{
			System.out.println("Filter has been applied for Shampoo");
		}
		
		else 
		{
			System.out.println("filter has not been apllied for Shampoo");
		}
	
		
		WebElement AllProducts = driver.findElement(By.xpath("//div[text()='All Products']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(AllProducts).perform();
		
		//9) Click on L'Oreal Paris Colour Protect Shampoo
		
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		
		//10) GO to the new window and select size as 180ml
		

		Set<String> handels = driver.getWindowHandles();
		
		List<String> uniqHan = new ArrayList<String>(handels);
		
		driver.switchTo().window(uniqHan.get(1));
		
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		
		
		//11) Print the MRP of the product
		
		String mrp = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		
		mrp = mrp.replaceAll("[^0-9]","");
				
		System.out.println("The MRP of the Product is : " + mrp);
		
		
		//12) Click on ADD to BAG
		
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		
		//13) Go to Shopping Bag 
		
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		
		//14) Print the Grand Total amount
		
		Thread.sleep(1500);
		
		driver.switchTo().frame(0);
		
		String grand = driver.findElement(By.xpath("(//p[text()='You Pay']//following::span)[3]")).getText();
		
		grand=grand.replaceAll("[^0-9]","");
		
		System.out.println("The total Price that customer has to pay is : " + grand);
		
		//15) Click Proceed
		
		Thread.sleep(1000);		
		
		WebElement proceed = driver.findElement(By.xpath("//span[text()='Proceed']"));
		
		Actions click = new Actions(driver);
		
		click.click(proceed).perform();
		
		//16) Click on Continue as Guest
		
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div/div[1]/span/img")).click();
		
		
		//17) Check if this grand total is the same in step 14
		
		
		String pricedetail = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/p")).getText();
		
		pricedetail = pricedetail.replaceAll("[^0-9]","");
		
		System.out.println("The total price Customer has to pay is : " + pricedetail);
		
		
		if(grand.equals(pricedetail)) 
		{
			
			System.out.println("The prices are matching");
			
		}
		
		else 
		
		{
			
			System.out.println("The prices are not matching");
			
		}
		
		//18) Close all windows
		driver.quit();
		

	}

}
