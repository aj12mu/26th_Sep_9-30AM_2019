package switch_commands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException 
	{
		

		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get All dynamic window ID's
		Set<String> Allwindow_IDS=driver.getWindowHandles();
		//Apply foreach to iterate for all windows
		for (String EachWindow_ID : Allwindow_IDS) 
		{
			driver.switchTo().window(EachWindow_ID);
			//Get Current Window title
			String Runtime_title=driver.getTitle();
			
			//Accept condition on expected title match.
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break;  //Break iteration when expected title match
			}
			
		}
		
		
		
		System.out.println("Current Focused window is => "+driver.getTitle());
	}

}
