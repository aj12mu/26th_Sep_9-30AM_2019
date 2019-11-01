package ui_Verification_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_runtime_title {

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		String path="browser_drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://seleniumhq.org");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		String Exp_title="Selenium - Web Browser Automation";
		
		//Capture runtime title
		String Runtime_title=driver.getTitle();
		
		
		//Verify Expected and Runtime title equal comparision
		boolean flag=Runtime_title.equals(Exp_title);
		System.out.println("Selenium page title verification status is => "+flag);

	}

}
