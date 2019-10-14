package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Webdriver_Script 
{

	public static void main(String[] args)
	{
		
		//set Runtime environment variable for chrome
		String path="D:\\sunill\\26th_Sep_9-30_AM\\Project171\\browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//launch chrome browser
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("http://facebook.com");
		//maximize browser window
		driver.manage().window().maximize();
	
		//Identify email textbox and type text init
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");

		//Identify password textbox and type text init
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Hello123456");
		
		//Identify login button and perform click
		driver.findElement(By.id("u_0_b")).click();
	}

}
