package findelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_Dropdown_Options 
{

	public static void main(String[] args)
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		String Cities[]= {"Please select state first"
				,"South Andaman"
				,"Guntur"
				,"East Siang"
				,"Guwahati"
				,"Gaya"};
		
		
		//IDentify state dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
				

	}

}
