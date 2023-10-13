package week4.marthontestcases;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tatacliq 

{

	public static void main(String[] args) throws InterruptedException, IOException
	
	{
		
		ChromeDriver driver = new ChromeDriver();
		
		//1. Load the url as https://www.tatacliq.com/
		
		driver.get("https://www.tatacliq.com/");
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
		
		//2. MouseHover on 'Brands'
		
		Actions build = new Actions(driver);
		
		WebElement brands = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		
		build.moveToElement(brands).perform();
		
		
		//3. MouseHover on 'Watches & Accessories'
		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Actions build1 = new Actions(driver);
		build1.moveToElement(watch).perform();
		
		//4. Choose the first option from the 'Featured brands'.
		
		driver.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]")).click();
		
		//5. Select sortby: New Arrivals
		
		driver.findElement(By.xpath("//div[@class='SelectBoxDesktop__base']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div/select/option[4]")).click();
		
		//6. choose men from catagories filter.
		
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilName']")).click();
		
		//7. print all price of watches
		
		String textMen = driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilName']")).getText();
		
		if("Men".equalsIgnoreCase(textMen)) 
		
		{
		
			System.out.println("Men watch filter clicked");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilName']")).click();			  
		  
		}
		
		else 
		
		{
			  
			System.out.println("Men watch filter is not selected");
		  
		}
		
		Thread.sleep(2000);
		
		List<WebElement> priceList = driver.findElements(By.xpath("//h3[@class='ProductDescription__boldText']"));
		
		List<String> comparePrice = new ArrayList<String>();
		  
		 
		  for(int i=0; i<priceList.size();i++) {
			  if(i%2!=0) {
			  System.out.println(priceList.get(i).getText().substring(1));
			  comparePrice.add(priceList.get(i).getText().substring(1).trim());
			  }
			  
		  } 
		  
		  
		  List<Integer> compareprice1 = new ArrayList<Integer>();
		  
		  for(String S:comparePrice) 
		  {
			
			  compareprice1.add(Integer.valueOf(S));
			  
		  }
		  
		  
		  //8. click on the first resulting watch.
		  
		  driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]")).click();
		  
		  //9. compare two price are similar
		  
		  System.out.println(compareprice1);
		  
		  System.out.println(compareprice1.get(0)+" "+compareprice1.get(1));
		  
		  if (compareprice1.get(0).equals(compareprice1.get(1))) 
		  {
			 
			  System.out.println("1st & 2nd price are both are same price");		  
			
			  System.out.println("1st watch " +compareprice1.get(0));
			
			  System.out.println("2nd watch " +compareprice1.get(1));
		
		  }
		  
		  else 
		  {
			
			  System.out.println("1st & 2nd price are both are different price");
			  
			  System.out.println("1st watch " +compareprice1.get(0));
				
			  System.out.println("2nd watch " +compareprice1.get(1));
		  
		  }
		  
		  
		  Set<String> windowHandles = driver.getWindowHandles();
		 
		  System.out.println("Active windows are "+windowHandles.size());
		  
		  List<String> windowHandles1=new ArrayList<String>(windowHandles);
		  
		  driver.switchTo().window(windowHandles1.get(1));
		  
		  
		  //10. click Add to cart and get count from the cart icon.
		  
		  driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		  
		  
		  //11. Click on the cart
		  
		  driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
		  
		  //12. Take a snap of the resulting page
		  
					
		  Thread.sleep(3000);
		  
		  File screenshot = driver.getScreenshotAs(OutputType.FILE);
			
			
		  File dest = new File("./snap/Tatacliq.png");
			
			
		  FileUtils.copyFile(screenshot, dest);	
		  
		  
		
		  //13. All the opened windows one by one.
		  
		  driver.switchTo().window(windowHandles1.get(1)).close();
		  
		  driver.switchTo().window(windowHandles1.get(0));
		  
		  System.out.println(driver.getTitle());
		  
		  driver.close();
		  
			
		

	}

}
