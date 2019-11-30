package pageobjects.With_Super_Constructor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Hotel_Search {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		Hotel_Search HS=new Hotel_Search(driver);
		HS.Hotels_page_link.click();
		HS.Verify_Hotel_search_page_title();
		
		

	}

}
