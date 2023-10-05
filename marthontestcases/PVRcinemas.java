package week2.marthontestcases;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRcinemas 

{

	public static void main(String[] args) throws InterruptedException 
	
	{
	
		//01) Launch the Url  https://www.pvrcinemas.com/
		
		ChromeDriver driver = new ChromeDriver();
		
        driver.get("https://www.pvrcinemas.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//03) Select the City -->chennai
		
		driver.findElement(By.xpath("//input[@name='search-cities']")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		
		//04) Select the Genre-->Action
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		//02) Click  on Movie Library
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		
		//04) Select the Genre-->Animation
		WebElement source = driver.findElement(By.xpath("//label[text()='Genre']/following::select"));
		Select sourcedd = new Select(source);
	    sourcedd.selectByVisibleText("ANIMATION");
	    
	    //05) Select the Language-->english
	    WebElement source1 = driver.findElement(By.xpath("//label[text()='Language']/following::select"));
		Select sourcedd1 = new Select(source1);
	    sourcedd1.selectByVisibleText("ENGLISH");
	    
	    //06) Click on Apply
	    driver.findElement(By.xpath("(//div[@class='form-group']/following::button)[10]")).click();
		
		//07) Click on first resulting animation movie
	    Thread.sleep(8000);
	    WebElement temp = driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/div/div[2]/app-movie-library/section/div[1]/div[2]/div[1]/div[1]"));
	    temp.click();
	    
	    //08) Click proceed to book
	    WebElement temp1 = driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/div/div[2]/app-movie-detail/section/div/div/div[1]/div[2]/button"));
	    temp1.click();
	   
	    //09) Enter  all  the fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
	    WebElement source2 = driver.findElement(By.xpath("//*[@id=\"cinemaName\"]"));
		Select sourcedd2 = new Select(source2);
	    sourcedd2.selectByVisibleText("PVR Theyagaraja Thiruvanmiyur Chennai");
	    
	    driver.findElement(By.xpath("//*[@id=\"datepicker-input\"]/div/ngx-datepicker/div/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"datepicker-input\"]/div/ngx-datepicker/div/div/div[2]/div[2]/span[14]")).click();
	    
	    
	    WebElement source3 = driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/div/div[2]/app-movie-booking/section/div/form/div/div/div/div/div[3]/div[1]/select"));
		Select sourcedd3 = new Select(source3);
	    sourcedd3.selectByVisibleText("06:00 PM - 09:00 PM");
	    
	    driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/div/div[2]/app-movie-booking/section/div/form/div/div/div/div/div[3]/div[2]/input")).sendKeys("4");
	    
	    driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/div/div[2]/app-movie-booking/section/div/form/div/div/div/div/div[4]/div[1]/input")).sendKeys("S.Harish");
	    
	    driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/div/div[2]/app-movie-booking/section/div/form/div/div/div/div/div[4]/div[2]/input")).sendKeys("harish.sistla@gmail.com");
	    
	    driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/div/div[2]/app-movie-booking/section/div/form/div/div/div/div/div[5]/div[1]/input")).sendKeys("9515158936");
	    
	    WebElement source4 = driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/div/div[2]/app-movie-booking/section/div/form/div/div/div/div/div[5]/div[2]/select"));
		Select sourcedd4 = new Select(source4);
	    sourcedd4.selectByVisibleText("Yes");
	    
	    driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/div/div[2]/app-movie-booking/section/div/form/div/div/div/div/div[6]/div/input")).sendKeys("NIL");
	    
	    
	    //10) Click on copy to self 
	    
	    driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/div/div[2]/app-movie-booking/section/div/form/div/div/div/div/div[7]/div[1]/label")).click();
	    
	    //11) Click on  Send Request
	    
	    driver.findElement(By.xpath("//*[@id=\"main__wrapper\"]/app-root/app-full-layout/div/div[2]/app-movie-booking/section/div/form/div/div/div/div/div[7]/div[2]/button")).click();
	    
	    //12) Click cancel 
	    
	    driver.findElement(By.xpath("(//*[@id=\"otp-form\"]/li[9]/button[2])[2]")).click();
	    
	    //13) Close the OTP dialog
	    
	    driver.findElement(By.xpath("/html/body/div[4]/div/button")).click();
	    
	    //14) Verify the title of the page
	    
	    String titles = driver.getTitle();
		
		System.out.println(titles);
		
	    
	    
	    

	}

}
