package week4.day1.assigments;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		
		
		//1.Load the URL https://www.amazon.in/
		
		driver.get("https://www.amazon.in");
		
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		//2.search as oneplus 9 pro 5G
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		//3.Get the price of the first product
		
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		
		String price1 = price.getText();
		
		System.out.println(price1);
		
		
		//4. Print the number of customer ratings for the first displayed product
		
		WebElement customerratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
		
		String customerratings1 = customerratings.getText();
		
		System.out.println(customerratings1);
		
		
		//5. Click the first text link of the first image
		
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		
		//6. Take a screen shot of the product displayed
		
		WebElement firstproduct =driver.findElement(By.xpath("(//div[@class='a-section'])[2]"));		

		File elesrc= driver.getScreenshotAs(OutputType.FILE);
		
		File eledestn = new File("./snap/pic.png");
		
		try {
			FileUtils.copyFile(elesrc, eledestn);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		firstproduct.click();
		
		Set<String> handels = driver.getWindowHandles();
		
		List<String> uniqHan = new ArrayList<String>(handels);
		
		driver.switchTo().window(uniqHan.get(1));
		
		File src= driver.getScreenshotAs(OutputType.FILE);
		
		File destn = new File("./snap/pic.png");
		
		try {
			FileUtils.copyFile(src, destn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(driver.getTitle());
		
				
		//7. Click 'Add to Cart' button
		
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[5]")).click();
		
		
		//8. Get the cart subtotal and verify if it is correct.
		
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]")).click();
		
		WebElement subtotal = driver.findElement(By.xpath("//*[@id=\"sc-subtotal-label-activecart\"]"));
		
		String subtot = subtotal.getText();
		
		System.out.println("The Cart Sub total is : " + subtot);
		
		WebElement total = driver.findElement(By.xpath("//*[@id=\"sc-subtotal-label-buybox\"]"));
		
		String tot = total.getText();
		
		if(subtot.equals(tot)) 
		{
			System.out.println("Subtotal Matched");
		}
		else 
		{
			System.out.println("Subtotaldidnotmatched");
		}
		
		
		//9.close the browser
		
		driver.quit();
		
		
		

		
		

	}

}
