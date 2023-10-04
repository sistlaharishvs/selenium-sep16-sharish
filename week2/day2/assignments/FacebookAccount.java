package week2.day2.assignments;

//Step 1: Download and set the path
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccount 

{

	public static <WebElemant> void main(String[] args) 
	
	{
		//Step 2: Launch the chrome browser
		
        ChromeDriver driver =new ChromeDriver();
		
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create new account")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Sanvay Ram");
		
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Raghunath");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9515158936");
		
		// Step 10: Enter the password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Mynewworld@2023");
		
		// Step 11: Handle all the three drop downs
		//Day
		WebElement dobday = driver.findElement(By.id("day"));
		Select date = new Select(dobday);
		date.selectByIndex(12);
		
		//Month
		WebElement dobmon = driver.findElement(By.id("month"));
		Select month = new Select(dobmon);
		month.selectByVisibleText("Mar");
		
		//Year
		
		WebElement dobyear = driver.findElement(By.id("year"));
		Select year = new Select(dobyear);
		year.selectByVisibleText("1990");
		
		// Step 12: Select the radio button "Female"
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		}

}
