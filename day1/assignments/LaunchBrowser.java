package week2.day1.assignments;




import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser 

{

	public static void main(String[] args) 
	{
	
        ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();

	}

}
