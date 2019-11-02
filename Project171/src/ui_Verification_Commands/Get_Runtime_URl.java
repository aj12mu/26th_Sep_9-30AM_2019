package ui_Verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_URl 
{

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://seleniumhq.org");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		String Exp_url="https://www.seleniumhq.org/";
		
		//Capture runtime url
		String Runtime_url=driver.getCurrentUrl();
				
		if(Runtime_url.equals(Exp_url))
		{
			System.out.println("Expected url presented for selenium homepage");
			
			WebElement Download_tab=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
			Download_tab.click();
			
			if(driver.getCurrentUrl().contains("download/"))
				System.out.println("expected url presented, Downlaod page verified");
			else
				System.out.println("expected url not presented, download page not verified");
		}
		else
		{
			System.out.println("Wrong url presnted for selenium hompage");
		}
	
	}

}
