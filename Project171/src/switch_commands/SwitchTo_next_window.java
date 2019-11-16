package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_next_window 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   		//Launch chrome browse
		driver.get("https://facebook.com");     	//load webpage to browser window
		driver.manage().window().maximize();	 	//maximize browser window

		//Click Hyperlink [Hyper links open page at new window]
		driver.findElement(By.linkText("Instagram")).click();
				
		
		//Current Window Dynamic ID
		String Main_windowID=driver.getWindowHandle();
		System.out.println("Current window id is => "+Main_windowID);
		
		//Get window Runtime ID's throw webdriver script Opned.	
		Set<String> allwindows_IDS=driver.getWindowHandles();
		//Apply foreach loop
		for (String EachwindowID : allwindows_IDS) 
		{
			//Accept Condition only when NewwindowID presented
			if(!Main_windowID.equals(EachwindowID))
			{
				driver.switchTo().window(EachwindowID);
				break;
			}
		}
		
		
		System.out.println("Current focused window title is => "+driver.getTitle());
		Thread.sleep(5000);
		
		
		//Performing action at instagram window
		driver.findElement(By.name("emailOrPhone")).clear();
		driver.findElement(By.name("emailOrPhone")).sendKeys("9030248855");
		
		//Get Controla back to main page
		driver.switchTo().window(Main_windowID);
		
		
		System.out.println("Homepage Facebook title is => "+driver.getTitle());
		
		
		
		
		
		
	}

}
