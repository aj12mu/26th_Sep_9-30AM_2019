package switch_commands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_To_Window_Using_ITerator 
{

	public static void main(String[] args) throws Exception 
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
				
		//Get All dynamic window ID's
		Set<String> Allwindow_IDS=driver.getWindowHandles();
		
		//Convert all Set of String into Iterations
		Iterator<String> itr=Allwindow_IDS.iterator();
		
		//Iterator allow every individual object from Itreration using next keyword.
		String W1=itr.next();
		driver.switchTo().window(W1);
		System.out.println("W1 title is => "+driver.getTitle());
		
		String W2=itr.next();
		driver.switchTo().window(W2);
		System.out.println("W2 title is => "+driver.getTitle());
		
		String W3=itr.next();
		driver.switchTo().window(W3);
		System.out.println("W3 title is => "+driver.getTitle());
		
		
		
		
		
		

	}

}
