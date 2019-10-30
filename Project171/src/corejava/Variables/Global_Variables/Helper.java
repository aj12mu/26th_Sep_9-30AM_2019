package corejava.Variables.Global_Variables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper 
{
	WebDriver driver;
	String browser_path=null;
	String url;
	int Implicit_timeout;
	String UID;
	String PWD;
	
	public void launch_browser()
	{
		 System.setProperty("webdriver.chrome.driver", browser_path);
		 driver=new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Implicit_timeout, TimeUnit.SECONDS);
	}
	
	public void user_signin()
	{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(UID);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(PWD);
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}
