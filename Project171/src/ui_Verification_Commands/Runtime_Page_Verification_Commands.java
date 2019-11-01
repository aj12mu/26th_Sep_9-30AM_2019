package ui_Verification_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Page_Verification_Commands {

	public static void main(String[] args) 
	{
		
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://cleartrip.com");       //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		//Capture current window runtime title
		String Runtime_title=driver.getTitle();
		System.out.println("Current window title is => "+Runtime_title);

		//Capture current window runtime url
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("Current window url is => "+Runtime_url);
		
		//Capture Current window pagesource
		String Runtime_page_Source=driver.getPageSource();
		//System.out.println(Runtime_page_Source);
		
		//capture current window dynamic ID
		String Runtime_WindowID=driver.getWindowHandle();
		System.out.println(Runtime_WindowID);
	}

}
