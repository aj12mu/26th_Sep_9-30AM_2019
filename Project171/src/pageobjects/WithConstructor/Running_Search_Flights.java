package pageobjects.WithConstructor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Running_Search_Flights 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		Flight_Search FS=new Flight_Search(driver);
		FS.Verify_Flights_Search_Page_Header();
		FS.Flight_Oneway_Search();

	}

}
